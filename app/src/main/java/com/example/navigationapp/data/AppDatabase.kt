package com.example.navigationapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.navigationapp.model.Colors

@Database(entities = [Colors::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun colorsDao(): ColorsDao


    companion object {
        private var database : AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            if(database != null) {
                return database!!
            } else {
                database = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "product").build()

                return database!!
            }
        }
    }
}