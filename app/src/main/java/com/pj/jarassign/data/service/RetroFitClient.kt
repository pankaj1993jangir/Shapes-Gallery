package com.pj.jarassign.data.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.unsplash.com/"
private const val API_KEY = "eQ7dMm3W7tZLt7KO2CDgjp0Bps4K_KcWGhfjuNyxHcE"

class RetroFitClient {
    private val httpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor { chain ->
                val oldRequest = chain.request()
                val newRequest = oldRequest.newBuilder()
                    .addHeader("Authorization", "Client-ID $API_KEY")
                    .build()
                chain.proceed(newRequest)
            }
            .build()
    }

    private val retrofit by lazy {
        Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api by lazy {
        retrofit.create(ApiService::class.java)
    }

    companion object {
        private var INSTANCE: RetroFitClient? = null
        fun getInstance() = INSTANCE ?: RetroFitClient().also {
            INSTANCE = it
        }
    }
}