package duc.daominh.interview_test.presentation.viewmodel

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import duc.daominh.interview_test.InterviewTestApplication.Companion.DEBUG_TAG
import duc.daominh.interview_test.InterviewTestApplication.Companion.INTERNET_NOT_AVAILABLE_MESSAGE
import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class MainViewModel(
    private val application: Application,
    private val getAllCountryUseCase: GetAllCountryUseCase,
    private val getCountryByName: GetCountryByName
) : AndroidViewModel(application) {

    private val _allCountryList = MutableLiveData<Resource<ArrayList<CountryModelJsonItem>>>()
    val allCountryList: LiveData<Resource<ArrayList<CountryModelJsonItem>>> = _allCountryList

    suspend fun fetchCountryListFromRemote() = viewModelScope.launch {
        Log.d(DEBUG_TAG, "MainViewModel: fetchCountryListFromRemote()")
        if (isNetworkAvailable(application)) {
            getAllCountryUseCase.execute()
                .flowOn(Dispatchers.IO)
                .catch {
                    _allCountryList.value = Resource.Failure(it.message.toString())
                }
                .collect { result ->
                    result.data?.let {
                        _allCountryList.value = Resource.Success(it)
                    }
                }
        } else {
            _allCountryList.value = Resource.Failure(INTERNET_NOT_AVAILABLE_MESSAGE)
        }
    }


    private fun isNetworkAvailable(context: Context?): Boolean {
        Log.d(DEBUG_TAG, "MainViewModel: isNetworkAvailable()")
        var result = false

        if (context == null) {
            return false
        }

        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?

        connectivityManager?.run {
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)?.run {
                result = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    else -> false
                }
            }
        }
        return result
    }
}