package com.example.navigationapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.navigationapp.model.Colors

@Dao
interface ColorsDao {
    @Insert
    suspend fun insert(product: Colors)

    @Query("SELECT * FROM colors")
        fun getAll() : LiveData<List<Colors>>

    @Delete
    suspend fun delete(product: Colors)
}