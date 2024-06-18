package duc.daominh.interview_test.presentation.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import duc.daominh.interview_test.data.db.CountryDAO
import duc.daominh.interview_test.data.db.CountryDB
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideCountryDB(application: Application): CountryDB {
        return Room.databaseBuilder(
            application,
            CountryDB::class.java,
            "country_db"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideCountryDAO(countryDB: CountryDB): CountryDAO {
        return countryDB.getCountryDAO()
    }
}