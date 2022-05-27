package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.TodayOfferModel

class GetTodayOfferUseCase(private val repository: Repository) {

    suspend operator fun invoke(): MutableList<TodayOfferModel> {
        return repository.getEntities(EntityType.TODAY_OFFER) as MutableList<TodayOfferModel>
    }
}