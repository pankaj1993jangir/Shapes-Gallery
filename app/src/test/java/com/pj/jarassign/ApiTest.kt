package com.pj.jarassign

import com.pj.jarassign.data.service.ApiService
import com.pj.jarassign.data.service.RetroFitClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ApiTest {
    private lateinit var apiService: ApiService

    @Before
    fun setup() {
        apiService = RetroFitClient.getInstance().api
    }

    @Test
    fun `validate feed response`() {
        runBlocking {
            val response = apiService.getListOfImages(1, 2)
            System.out.println(response)
            Assert.assertNotNull(response)
        }
    }
}