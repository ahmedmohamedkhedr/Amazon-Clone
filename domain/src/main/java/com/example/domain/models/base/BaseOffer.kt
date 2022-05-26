package com.example.domain.models.base

import com.example.domain.enums.OfferType

interface BaseOffer:BaseEntity {
    val offerType: OfferType
}