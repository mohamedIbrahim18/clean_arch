package com.example.composeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Category
import com.example.domain.usecase.CategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val categoryUseCase: CategoriesUseCase
) : ViewModel() {

    private val _categoriesLiveData = MutableLiveData<List<Category?>?>()
    val categoriesLiveData: MutableLiveData<List<Category?>?>
        get() = _categoriesLiveData

    fun getCategories() {
        viewModelScope.launch {
            try {
                val categories = categoryUseCase.getCategoriesUserCase()
                _categoriesLiveData.postValue(categories)
            } catch (e: Exception) {
                // Handle error
                e.printStackTrace()
            }
        }
    }
}
