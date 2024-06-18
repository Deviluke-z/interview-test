package duc.daominh.interview_test.data.repository.remoteSourceImpl

import duc.daominh.interview_test.data.api.CountryAPIService
import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import retrofit2.Response

class RestCountryRemoteDataSourceImpl(
    private val countryAPIService: CountryAPIService
) : RestCountryRemoteDataSource {

    override suspend fun getAllCountry(): Response<ArrayList<CountryModelJsonItem>> {
        return countryAPIService.getAllCountry()
    }

    override suspend fun getCountryByName(name: String): Response<CountryModelJsonItem> {
        return countryAPIService.getCountryByName(name)
    }
}