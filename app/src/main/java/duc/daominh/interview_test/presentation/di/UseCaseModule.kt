package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetAllCountryUseCase(
        restCountryRepository: RestCountryRepository
    ): GetAllCountryUseCase {
        return GetAllCountryUseCase(restCountryRepository)
    }

    @Singleton
    @Provides
    fun provideGetCountryByNameUseCase(
        restCountryRepository: RestCountryRepository
    ): GetCountryByName {
        return GetCountryByName(restCountryRepository)
    }
}