package duc.daominh.interview_test.domain.usecases

import android.util.Log
import duc.daominh.interview_test.InterviewTestApplication
import duc.daominh.interview_test.data.modelJson.CountryModelJson
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow

class GetCountryByName(private val restCountryRepository: RestCountryRepository) {

    suspend fun execute(name: String): Flow<Resource<CountryModelJson>> {
        Log.d(InterviewTestApplication.DEBUG_TAG, "GetCountryByName: execute()")
        return restCountryRepository.getCountryByName(name)
    }
}