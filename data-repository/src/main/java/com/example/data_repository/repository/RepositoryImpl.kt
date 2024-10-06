package com.example.data_repository.repository

import com.example.data_repository.data_source.LocalDataSource
import com.example.data_repository.data_source.RemoteDataSource
import com.example.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
): Repository {


}