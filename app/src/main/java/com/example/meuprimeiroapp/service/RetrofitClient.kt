package com.example.meuprimeiroapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "http://10.0.2.2:3000/" // Endereço para usado para acessar o localhost no celular

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    val apiService: ApiService by lazy {
        RetrofitClient.retrofit.create(ApiService::class.java)
    }

}