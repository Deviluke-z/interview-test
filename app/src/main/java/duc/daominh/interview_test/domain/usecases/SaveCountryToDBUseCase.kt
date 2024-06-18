package duc.daominh.interview_test.domain.usecases

import duc.daominh.interview_test.data.model.CountryDetailsModel
import duc.daominh.interview_test.domain.repository.RestCountryRepository

class SaveCountryToDBUseCase(private val restCountryRepository: RestCountryRepository) {

    suspend fun execute(countryDetailsModel: CountryDetailsModel) =
        restCountryRepository.saveCountryToDB(countryDetailsModel)
}