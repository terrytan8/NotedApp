package com.example.notedapp.feature.domain.use_case

data class NoteUseCase(
    val getNotes:GetNotesUseCase,
    val deleteNote:DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNote:GetNoteUseCase
)
