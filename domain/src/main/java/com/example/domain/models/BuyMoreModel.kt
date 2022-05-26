package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

data class BuyMoreModel(
    override val thumbnail: String = "",
    override val title: String,
    val productsThumbnail: MutableList<String>
) :
    BaseEntity {
    override val type: EntityType
        get() = EntityType.BUY_MORE
}
