package com.example.domain.models.base

import com.example.domain.enums.EntityType
import java.util.*

interface BaseEntity {
    val id: String
        get() = UUID.randomUUID().toString()
    val type: EntityType
    val thumbnail: String
    val title: String
}
