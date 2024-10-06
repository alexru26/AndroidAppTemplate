package com.example.data_repository.di

import com.example.data_repository.repository.RepositoryImpl
import com.example.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImpl: RepositoryImpl
    ): Repository

}