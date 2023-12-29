package com.example.navigationapp.di

import com.example.navigationapp.data.Repository
import com.example.navigationapp.data.RepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(repo: Repository): RepositoryInterface
}