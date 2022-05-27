package com.example.amazonclone.utils

import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

class EntityWrapper {
    val type: EntityType
    val data: MutableList<BaseEntity>

    constructor(data: MutableList<BaseEntity>) {
        this.data = data
        this.type = data[0].type
    }
}