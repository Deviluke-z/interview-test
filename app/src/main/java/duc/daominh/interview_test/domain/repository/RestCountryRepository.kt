package duc.daominh.interview_test.domain.repository

import duc.daominh.interview_test.data.model.CountryDetailsModel
import duc.daominh.interview_test.data.modelJson.CountryDetailsModelJson
import duc.daominh.interview_test.data.modelJson.CountryModelJson
import duc.daominh.interview_test.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface RestCountryRepository {
    suspend fun getAllCountry(): Flow<Resource<ArrayList<CountryModelJson>>>

    suspend fun getCountryByName(name: String): Flow<Resource<ArrayList<CountryDetailsModelJson>>>

    suspend fun saveCountryToDB(countryDetailsModel: CountryDetailsModel)

    fun getAllSavedCountry(): Flow<List<CountryDetailsModel>>
}