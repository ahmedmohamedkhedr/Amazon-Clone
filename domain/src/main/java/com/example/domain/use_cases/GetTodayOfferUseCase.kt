package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.OfferType
import com.example.domain.models.TodayOfferModel

class GetTodayOfferUseCase(private val repository: Repository) {

    suspend operator fun invoke(): MutableList<TodayOfferModel> {
        return repository.getOffers(OfferType.TODAY_OFFER) as MutableList<TodayOfferModel>
    }
}