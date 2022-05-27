package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

data class TodayOfferModel(
    override val thumbnail: String,
    override val title: String,
    val price: Double,
    val sale: Int,
    val salePrice: Double
) : BaseEntity {
    override val type: EntityType
        get() = EntityType.TODAY_OFFER
}
