package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.data.db.CountryDAO
import duc.daominh.interview_test.data.repository.localSource.RestCountryLocalDataSource
import duc.daominh.interview_test.data.repository.localSource.RestCountryLocalDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideRestCountryLocalDataSource(countryDAO: CountryDAO): RestCountryLocalDataSource {
        return RestCountryLocalDataSourceImpl(countryDAO)
    }
}