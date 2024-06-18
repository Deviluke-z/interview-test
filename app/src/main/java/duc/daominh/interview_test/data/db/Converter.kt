package duc.daominh.interview_test.data.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import duc.daominh.interview_test.data.model.CountryDetailsModel.CoatOfArms
import duc.daominh.interview_test.data.model.CountryDetailsModel.Flags
import duc.daominh.interview_test.data.model.CountryDetailsModel.Name
import java.lang.reflect.Type

class Converter {

    @TypeConverter
    fun fromName(name: Name): String {
        return Gson().toJson(name)
    }

    @TypeConverter
    fun toName(name: String): Name {
        return Gson().fromJson(name, Name::class.java)
    }

    @TypeConverter
    fun fromFlags(flags: Flags): String {
        return flags.png
    }

    @TypeConverter
    fun toFlags(flags: String): Flags {
        return Flags(flags)
    }

    @TypeConverter
    fun fromCOA(coa: CoatOfArms): String {
        return coa.png
    }

    @TypeConverter
    fun toCOA(coa: String): CoatOfArms {
        return CoatOfArms(coa)
    }

    @TypeConverter
    fun fromStringArray(value: ArrayList<String>): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun toStringArray(value: String): ArrayList<String> {
        val listType: Type = object : TypeToken<ArrayList<String>>() {}.type
        return Gson().fromJson(value, listType)
    }
}