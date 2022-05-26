package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.enums.OfferType
import com.example.domain.models.base.BaseEntity
import com.example.domain.models.base.BaseOffer

data class TodayOfferModel(
    override val thumbnail: String,
    override val title: String,
    val price: Double,
    val sale: Int,
    val salePrice: Double
) : BaseOffer {
    override val type: EntityType
        get() = EntityType.OFFERS
    override val offerType: OfferType
        get() = OfferType.TODAY_OFFER
}
