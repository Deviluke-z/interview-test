package duc.daominh.interview_test.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName

class MainViewModel(
    private val application: Application,
    private val getAllCountryUseCase: GetAllCountryUseCase,
    private val getCountryByName: GetCountryByName
) : AndroidViewModel(application) {
}