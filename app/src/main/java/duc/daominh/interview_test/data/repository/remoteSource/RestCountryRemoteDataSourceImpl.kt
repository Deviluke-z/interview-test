package duc.daominh.interview_test.data.repository.remoteSource

import duc.daominh.interview_test.data.api.CountryAPIService
import duc.daominh.interview_test.data.modelJson.CountryDetailsModelJson
import duc.daominh.interview_test.data.modelJson.CountryModelJson
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import retrofit2.Response

class RestCountryRemoteDataSourceImpl(
    private val countryAPIService: CountryAPIService
) : RestCountryRemoteDataSource {

    override suspend fun getAllCountry(): Response<ArrayList<CountryModelJson>> {
        return countryAPIService.getAllCountry()
    }

    override suspend fun getCountryByName(name: String): Response<ArrayList<CountryDetailsModelJson>> {
        return countryAPIService.getCountryByName(name)
    }
}