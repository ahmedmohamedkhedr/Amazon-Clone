package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.SavesCornerModel

class GetSavesCornerUseCase(private val repository: Repository) {
    suspend operator fun invoke(): MutableList<SavesCornerModel> {
        return repository.getEntities(EntityType.SAVES_CORNER) as MutableList<SavesCornerModel>
    }
}