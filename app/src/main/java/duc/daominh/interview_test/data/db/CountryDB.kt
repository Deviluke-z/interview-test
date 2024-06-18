package duc.daominh.interview_test.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import duc.daominh.interview_test.data.model.CountryDetailsModel

@Database(
    entities = [CountryDetailsModel::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class CountryDB : RoomDatabase() {
    abstract fun getCountryDAO(): CountryDAO
}