package com.pj.jarassign.domain.repository

import com.pj.jarassign.domain.entity.Image

interface UnsplashRepo {
    suspend fun getImages(page: Int): List<Image>
}