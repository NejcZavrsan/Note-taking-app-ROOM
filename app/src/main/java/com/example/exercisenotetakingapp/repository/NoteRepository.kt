package com.example.exercisenotetakingapp.repository

import com.example.exercisenotetakingapp.database.NoteDatabase
import com.example.exercisenotetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    private val noteDao = db.getNoteDao()

    suspend fun insertNote(note: Note) = noteDao.insertNote(note)
    suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)
    suspend fun updateNote(note: Note) = noteDao.updateNote(note)

    fun getAllNotes() = noteDao.getAllNotes()
    fun searchNote(query: String?) = noteDao.searchNote(query)

}