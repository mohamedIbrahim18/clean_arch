package com.example.data.model.category

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.example.domain.model.Category
import com.google.gson.annotations.SerializedName

@Parcelize
data class CategoryDTO(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("createdAt")
    val createdAt: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("_id")
    val id: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null,

    @field:SerializedName("updatedAt")
    val updatedAt: String? = null
) : Parcelable {
    fun toCategory(): Category {
        return Category(
	    image= image,
            createdAt = createdAt,
            name= name,
            id=id,
            slug= slug,
            updatedAt = updatedAt
        )
    }
}