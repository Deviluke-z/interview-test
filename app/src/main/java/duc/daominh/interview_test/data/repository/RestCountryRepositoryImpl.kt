package duc.daominh.interview_test.data.repository

import duc.daominh.interview_test.data.modelJson.CountryModelJson
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class RestCountryRepositoryImpl(
    private val restCountryRemoteDataSource: RestCountryRemoteDataSource
) : RestCountryRepository {

    override suspend fun getAllCountry(): Flow<Resource<CountryModelJson>> = flow {
        emit(responseToResource(restCountryRemoteDataSource.getAllCountry()))
    }

    override suspend fun getCountryByName(name: String): Flow<Resource<CountryModelJson>> = flow {
        emit(responseToResource(restCountryRemoteDataSource.getCountryByName(name)))
    }

    private fun responseToResource(response: Response<CountryModelJson>): Resource<CountryModelJson> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Failure(response.message())
    }
}