package com.example.navigationapp.di

import android.content.Context
import androidx.room.Room
import com.example.navigationapp.data.AppDatabase
import com.example.navigationapp.data.ColorsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideColorsDao(appDatabase: AppDatabase): ColorsDao{
        return appDatabase.colorsDao()
    }

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase{
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "product").build()
    }
}