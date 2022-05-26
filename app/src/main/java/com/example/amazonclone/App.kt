package com.example.amazonclone

import android.app.Application
import com.example.amazonclone.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(mutableListOf(appModule))
        }
    }
}