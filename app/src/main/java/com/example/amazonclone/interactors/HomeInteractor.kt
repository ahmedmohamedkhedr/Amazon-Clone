package com.example.amazonclone.interactors

import com.example.domain.use_cases.*

data class HomeInteractor(
    val getCategoriesUseCase: GetCategoriesUseCase,
    val getBestOffersUseCase: GetBestOffersUseCase,
    val getTodayOfferUseCase: GetTodayOfferUseCase,
    val getSavesCornerUseCase: GetSavesCornerUseCase,
    val getItemsUseCase: GetItemsUseCase,
    val buyMoreUseCase: GetBuyMoreUseCase,
    val exploreMoreUseCase: GetExploreMoreUseCase
)
