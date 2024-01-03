package com.example.todocompose

import android.content.Context
import androidx.room.Room
import com.example.todocompose.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, TodoTaskDatabase::class.java, DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: TodoTaskDatabase) = database.todoDao()
}