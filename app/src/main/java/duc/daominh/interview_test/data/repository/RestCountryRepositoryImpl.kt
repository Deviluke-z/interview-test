package duc.daominh.interview_test.data.repository

import duc.daominh.interview_test.data.model.CountryDetailsModel
import duc.daominh.interview_test.data.modelJson.CountryDetailsModelJson
import duc.daominh.interview_test.data.modelJson.CountryModelJson
import duc.daominh.interview_test.data.repository.localSource.RestCountryLocalDataSource
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class RestCountryRepositoryImpl(
    private val restCountryRemoteDataSource: RestCountryRemoteDataSource,
    private val restCountryLocalDataSource: RestCountryLocalDataSource
) : RestCountryRepository {

    override suspend fun getAllCountry(): Flow<Resource<ArrayList<CountryModelJson>>> = flow {
        emit(responseToResourceList(restCountryRemoteDataSource.getAllCountry()))
    }

    override suspend fun getCountryByName(name: String): Flow<Resource<ArrayList<CountryDetailsModelJson>>> =
        flow {
            emit(responseToResource(restCountryRemoteDataSource.getCountryByName(name)))
        }

    override suspend fun saveCountryToDB(countryDetailsModel: CountryDetailsModel) {
        restCountryLocalDataSource.saveCountryToDB(countryDetailsModel)
    }

    override fun getAllSavedCountry(): Flow<List<CountryDetailsModel>> {
        return restCountryLocalDataSource.getAllSavedCountry()
    }

    private fun responseToResourceList(response: Response<ArrayList<CountryModelJson>>): Resource<ArrayList<CountryModelJson>> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Failure(response.message())
    }

    private fun responseToResource(response: Response<ArrayList<CountryDetailsModelJson>>): Resource<ArrayList<CountryDetailsModelJson>> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Failure(response.message())
    }
}