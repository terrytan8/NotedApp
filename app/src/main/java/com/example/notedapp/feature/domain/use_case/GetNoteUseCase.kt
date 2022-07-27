package com.example.notedapp.feature.domain.use_case

import com.example.notedapp.feature.domain.model.Note
import com.example.notedapp.feature.domain.repository.NoteRepository

class GetNoteUseCase (
    private val repository: NoteRepository
        ) {

    suspend operator fun invoke (id:Int): Note?{
        return repository.getNoteById(id)
    }
}