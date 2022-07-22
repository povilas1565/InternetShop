package com.example.internetshop

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIService {

    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("bestRated")
    fun getProducts(
//        @Query("offset") offset: Int,
//        @Query("limit") limit: Int
    ): Call<List<Product>>

}