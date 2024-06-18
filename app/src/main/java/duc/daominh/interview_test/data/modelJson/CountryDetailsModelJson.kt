package duc.daominh.interview_test.data.modelJson


import com.google.gson.annotations.SerializedName
import duc.daominh.interview_test.data.model.CountryDetailsModel

data class CountryDetailsModelJson(
    @SerializedName("name")
    val name: Name?,
    @SerializedName("tld")
    val tld: List<String?>?,
    @SerializedName("cca2")
    val cca2: String?,
    @SerializedName("ccn3")
    val ccn3: String?,
    @SerializedName("cca3")
    val cca3: String?,
    @SerializedName("cioc")
    val cioc: String?,
    @SerializedName("independent")
    val independent: Boolean?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("unMember")
    val unMember: Boolean?,
    @SerializedName("currencies")
    val currencies: Currencies?,
    @SerializedName("idd")
    val idd: Idd?,
    @SerializedName("capital")
    val capital: ArrayList<String?>?,
    @SerializedName("altSpellings")
    val altSpellings: List<String?>?,
    @SerializedName("region")
    val region: String?,
    @SerializedName("subregion")
    val subregion: String?,
    @SerializedName("languages")
    val languages: Languages?,
    @SerializedName("translations")
    val translations: Translations?,
    @SerializedName("latlng")
    val latlng: ArrayList<Float?>?,
    @SerializedName("landlocked")
    val landlocked: Boolean?,
    @SerializedName("borders")
    val borders: List<String?>?,
    @SerializedName("area")
    val area: Int?,
    @SerializedName("demonyms")
    val demonyms: Demonyms?,
    @SerializedName("flag")
    val flag: String?,
    @SerializedName("maps")
    val maps: Maps?,
    @SerializedName("population")
    val population: Int?,
    @SerializedName("gini")
    val gini: Gini?,
    @SerializedName("fifa")
    val fifa: String?,
    @SerializedName("car")
    val car: Car?,
    @SerializedName("timezones")
    val timezones: ArrayList<String?>?,
    @SerializedName("continents")
    val continents: List<String?>?,
    @SerializedName("flags")
    val flags: Flags?,
    @SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms?,
    @SerializedName("startOfWeek")
    val startOfWeek: String?,
    @SerializedName("capitalInfo")
    val capitalInfo: CapitalInfo?,
    @SerializedName("postalCode")
    val postalCode: PostalCode?
) {
    data class Name(
        @SerializedName("common")
        val common: String?,
        @SerializedName("official")
        val official: String?,
        @SerializedName("nativeName")
        val nativeName: NativeName?
    ) {
        data class NativeName(
            @SerializedName("deu")
            val vie: Vie?
        ) {
            data class Vie(
                @SerializedName("official")
                val official: String?,
                @SerializedName("common")
                val common: String?
            )
        }
    }

    data class Currencies(
        @SerializedName("EUR")
        val eUR: EUR?
    ) {
        data class EUR(
            @SerializedName("name")
            val name: String?,
            @SerializedName("symbol")
            val symbol: String?
        )
    }

    data class Idd(
        @SerializedName("root")
        val root: String?,
        @SerializedName("suffixes")
        val suffixes: List<String?>?
    )

    data class Languages(
        @SerializedName("deu")
        val deu: String?
    )

    data class Translations(
        @SerializedName("ara")
        val ara: Ara?,
        @SerializedName("bre")
        val bre: Bre?,
        @SerializedName("ces")
        val ces: Ces?,
        @SerializedName("cym")
        val cym: Cym?,
        @SerializedName("deu")
        val deu: Deu?,
        @SerializedName("est")
        val est: Est?,
        @SerializedName("fin")
        val fin: Fin?,
        @SerializedName("fra")
        val fra: Fra?,
        @SerializedName("hrv")
        val hrv: Hrv?,
        @SerializedName("hun")
        val hun: Hun?,
        @SerializedName("ita")
        val ita: Ita?,
        @SerializedName("jpn")
        val jpn: Jpn?,
        @SerializedName("kor")
        val kor: Kor?,
        @SerializedName("nld")
        val nld: Nld?,
        @SerializedName("per")
        val per: Per?,
        @SerializedName("pol")
        val pol: Pol?,
        @SerializedName("por")
        val por: Por?,
        @SerializedName("rus")
        val rus: Rus?,
        @SerializedName("slk")
        val slk: Slk?,
        @SerializedName("spa")
        val spa: Spa?,
        @SerializedName("srp")
        val srp: Srp?,
        @SerializedName("swe")
        val swe: Swe?,
        @SerializedName("tur")
        val tur: Tur?,
        @SerializedName("urd")
        val urd: Urd?,
        @SerializedName("zho")
        val zho: Zho?
    ) {
        data class Ara(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Bre(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Ces(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Cym(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Deu(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Est(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Fin(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Fra(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Hrv(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Hun(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Ita(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Jpn(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Kor(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Nld(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Per(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Pol(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Por(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Rus(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Slk(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Spa(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Srp(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Swe(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Tur(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Urd(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )

        data class Zho(
            @SerializedName("official")
            val official: String?,
            @SerializedName("common")
            val common: String?
        )
    }

    data class Demonyms(
        @SerializedName("eng")
        val eng: Eng?,
        @SerializedName("fra")
        val fra: Fra?
    ) {
        data class Eng(
            @SerializedName("f")
            val f: String?,
            @SerializedName("m")
            val m: String?
        )

        data class Fra(
            @SerializedName("f")
            val f: String?,
            @SerializedName("m")
            val m: String?
        )
    }

    data class Maps(
        @SerializedName("googleMaps")
        val googleMaps: String?,
        @SerializedName("openStreetMaps")
        val openStreetMaps: String?
    )

    data class Gini(
        @SerializedName("2016")
        val x2016: Double?
    )

    data class Car(
        @SerializedName("signs")
        val signs: List<String?>?,
        @SerializedName("side")
        val side: String?
    )

    data class Flags(
        @SerializedName("png")
        val png: String?,
        @SerializedName("svg")
        val svg: String?,
        @SerializedName("alt")
        val alt: String?
    )

    data class CoatOfArms(
        @SerializedName("png")
        val png: String?,
        @SerializedName("svg")
        val svg: String?
    )

    data class CapitalInfo(
        @SerializedName("latlng")
        val latlng: List<Double?>?
    )

    data class PostalCode(
        @SerializedName("format")
        val format: String?,
        @SerializedName("regex")
        val regex: String?
    )
}

fun CountryDetailsModelJson.Name.NativeName.Vie.toModel(): CountryDetailsModel.Name.NativeName.Vie =
    CountryDetailsModel.Name.NativeName.Vie(
        official = official ?: "",
        common = common ?: ""
    )

fun CountryDetailsModelJson.Name.NativeName.toModel(): CountryDetailsModel.Name.NativeName =
    CountryDetailsModel.Name.NativeName(
        vie = vie?.toModel() ?: CountryDetailsModel.Name.NativeName.Vie()
    )

fun CountryDetailsModelJson.Name.toModel(): CountryDetailsModel.Name =
    CountryDetailsModel.Name(
        official = official ?: "",
        common = common ?: "",
        nativeName = nativeName?.toModel() ?: CountryDetailsModel.Name.NativeName()
    )

fun CountryDetailsModelJson.Flags.toModel(): CountryDetailsModel.Flags =
    CountryDetailsModel.Flags(
        png = png ?: ""
    )

fun CountryDetailsModelJson.CoatOfArms.toModel(): CountryDetailsModel.CoatOfArms =
    CountryDetailsModel.CoatOfArms(
        png = png ?: ""
    )

fun CountryDetailsModelJson.toModel(): CountryDetailsModel =
    CountryDetailsModel(
        name = name?.toModel() ?: CountryDetailsModel.Name(),
        capital = capital?.filterNotNull().let { ArrayList(it) },
        region = region ?: "",
        flags = flags?.toModel() ?: CountryDetailsModel.Flags(),
        timezones = timezones?.filterNotNull().let { ArrayList(it) },
        coatOfArms = coatOfArms?.toModel() ?: CountryDetailsModel.CoatOfArms()
    )
