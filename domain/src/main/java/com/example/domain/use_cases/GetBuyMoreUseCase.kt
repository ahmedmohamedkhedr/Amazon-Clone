package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.BuyMoreModel

class GetBuyMoreUseCase(private val repository: Repository) {
    suspend operator fun invoke(): BuyMoreModel {
        return repository.getEntities(EntityType.BUY_MORE).first() as BuyMoreModel
    }
}