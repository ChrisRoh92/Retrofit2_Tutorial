package de.app.retrofit2_tutorial.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val BASEURL = "http://universities.hipolabs.com/"

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:UniversityInterface by lazy {
        retrofit.create(UniversityInterface::class.java)
    }

}