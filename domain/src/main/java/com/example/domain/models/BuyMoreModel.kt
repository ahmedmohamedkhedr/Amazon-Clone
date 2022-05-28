package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity
import java.util.*

data class BuyMoreModel(
    override val thumbnail: String = "",
    override val title: String,
    val products: MutableList<Product>
) :
    BaseEntity {
    override val type: EntityType
        get() = EntityType.BUY_MORE

    data class Product(
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val thumbnail: String
    )
}
