package com.example.notedapp.feature.domain.use_case

import com.example.notedapp.feature.domain.model.Note
import com.example.notedapp.feature.domain.repository.NoteRepository

class DeleteNoteUseCase (
    private val repository: NoteRepository
        ) {

    suspend operator fun invoke (note: Note){
        repository.deleteNote(note)
    }
}