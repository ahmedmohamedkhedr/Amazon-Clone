package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

data class BannerModel(
    override val thumbnail: String,
    override val title: String = ""
) :
    BaseEntity {
    override val type: EntityType
        get() = EntityType.BANNER
}
