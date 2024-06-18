package duc.daominh.interview_test.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.presentation.adapter.ListAllCountryAdapter
import duc.daominh.interview_test.presentation.adapter.SearchedCountryAdapter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {

    @Singleton
    @Provides
    fun provideListAllCountryAdapter(): ListAllCountryAdapter {
        return ListAllCountryAdapter()
    }

    @Singleton
    @Provides
    fun provideSearchedCountryAdapter(): SearchedCountryAdapter {
        return SearchedCountryAdapter()
    }
}