package duc.daominh.interview_test.data.modelJson


import com.google.gson.annotations.SerializedName
import duc.daominh.interview_test.data.model.CountryModel

data class CountryModelJson(
    @SerializedName("country")
    val listCountryData: List<CountryModelJsonItem?>?
) {
    data class CountryModelJsonItem(
        @SerializedName("flags")
        val flags: Flags?,
        @SerializedName("name")
        val name: Name?
    ) {
        data class Flags(
            @SerializedName("png")
            val png: String?,
            @SerializedName("svg")
            val svg: String?,
            @SerializedName("alt")
            val alt: String?
        )

        data class Name(
            @SerializedName("common")
            val common: String?,
            @SerializedName("official")
            val official: String?,
            @SerializedName("nativeName")
            val nativeName: NativeName?
        ) {
            data class NativeName(
                @SerializedName("fra")
                val fra: Fra?,
                @SerializedName("isl")
                val isl: Isl?,
                @SerializedName("deu")
                val deu: Deu?,
                @SerializedName("ltz")
                val ltz: Ltz?,
                @SerializedName("ara")
                val ara: Ara?,
                @SerializedName("zdj")
                val zdj: Zdj?,
                @SerializedName("eng")
                val eng: Eng?,
                @SerializedName("est")
                val est: Est?,
                @SerializedName("bel")
                val bel: Bel?,
                @SerializedName("rus")
                val rus: Rus?,
                @SerializedName("kin")
                val kin: Kin?,
                @SerializedName("khm")
                val khm: Khm?,
                @SerializedName("ell")
                val ell: Ell?,
                @SerializedName("kor")
                val kor: Kor?,
                @SerializedName("mfe")
                val mfe: Mfe?,
                @SerializedName("swe")
                val swe: Swe?,
                @SerializedName("ita")
                val ita: Ita?,
                @SerializedName("div")
                val div: Div?,
                @SerializedName("bis")
                val bis: Bis?,
                @SerializedName("nya")
                val nya: Nya?,
                @SerializedName("kat")
                val kat: Kat?,
                @SerializedName("mri")
                val mri: Mri?,
                @SerializedName("nzs")
                val nzs: Nzs?,
                @SerializedName("por")
                val por: Por?,
                @SerializedName("slk")
                val slk: Slk?,
                @SerializedName("spa")
                val spa: Spa?,
                @SerializedName("lao")
                val lao: Lao?,
                @SerializedName("dan")
                val dan: Dan?,
                @SerializedName("fao")
                val fao: Fao?,
                @SerializedName("niu")
                val niu: Niu?,
                @SerializedName("mkd")
                val mkd: Mkd?,
                @SerializedName("tur")
                val tur: Tur?,
                @SerializedName("zho")
                val zho: Zho?,
                @SerializedName("jam")
                val jam: Jam?,
                @SerializedName("ber")
                val ber: Ber?,
                @SerializedName("mey")
                val mey: Mey?,
                @SerializedName("hmo")
                val hmo: Hmo?,
                @SerializedName("tpi")
                val tpi: Tpi?,
                @SerializedName("lit")
                val lit: Lit?,
                @SerializedName("ron")
                val ron: Ron?,
                @SerializedName("kir")
                val kir: Kir?,
                @SerializedName("nld")
                val nld: Nld?,
                @SerializedName("pap")
                val pap: Pap?,
                @SerializedName("vie")
                val vie: Vie?,
                @SerializedName("msa")
                val msa: Msa?,
                @SerializedName("gsw")
                val gsw: Gsw?,
                @SerializedName("roh")
                val roh: Roh?,
                @SerializedName("tha")
                val tha: Tha?,
                @SerializedName("uzb")
                val uzb: Uzb?,
                @SerializedName("dzo")
                val dzo: Dzo?,
                @SerializedName("mah")
                val mah: Mah?,
                @SerializedName("nno")
                val nno: Nno?,
                @SerializedName("nob")
                val nob: Nob?,
                @SerializedName("smi")
                val smi: Smi?,
                @SerializedName("heb")
                val heb: Heb?,
                @SerializedName("hrv")
                val hrv: Hrv?,
                @SerializedName("arc")
                val arc: Arc?,
                @SerializedName("ckb")
                val ckb: Ckb?,
                @SerializedName("jpn")
                val jpn: Jpn?,
                @SerializedName("sot")
                val sot: Sot?,
                @SerializedName("tvl")
                val tvl: Tvl?,
                @SerializedName("fin")
                val fin: Fin?,
                @SerializedName("prs")
                val prs: Prs?,
                @SerializedName("pus")
                val pus: Pus?,
                @SerializedName("tuk")
                val tuk: Tuk?,
                @SerializedName("tir")
                val tir: Tir?,
                @SerializedName("cat")
                val cat: Cat?,
                @SerializedName("hye")
                val hye: Hye?,
                @SerializedName("bar")
                val bar: Bar?,
                @SerializedName("smo")
                val smo: Smo?,
                @SerializedName("tkl")
                val tkl: Tkl?,
                @SerializedName("bjz")
                val bjz: Bjz?,
                @SerializedName("nrf")
                val nrf: Nrf?,
                @SerializedName("tsn")
                val tsn: Tsn?,
                @SerializedName("glv")
                val glv: Glv?,
                @SerializedName("fas")
                val fas: Fas?,
                @SerializedName("kal")
                val kal: Kal?,
                @SerializedName("ben")
                val ben: Ben?,
                @SerializedName("bos")
                val bos: Bos?,
                @SerializedName("srp")
                val srp: Srp?,
                @SerializedName("mlt")
                val mlt: Mlt?,
                @SerializedName("crs")
                val crs: Crs?,
                @SerializedName("sin")
                val sin: Sin?,
                @SerializedName("tam")
                val tam: Tam?,
                @SerializedName("grn")
                val grn: Grn?,
                @SerializedName("nor")
                val nor: Nor?,
                @SerializedName("ukr")
                val ukr: Ukr?,
                @SerializedName("urd")
                val urd: Urd?,
                @SerializedName("slv")
                val slv: Slv?,
                @SerializedName("bwg")
                val bwg: Bwg?,
                @SerializedName("kck")
                val kck: Kck?,
                @SerializedName("khi")
                val khi: Khi?,
                @SerializedName("ndc")
                val ndc: Ndc?,
                @SerializedName("nde")
                val nde: Nde?,
                @SerializedName("sna")
                val sna: Sna?,
                @SerializedName("toi")
                val toi: Toi?,
                @SerializedName("tso")
                val tso: Tso?,
                @SerializedName("ven")
                val ven: Ven?,
                @SerializedName("xho")
                val xho: Xho?,
                @SerializedName("zib")
                val zib: Zib?,
                @SerializedName("swa")
                val swa: Swa?,
                @SerializedName("rar")
                val rar: Rar?,
                @SerializedName("pol")
                val pol: Pol?,
                @SerializedName("ces")
                val ces: Ces?,
                @SerializedName("ind")
                val ind: Ind?,
                @SerializedName("aym")
                val aym: Aym?,
                @SerializedName("que")
                val que: Que?,
                @SerializedName("sag")
                val sag: Sag?,
                @SerializedName("pov")
                val pov: Pov?,
                @SerializedName("mon")
                val mon: Mon?,
                @SerializedName("kon")
                val kon: Kon?,
                @SerializedName("lin")
                val lin: Lin?,
                @SerializedName("lua")
                val lua: Lua?,
                @SerializedName("nau")
                val nau: Nau?,
                @SerializedName("cnr")
                val cnr: Cnr?,
                @SerializedName("mya")
                val mya: Mya?,
                @SerializedName("som")
                val som: Som?,
                @SerializedName("gle")
                val gle: Gle?,
                @SerializedName("hun")
                val hun: Hun?,
                @SerializedName("cha")
                val cha: Cha?,
                @SerializedName("nep")
                val nep: Nep?,
                @SerializedName("mlg")
                val mlg: Mlg?,
                @SerializedName("kaz")
                val kaz: Kaz?,
                @SerializedName("nfr")
                val nfr: Nfr?,
                @SerializedName("afr")
                val afr: Afr?,
                @SerializedName("her")
                val her: Her?,
                @SerializedName("hgm")
                val hgm: Hgm?,
                @SerializedName("kwn")
                val kwn: Kwn?,
                @SerializedName("loz")
                val loz: Loz?,
                @SerializedName("ndo")
                val ndo: Ndo?,
                @SerializedName("lat")
                val lat: Lat?,
                @SerializedName("sqi")
                val sqi: Sqi?,
                @SerializedName("hat")
                val hat: Hat?,
                @SerializedName("ton")
                val ton: Ton?,
                @SerializedName("aze")
                val aze: Aze?,
                @SerializedName("lav")
                val lav: Lav?,
                @SerializedName("gil")
                val gil: Gil?,
                @SerializedName("amh")
                val amh: Amh?,
                @SerializedName("pau")
                val pau: Pau?,
                @SerializedName("fij")
                val fij: Fij?,
                @SerializedName("hif")
                val hif: Hif?,
                @SerializedName("pih")
                val pih: Pih?,
                @SerializedName("tgk")
                val tgk: Tgk?,
                @SerializedName("ssw")
                val ssw: Ssw?,
                @SerializedName("tet")
                val tet: Tet?,
                @SerializedName("cal")
                val cal: Cal?,
                @SerializedName("fil")
                val fil: Fil?,
                @SerializedName("run")
                val run: Run?,
                @SerializedName("bul")
                val bul: Bul?,
                @SerializedName("nbl")
                val nbl: Nbl?,
                @SerializedName("nso")
                val nso: Nso?,
                @SerializedName("zul")
                val zul: Zul?,
                @SerializedName("hin")
                val hin: Hin?
            ) {
                data class Fra(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Isl(
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

                data class Ltz(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ara(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Zdj(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Eng(
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

                data class Bel(
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

                data class Kin(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Khm(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ell(
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

                data class Mfe(
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

                data class Ita(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Div(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bis(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nya(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kat(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mri(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nzs(
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

                data class Lao(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Dan(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Fao(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Niu(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mkd(
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

                data class Zho(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Jam(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ber(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mey(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hmo(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tpi(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Lit(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ron(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kir(
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

                data class Pap(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Vie(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Msa(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Gsw(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Roh(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tha(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Uzb(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Dzo(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mah(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nno(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nob(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Smi(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Heb(
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

                data class Arc(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ckb(
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

                data class Sot(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tvl(
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

                data class Prs(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Pus(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tuk(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tir(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Cat(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hye(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bar(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Smo(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tkl(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bjz(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nrf(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tsn(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Glv(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Fas(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kal(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ben(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bos(
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

                data class Mlt(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Crs(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Sin(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tam(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Grn(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nor(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ukr(
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

                data class Slv(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bwg(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kck(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Khi(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ndc(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nde(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Sna(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Toi(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tso(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ven(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Xho(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Zib(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Swa(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Rar(
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

                data class Ces(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ind(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Aym(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Que(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Sag(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Pov(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mon(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kon(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Lin(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Lua(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nau(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Cnr(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mya(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Som(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Gle(
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

                data class Cha(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nep(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Mlg(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kaz(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nfr(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Afr(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Her(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hgm(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Kwn(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Loz(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ndo(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Lat(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Sqi(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hat(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ton(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Aze(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Lav(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Gil(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Amh(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Pau(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Fij(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hif(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Pih(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tgk(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Ssw(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Tet(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Cal(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Fil(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Run(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Bul(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nbl(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Nso(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Zul(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )

                data class Hin(
                    @SerializedName("official")
                    val official: String?,
                    @SerializedName("common")
                    val common: String?
                )
            }
        }
    }
}

fun CountryModelJson.CountryModelJsonItem.Name.NativeName.Vie.toModel(): CountryModel.CountryModelItem.Name.NativeName.Vie =
    CountryModel.CountryModelItem.Name.NativeName.Vie(
        official = official ?: "",
        common = common ?: ""
    )

fun CountryModelJson.CountryModelJsonItem.Name.NativeName.toModel(): CountryModel.CountryModelItem.Name.NativeName =
    CountryModel.CountryModelItem.Name.NativeName(
        vie = vie?.toModel() ?: CountryModel.CountryModelItem.Name.NativeName.Vie()
    )

fun CountryModelJson.CountryModelJsonItem.Name.toModel(): CountryModel.CountryModelItem.Name =
    CountryModel.CountryModelItem.Name(
        common = common ?: "",
        official = official ?: "",
        nativeName = nativeName?.toModel() ?: CountryModel.CountryModelItem.Name.NativeName()
    )

fun CountryModelJson.CountryModelJsonItem.Flags.toModel(): CountryModel.CountryModelItem.Flags =
    CountryModel.CountryModelItem.Flags(
        png = png ?: "",
        svg = svg ?: "",
        alt = alt ?: ""
    )

fun CountryModelJson.CountryModelJsonItem.toModel(): CountryModel.CountryModelItem =
    CountryModel.CountryModelItem(
        flags = flags?.toModel() ?: CountryModel.CountryModelItem.Flags(),
        name = name?.toModel() ?: CountryModel.CountryModelItem.Name(
            nativeName = CountryModel.CountryModelItem.Name.NativeName()
        )
    )

fun CountryModelJson.toModel(): CountryModel =
    CountryModel(
        listCountryData = listCountryData?.filterNotNull()?.map {
            it.toModel()
        }?.let { ArrayList(it) } ?: arrayListOf()
    )