package duc.daominh.interview_test.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(
    tableName = "bookmarked_country"
)
data class CountryDetailsModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @SerializedName("name")
    val name: Name = Name(),
    @SerializedName("capital")
    val capital: ArrayList<String> = arrayListOf(),
    @SerializedName("region")
    val region: String = "Unavailable",
    @SerializedName("timezones")
    val timezones: ArrayList<String> = arrayListOf(),
    @SerializedName("flags")
    val flags: Flags = Flags(),
    @SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms = CoatOfArms()
) : Serializable {
    data class Name(
        @SerializedName("common")
        val common: String = "Unavailable",
        @SerializedName("official")
        val official: String = "Unavailable",
        @SerializedName("nativeName")
        val nativeName: NativeName = NativeName()
    ) {
        data class NativeName(
            @SerializedName("deu")
            val vie: Vie = Vie()
        ) {
            data class Vie(
                @SerializedName("official")
                val official: String = "Unavailable",
                @SerializedName("common")
                val common: String = "Unavailable"
            )
        }
    }

    data class Flags(
        @SerializedName("png")
        val png: String = ""
    )

    data class CoatOfArms(
        @SerializedName("png")
        val png: String = ""
    )
}

