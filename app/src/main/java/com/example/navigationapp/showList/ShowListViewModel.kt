package com.example.navigationapp.showList

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationapp.data.Repository
import com.example.navigationapp.model.Colors
import kotlinx.coroutines.launch

class ShowListViewModel: ViewModel() {

    lateinit var repository: Repository

    val receivedData = MutableLiveData<Colors>()


    fun getAll() : LiveData<List<Colors>> {
        return repository.getAll()
    }
}