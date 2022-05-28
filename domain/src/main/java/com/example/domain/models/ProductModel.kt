package com.example.domain.models

data class ProductModel(
    val id: String,
    val price: Double,
    val sale: Int?,
    val salePrice: Double?,
    val title: String,
    val thumbnail:String
)
