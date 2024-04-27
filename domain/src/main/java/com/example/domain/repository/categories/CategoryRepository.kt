package com.example.domain.repository.categories

import com.example.domain.model.Category

interface CategoryRepository {
    suspend fun getCategories(): List<Category?>?
}