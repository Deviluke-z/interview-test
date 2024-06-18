package duc.daominh.interview_test.data.repository.localSource

import duc.daominh.interview_test.data.db.CountryDAO
import duc.daominh.interview_test.data.model.CountryDetailsModel
import kotlinx.coroutines.flow.Flow

class RestCountryLocalDataSourceImpl(
    private val countryDAO: CountryDAO
) : RestCountryLocalDataSource {
    override suspend fun saveCountryToDB(countryDetailsModel: CountryDetailsModel) {
        countryDAO.insert(countryDetailsModel)
    }

    override fun getAllSavedCountry(): Flow<List<CountryDetailsModel>> {
        return countryDAO.getAllSavedCountry()
    }
}