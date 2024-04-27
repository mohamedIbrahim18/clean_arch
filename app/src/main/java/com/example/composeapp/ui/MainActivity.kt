package com.example.composeapp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.composeapp.R
import com.example.composeapp.viewmodel.CategoriesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel :CategoriesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getCategories()
        subscribe()
    }

    private fun subscribe() {
        viewModel.categoriesLiveData.observe(this){
            if (it!!.isNotEmpty()){
                Log.e("test",it[5]?.name!!)
            }
        }
    }
}