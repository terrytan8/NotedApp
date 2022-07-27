package com.example.notedapp.di

import android.app.Application
import androidx.room.Room
import com.example.notedapp.feature.data.data_source.NoteDatabase
import com.example.notedapp.feature.data.repository.NoteRepositoryImpl
import com.example.notedapp.feature.domain.repository.NoteRepository
import com.example.notedapp.feature.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase (app:Application):NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository (db:NoteDatabase):NoteRepository{
        return  NoteRepositoryImpl (db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases (repository: NoteRepository):NoteUseCase{
        return  NoteUseCase(
            getNotes = GetNotesUseCase(repository),
            deleteNote = DeleteNoteUseCase(repository),
            addNote = AddNoteUseCase(repository),
            getNote = GetNoteUseCase(repository)
        )
    }
}