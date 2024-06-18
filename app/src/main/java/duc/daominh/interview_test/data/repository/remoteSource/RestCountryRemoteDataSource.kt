package duc.daominh.interview_test.data.repository.remoteSource

import duc.daominh.interview_test.data.modelJson.CountryDetailsModelJson
import duc.daominh.interview_test.data.modelJson.CountryModelJson
import retrofit2.Response

interface RestCountryRemoteDataSource {
    suspend fun getAllCountry(): Response<ArrayList<CountryModelJson>>
    suspend fun getCountryByName(name: String): Response<ArrayList<CountryDetailsModelJson>>
}