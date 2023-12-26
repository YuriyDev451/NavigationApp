package com.example.navigationapp

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.navigationapp.model.Colors

class ShowListViewModel: ViewModel() {

    val receivedData = MutableLiveData<Colors>()
}