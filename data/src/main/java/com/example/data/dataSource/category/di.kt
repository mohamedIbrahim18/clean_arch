package com.example.data.dataSource.category

import com.example.data.dataSourceContract.CategoryDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class di {
    @Binds
    abstract fun provideCategoryDataSoruce(categoryDataSourceImpl: CategoryDataSourceImpl):
            CategoryDataSource
}