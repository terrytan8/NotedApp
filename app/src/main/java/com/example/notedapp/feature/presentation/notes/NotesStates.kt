package com.example.notedapp.feature.presentation.notes

import com.example.notedapp.feature.domain.model.Note
import com.example.notedapp.feature.domain.util.NoteOrder
import com.example.notedapp.feature.domain.util.OrderType

data class NotesStates(
    val notes : List <Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
