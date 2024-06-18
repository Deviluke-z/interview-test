package duc.daominh.interview_test.data.repository.remoteSource

import duc.daominh.interview_test.data.modelJson.CountryModelJson
import retrofit2.Response

interface RestCountryRemoteDataSource {
    suspend fun getAllCountry(): Response<CountryModelJson>
    suspend fun getCountryByName(name : String): Response<CountryModelJson>
}