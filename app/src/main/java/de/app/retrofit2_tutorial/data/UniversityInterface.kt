package de.app.retrofit2_tutorial.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UniversityInterface {

    @Headers("Accept: application/json")
    @GET("/search")
    suspend fun getUniversitiesByCountry(@Query("country") country:String): Response<List<University>>
}