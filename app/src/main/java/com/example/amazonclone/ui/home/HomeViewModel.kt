package com.example.amazonclone.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amazonclone.interactors.HomeInteractor
import com.example.domain.models.*
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

    private val itemsLiveDate: MutableLiveData<MutableList<ItemModel>> =
        MutableLiveData()
    val _itemsLiveDate: LiveData<MutableList<ItemModel>> = itemsLiveDate

    private val buyMoreLiveDate: MutableLiveData<MutableList<BuyMoreModel>> =
        MutableLiveData()
    val _buyMoreLiveDate: LiveData<MutableList<BuyMoreModel>> = buyMoreLiveDate

    private val exploreMoreLiveDate: MutableLiveData<MutableList<ExploreMoreModel>> =
        MutableLiveData()
    val _exploreMoreLiveDate: LiveData<MutableList<ExploreMoreModel>> = exploreMoreLiveDate


    fun getData() = viewModelScope.launch(Dispatchers.IO) {
        categoriesLiveDate.postValue(interactor.getCategoriesUseCase())
        bestOffersLiveDate.postValue(interactor.getBestOffersUseCase())
        todayOffersLiveDate.postValue(interactor.getTodayOfferUseCase())
        savesCornerLiveDate.postValue(interactor.getSavesCornerUseCase())
        itemsLiveDate.postValue(interactor.getItemsUseCase())
        buyMoreLiveDate.postValue(interactor.buyMoreUseCase())
        exploreMoreLiveDate.postValue(interactor.exploreMoreUseCase())
    }
}