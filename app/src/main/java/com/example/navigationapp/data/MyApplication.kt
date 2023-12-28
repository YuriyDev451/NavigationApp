package com.example.navigationapp.data

import android.app.Application

class MyApplication: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { Repository(database.productDao()) }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}