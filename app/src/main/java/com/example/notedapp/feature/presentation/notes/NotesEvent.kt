package com.example.notedapp.feature.presentation.notes

import com.example.notedapp.feature.domain.model.Note
import com.example.notedapp.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
