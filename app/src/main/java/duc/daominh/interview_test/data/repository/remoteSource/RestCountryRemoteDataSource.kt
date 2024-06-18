package duc.daominh.interview_test.data.repository.remoteSource

import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import retrofit2.Response

interface RestCountryRemoteDataSource {
    suspend fun getAllCountry(): Response<ArrayList<CountryModelJsonItem>>
    suspend fun getCountryByName(name: String): Response<CountryModelJsonItem>
}