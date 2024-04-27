package com.example.domain.usecase

import com.example.domain.model.Category
import com.example.domain.repository.categories.CategoryRepository
import javax.inject.Inject

class CategoriesUseCase @Inject constructor(
    private val repo: CategoryRepository
) {
    suspend fun getCategoriesUserCase(): List<Category?>?{
       return repo.getCategories()
    }
}