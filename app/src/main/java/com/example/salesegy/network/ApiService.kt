package com.example.salesegy.network

import com.example.salesegy.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("newusersync.php")
    suspend fun getAllData(): Response<List<User>>



    @GET("newusersync.php")
    fun getData(): Call<List<User>>

}