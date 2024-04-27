package com.example.data.repository.category

import com.example.domain.repository.categories.CategoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class di {
    @Binds
    abstract fun provideCategoryRepository(
        repo: CategoriesRepositoryImpl
    ): CategoryRepository
}