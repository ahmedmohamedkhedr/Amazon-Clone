package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.CategoryModel

class GetCategoriesUseCase(private val repository: Repository) {

    suspend operator fun invoke():MutableList<CategoryModel> {
        return repository.getEntities(EntityType.CATEGORIES) as MutableList<CategoryModel>
    }
}