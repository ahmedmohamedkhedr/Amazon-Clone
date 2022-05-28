package com.example.amazonclone.ui.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.ProductModel
import com.example.domain.use_cases.GetProductUseCase
import kotlinx.coroutines.launch

class ProductDetailsViewModel(private val useCase: GetProductUseCase) : ViewModel() {

    private val productLiveData: MutableLiveData<ProductModel> = MutableLiveData()
    val _productLiveData: LiveData<ProductModel> = productLiveData

    fun getProductById(id: String) = viewModelScope.launch {
        productLiveData.postValue(useCase(id))
    }
}