package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.ExploreMoreModel

class GetExploreMoreUseCase(private val repository: Repository) {
    suspend operator fun invoke(): MutableList<ExploreMoreModel> {
        return repository.getEntities(EntityType.EXPLORE_MORE) as MutableList<ExploreMoreModel>
    }
}