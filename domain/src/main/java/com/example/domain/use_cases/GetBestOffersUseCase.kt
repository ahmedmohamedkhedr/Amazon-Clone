package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.OfferType
import com.example.domain.models.BestOfferModel

class GetBestOffersUseCase(private val repository: Repository) {

    suspend operator fun invoke():MutableList<BestOfferModel>{
        return repository.getOffers(OfferType.BEST_OFFERS) as MutableList<BestOfferModel>
    }
}