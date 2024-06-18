package duc.daominh.interview_test.data.model


import com.google.gson.annotations.SerializedName

data class CountryModel(
    @SerializedName("country")
    val listCountryData: ArrayList<CountryModelItem> = arrayListOf()
) {
    data class CountryModelItem(
        @SerializedName("flags")
        val flags: Flags = Flags(),
        @SerializedName("name")
        val name: Name = Name(
            nativeName = Name.NativeName()
        )
    ) {
        data class Flags(
            @SerializedName("png")
            val png: String = "",
            @SerializedName("svg")
            val svg: String = "",
            @SerializedName("alt")
            val alt: String = ""
        )

        data class Name(
            @SerializedName("common")
            val common: String = "",
            @SerializedName("official")
            val official: String = "",
            @SerializedName("nativeName")
            val nativeName: NativeName
        ) {
            data class NativeName(
                @SerializedName("vie")
                val vie: Vie = Vie()
            ) {
                data class Vie(
                    @SerializedName("official")
                    val official: String = "",
                    @SerializedName("common")
                    val common: String = ""
                )
            }
        }
    }
}