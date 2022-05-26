package com.example.amazonclone.di

import com.example.amazonclone.interactors.HomeInteractor
import com.example.amazonclone.ui.home.HomeViewModel
import com.example.data.RepositoryImp
import com.example.domain.data_interfaces.Repository
import com.example.domain.use_cases.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<Repository> {
        RepositoryImp()
    }

    single<GetCategoriesUseCase> {
        GetCategoriesUseCase(get())
    }

    single<GetBestOffersUseCase> {
        GetBestOffersUseCase(get())
    }

    single<GetTodayOfferUseCase> {
        GetTodayOfferUseCase(get())
    }

    single<GetSavesCornerUseCase> {
        GetSavesCornerUseCase(get())
    }

    single<GetItemsUseCase> {
        GetItemsUseCase(get())
    }

    single<GetBuyMoreUseCase> {
        GetBuyMoreUseCase(get())
    }

    single<GetExploreMoreUseCase> {
        GetExploreMoreUseCase(get())
    }

    single<HomeInteractor> {
        HomeInteractor(get(), get(), get(), get(), get(), get(), get())
    }

    viewModel {
        HomeViewModel(get())
    }
}