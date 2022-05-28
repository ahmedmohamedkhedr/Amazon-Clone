package com.example.domain.use_cases

import com.example.domain.data_interfaces.Repository
import com.example.domain.models.ProductModel

class GetProductUseCase(private val repository: Repository) {
    suspend operator fun invoke(id: String): ProductModel {
        return repository.getProduct(id)
    }
}