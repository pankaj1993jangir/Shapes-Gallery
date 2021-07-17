package com.pj.jarassign.data.service

import com.pj.jarassign.data.entity.ImageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("photos")
    suspend fun getListOfImages(
        @Query("page") page: Int,
    ): List<ImageResponse>
}