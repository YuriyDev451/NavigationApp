package com.example.navigationapp.showList

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationapp.data.Repository
import com.example.navigationapp.model.Colors
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShowListViewModel @Inject constructor(var repository: Repository): ViewModel() {



    val receivedData = MutableLiveData<Colors>()


    fun getAll() : LiveData<List<Colors>> {
        return repository.getAll()
    }
}