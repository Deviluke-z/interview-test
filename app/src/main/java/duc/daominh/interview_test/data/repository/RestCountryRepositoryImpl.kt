package duc.daominh.interview_test.data.repository

import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class RestCountryRepositoryImpl(
    private val restCountryRemoteDataSource: RestCountryRemoteDataSource
) : RestCountryRepository {

    override suspend fun getAllCountry(): Flow<Resource<ArrayList<CountryModelJsonItem>>> = flow {
        emit(responseToResourceList(restCountryRemoteDataSource.getAllCountry()))
    }

    override suspend fun getCountryByName(name: String): Flow<Resource<CountryModelJsonItem>> = flow {
        emit(responseToResource(restCountryRemoteDataSource.getCountryByName(name)))
    }

    private fun responseToResourceList(response: Response<ArrayList<CountryModelJsonItem>>): Resource<ArrayList<CountryModelJsonItem>> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Failure(response.message())
    }

    private fun responseToResource(response: Response<CountryModelJsonItem>): Resource<CountryModelJsonItem> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Failure(response.message())
    }
}