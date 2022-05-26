package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.enums.OfferType
import com.example.domain.models.base.BaseEntity
import com.example.domain.models.base.BaseOffer

data class BestOfferModel(
    override val thumbnail: String,
    val banner: String,
    override val title: String
):
    BaseOffer {
    override val type: EntityType
        get() = EntityType.OFFERS
    override val offerType: OfferType
        get() = OfferType.BEST_OFFERS
}
