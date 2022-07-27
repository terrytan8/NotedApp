package com.example.notedapp.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notedapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    //val imageSource: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightBlue, LightGreen, BabyBlue, RedPink)
    }
}

class InvalidNoteException (message:String): Exception (message)
