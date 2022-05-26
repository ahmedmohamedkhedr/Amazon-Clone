package com.example.domain.models

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

data class CategoryModel(override val thumbnail: String, override val title: String) : BaseEntity {
    override val type: EntityType
        get() = EntityType.CATEGORIES
}
