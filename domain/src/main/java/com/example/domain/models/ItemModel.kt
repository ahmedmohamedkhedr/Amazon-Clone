package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

data class ItemModel(override val thumbnail: String , override val title: String) : BaseEntity {
    override val type: EntityType
        get() = EntityType.ITEM
}
