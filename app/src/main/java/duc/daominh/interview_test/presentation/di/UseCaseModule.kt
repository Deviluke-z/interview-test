package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetAllSavedCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName
import duc.daominh.interview_test.domain.usecases.SaveCountryToDBUseCase
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

    @Singleton
    @Provides
    fun provideSaveCountryToDBUseCase(
        restCountryRepository: RestCountryRepository
    ): SaveCountryToDBUseCase {
        return SaveCountryToDBUseCase(restCountryRepository)
    }

    @Singleton
    @Provides
    fun provideGetAllSavedCountryUseCase(
        restCountryRepository: RestCountryRepository
    ): GetAllSavedCountryUseCase {
        return GetAllSavedCountryUseCase(restCountryRepository)
    }
}