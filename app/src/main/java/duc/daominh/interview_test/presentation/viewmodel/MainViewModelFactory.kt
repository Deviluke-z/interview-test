package duc.daominh.interview_test.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetAllSavedCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName
import duc.daominh.interview_test.domain.usecases.SaveCountryToDBUseCase

class MainViewModelFactory(
    private val application: Application,
    private val getAllCountryUseCase: GetAllCountryUseCase,
    private val getCountryByName: GetCountryByName,
    private val saveCountryToDBUseCase: SaveCountryToDBUseCase,
    private val getAllSavedCountryUseCase: GetAllSavedCountryUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            application,
            getAllCountryUseCase,
            getCountryByName,
            saveCountryToDBUseCase,
            getAllSavedCountryUseCase
        ) as T
    }
}