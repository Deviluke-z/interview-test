package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.data.repository.RestCountryRepositoryImpl
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import duc.daominh.interview_test.domain.repository.RestCountryRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRestCountryRepository(
        restCountryRemoteDataSource: RestCountryRemoteDataSource
    ): RestCountryRepository {
        return RestCountryRepositoryImpl(restCountryRemoteDataSource)
    }
}