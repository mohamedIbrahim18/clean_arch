package com.example.data.dataSourceContract

import com.example.data.model.category.CategoryDTO
import com.example.domain.model.Category

interface CategoryDataSource {
    suspend fun getCategories() :List<Category?>?
}