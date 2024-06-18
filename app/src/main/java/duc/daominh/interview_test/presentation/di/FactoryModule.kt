package duc.daominh.interview_test.presentation.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.domain.usecases.GetAllCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetAllSavedCountryUseCase
import duc.daominh.interview_test.domain.usecases.GetCountryByName
import duc.daominh.interview_test.domain.usecases.SaveCountryToDBUseCase
import duc.daominh.interview_test.presentation.viewmodel.MainViewModelFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideMainViewModelFactory(
        application: Application,
        getAllCountryUseCase: GetAllCountryUseCase,
        getCountryByName: GetCountryByName,
        saveCountryToDBUseCase: SaveCountryToDBUseCase,
        getAllSavedCountryUseCase: GetAllSavedCountryUseCase
    ): MainViewModelFactory {
        return MainViewModelFactory(
            application,
            getAllCountryUseCase,
            getCountryByName,
            saveCountryToDBUseCase,
            getAllSavedCountryUseCase
        )
    }
}