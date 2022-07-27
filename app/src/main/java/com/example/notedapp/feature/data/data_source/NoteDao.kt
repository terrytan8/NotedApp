package com.example.notedapp.feature.data.data_source

import androidx.room.*
import com.example.notedapp.feature.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes (): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById (id:Int): Note?

//    update previous exist data in db
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertNote (note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}