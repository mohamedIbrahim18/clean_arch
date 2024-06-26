package com.example.data.repository.category

import com.example.data.dataSourceContract.CategoryDataSource
import com.example.domain.model.Category
import com.example.domain.repository.categories.CategoryRepository
import javax.inject.Inject

class CategoriesRepositoryImpl @Inject constructor(
   private val categoryDataSource: CategoryDataSource
) : CategoryRepository {
    override suspend fun getCategories(): List<Category?>? {
      return  categoryDataSource.getCategories()
    }
}