package com.example.navigationapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Colors(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var name: String,
    var count: String,
    var description: String
):Parcelable
