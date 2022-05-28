package com.example.amazonclone

import android.app.Application
import android.os.Handler
import android.os.Looper
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

        Handler(Looper.getMainLooper()).post {
            while (true) {
                try {
                    Looper.loop()
                } catch (e: Throwable) {
                     e.printStackTrace()
                }
            }
        }
        Thread.setDefaultUncaughtExceptionHandler { t, e ->
            e.printStackTrace()
        }
    }
}