package com.example.ensayopruebacerti

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface CakeAPI {
    @GET
    fun getCakes(@Url url:String):Call<List<Cake>>

    @GET
    fun getCakeDetails(@Url url: String):Call<List<CakeDetail>>
}