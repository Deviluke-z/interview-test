package duc.daominh.interview_test.data.api

import duc.daominh.interview_test.data.modelJson.CountryModelJsonItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CountryAPIService {

    @GET("v3.1/all")
    suspend fun getAllCountry(
        @Query("fields")
        fields: String = "name,flags"
    ): Response<ArrayList<CountryModelJsonItem>>

    @GET("v3.1/name/{name}")
    suspend fun getCountryByName(
        @Path(value = "name", encoded = true)
        name: String
    ): Response<CountryModelJsonItem>

}