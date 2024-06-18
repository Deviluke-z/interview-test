package duc.daominh.interview_test.domain.usecases

import android.util.Log
import duc.daominh.interview_test.InterviewTestApplication.Companion.DEBUG_TAG
import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow

class GetAllCountryUseCase(private val restCountryRepository: RestCountryRepository) {

    suspend fun execute(): Flow<Resource<ArrayList<CountryModelJsonItem>>> {
        Log.d(DEBUG_TAG, "GetAllCountryUseCase: execute()")
        return restCountryRepository.getAllCountry()
    }
}