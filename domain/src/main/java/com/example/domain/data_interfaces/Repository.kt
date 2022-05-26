package com.example.domain.data_interfaces

import com.example.domain.enums.EntityType
import com.example.domain.enums.OfferType
import com.example.domain.models.base.BaseEntity
import com.example.domain.models.base.BaseOffer

interface Repository {
    suspend fun getEntities(entityType: EntityType): MutableList<BaseEntity>
    suspend fun getOffers(offerType: OfferType): MutableList<BaseOffer>
}