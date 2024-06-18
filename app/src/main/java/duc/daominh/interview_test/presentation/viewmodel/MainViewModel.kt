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
import duc.daominh.interview_test.data.modelJson.CountryDetailsModelJson
import duc.daominh.interview_test.data.modelJson.CountryModelJson
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

    private val _allCountryList = MutableLiveData<Resource<ArrayList<CountryModelJson>>>()
    val allCountryList: LiveData<Resource<ArrayList<CountryModelJson>>> = _allCountryList

    private val _countryBySearch = MutableLiveData<Resource<ArrayList<CountryDetailsModelJson>>>()
    val countryBySearch: LiveData<Resource<ArrayList<CountryDetailsModelJson>>> = _countryBySearch

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

    /*
    * Due to the API does not support status and message param in every object
    * So it's hard to update in case of the "Not Found" result
    * Example: search for England
    * Return a different object: {"status":404,"message":"Not Found"}
    */
    fun fetchCountryBySearch(name: String) = viewModelScope.launch {
        Log.d(DEBUG_TAG, "MainViewModel: fetchCountryBySearch()")
        if (isNetworkAvailable(application)) {
            getCountryByName.execute(name)
                .flowOn(Dispatchers.IO)
                .catch {
                    _countryBySearch.value = Resource.Failure(it.message.toString())
                }
                .collect { result ->
                    result.data?.let {
                        _countryBySearch.value = Resource.Success(it)
                    }
                }
        } else {
            _countryBySearch.value = Resource.Failure(INTERNET_NOT_AVAILABLE_MESSAGE)
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