package duc.daominh.interview_test.domain.usecases

import duc.daominh.interview_test.data.model.CountryDetailsModel
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import kotlinx.coroutines.flow.Flow

class GetAllSavedCountryUseCase(private val repository: RestCountryRepository) {

    fun execute(): Flow<List<CountryDetailsModel>> {
        return repository.getAllSavedCountry()
    }
}