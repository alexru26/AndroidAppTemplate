package com.example.data_local.di

import android.app.Application
import androidx.room.Room
import com.example.data_local.database.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PersistenceModule {

    @Provides
    @Singleton
    fun provideDiscographyDatabase(app: Application): Database {
        return Room.databaseBuilder(
            app,
            Database::class.java,
            "discography.db"
        ).build()
    }

//    @Provides
//    @Singleton
//    fun provideAlbumDao(discographyDatabase: DiscographyDatabase): AlbumDao = discographyDatabase.albumDao

}