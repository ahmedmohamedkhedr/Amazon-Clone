package com.example.amazonclone.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amazonclone.interactors.HomeInteractor
import com.example.domain.models.*
import com.example.domain.models.base.BaseEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(private val interactor: HomeInteractor) : ViewModel() {

    private val categoriesLiveDate: MutableLiveData<MutableList<CategoryModel>> = MutableLiveData()
    val _categoriesLiveData: LiveData<MutableList<CategoryModel>> = categoriesLiveDate

    private val bestOffersLiveDate: MutableLiveData<MutableList<BestOfferModel>> = MutableLiveData()
    val _bestOffersLiveData: LiveData<MutableList<BestOfferModel>> = bestOffersLiveDate

    private val todayOffersLiveDate: MutableLiveData<MutableList<TodayOfferModel>> =
        MutableLiveData()
    val _todayOffersLiveDate: LiveData<MutableList<TodayOfferModel>> = todayOffersLiveDate

    private val savesCornerLiveDate: MutableLiveData<MutableList<SavesCornerModel>> =
        MutableLiveData()
    val _savesCornerLiveDate: LiveData<MutableList<SavesCornerModel>> = savesCornerLiveDate

    private val itemsLiveDate: MutableLiveData<MutableList<BaseEntity>> =
        MutableLiveData()
    val _itemsLiveDate: LiveData<MutableList<BaseEntity>> = itemsLiveDate

    private val buyMoreLiveDate: MutableLiveData<BuyMoreModel> =
        MutableLiveData()
    val _buyMoreLiveDate: LiveData<BuyMoreModel> = buyMoreLiveDate

    private val exploreMoreLiveDate: MutableLiveData<MutableList<ExploreMoreModel>> =
        MutableLiveData()
    val _exploreMoreLiveDate: LiveData<MutableList<ExploreMoreModel>> = exploreMoreLiveDate

    private val errorLiveDate: MutableLiveData<String> =
        MutableLiveData()
    val _errorLiveDate: LiveData<String> = errorLiveDate

    fun getData() = viewModelScope.launch(Dispatchers.IO) {
        try {
            categoriesLiveDate.postValue(interactor.getCategoriesUseCase())
            bestOffersLiveDate.postValue(interactor.getBestOffersUseCase())
            todayOffersLiveDate.postValue(interactor.getTodayOfferUseCase())
            savesCornerLiveDate.postValue(interactor.getSavesCornerUseCase())
            itemsLiveDate.postValue(interactor.getItemsUseCase())
            buyMoreLiveDate.postValue(interactor.buyMoreUseCase())
            exploreMoreLiveDate.postValue(interactor.exploreMoreUseCase())
        } catch (e: Exception) {
            errorLiveDate.postValue(e.message)
        }

    }
}