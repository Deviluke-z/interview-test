package duc.daominh.interview_test.domain.repository

import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import duc.daominh.interview_test.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface RestCountryRepository {
    suspend fun getAllCountry(): Flow<Resource<ArrayList<CountryModelJsonItem>>>

    suspend fun getCountryByName(name: String): Flow<Resource<CountryModelJsonItem>>
}