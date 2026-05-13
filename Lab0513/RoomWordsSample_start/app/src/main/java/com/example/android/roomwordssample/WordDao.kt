package com.example.android.roomwordssample

import androidx.room.Dao
import androidx.room.Query

@Dao
class WordDao {
    @Query
    suspend fun insert(word : Word) {}

    @Query
    suspend fun delete(word : Word) {}

    @Query
    suspend fun getAll() : List<Word> {}
}