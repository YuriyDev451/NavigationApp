package com.example.navigationapp.addItem

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationapp.data.Repository
import com.example.navigationapp.model.Colors
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddFragmentViewModel @Inject constructor( var repo: Repository): ViewModel() {



    val dataForShowListFragment = MutableLiveData<Colors>()

    val name = MutableLiveData<String>()

    val count = MutableLiveData<String>()

    val description = MutableLiveData<String>()




     fun parseEditText(): Boolean{
         val name = name.value.orEmpty()
         val count = count.value.orEmpty()
         val description = description.value.orEmpty()
         return name.isNotEmpty() && count.isNotEmpty() && description.isNotEmpty()
    }

    fun insert (product: Colors) {
        viewModelScope.launch {
            repo.insert(product)
        }

    }

}