package com.pj.jarassign.data

import com.pj.jarassign.data.service.RetroFitClient
import com.pj.jarassign.domain.entity.Image
import com.pj.jarassign.domain.repository.UnsplashRepo
import java.lang.Exception

class UnsplashRepoImpl : UnsplashRepo {
    private val api by lazy {
        RetroFitClient.getInstance().api
    }

    override suspend fun getImages(page: Int): List<Image> {
        val mutableList: MutableList<Image> = ArrayList()
        return try {
            api.getListOfImages(page)?.map { image ->
                image.urls?.let { url ->
                    url.regular?.let {
                        mutableList.add(Image(it))
                    }
                }
            }
            mutableList
        } catch (e: Exception) {
            mutableList
        }
    }
}