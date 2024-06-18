package duc.daominh.interview_test.data.repository.localSource

import duc.daominh.interview_test.data.model.CountryDetailsModel
import kotlinx.coroutines.flow.Flow

interface RestCountryLocalDataSource {
    suspend fun saveCountryToDB(countryDetailsModel: CountryDetailsModel)
    fun getAllSavedCountry(): Flow<List<CountryDetailsModel>>
}