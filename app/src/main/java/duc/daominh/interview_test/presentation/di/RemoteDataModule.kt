package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.data.api.CountryAPIService
import duc.daominh.interview_test.data.db.CountryDAO
import duc.daominh.interview_test.data.repository.localSource.RestCountryLocalDataSource
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSource
import duc.daominh.interview_test.data.repository.remoteSource.RestCountryRemoteDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideRestCountryRemoteDataSource(
        countryAPIService: CountryAPIService
    ): RestCountryRemoteDataSource {
        return RestCountryRemoteDataSourceImpl(countryAPIService)
    }
}