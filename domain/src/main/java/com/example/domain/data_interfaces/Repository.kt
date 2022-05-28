package com.example.domain.data_interfaces

import com.example.domain.enums.EntityType
import com.example.domain.models.ProductModel
import com.example.domain.models.base.BaseEntity

interface Repository {
    suspend fun getEntities(entityType: EntityType): MutableList<BaseEntity>
    suspend fun getProduct(id: String): ProductModel
}