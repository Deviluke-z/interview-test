package duc.daominh.interview_test.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import duc.daominh.interview_test.data.model.CountryDetailsModel
import kotlinx.coroutines.flow.Flow

@Dao
interface CountryDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(countryDetailsModel: CountryDetailsModel)

    @Query("SELECT * FROM bookmarked_country")
    fun getAllSavedCountry(): Flow<List<CountryDetailsModel>>
}