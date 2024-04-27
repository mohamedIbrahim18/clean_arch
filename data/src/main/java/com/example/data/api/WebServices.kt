package com.example.data.api

import com.example.data.model.category.CategoryResponse
import retrofit2.http.GET

interface WebServices {
    @GET("api/v1/categories")
    suspend fun getCategories() : CategoryResponse
}