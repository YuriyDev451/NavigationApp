package com.example.navigationapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Colors(
    var name: String,
    var count: String,
    var description: String
):Parcelable
