package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.ItemModel

class GetItemsUseCase(private val repository: Repository) {
    suspend operator fun invoke(): MutableList<ItemModel> {
        return repository.getEntities(EntityType.ITEM) as MutableList<ItemModel>
    }
}