package com.example.navigationapp.addItem

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddFragmentViewModel: ViewModel() {

    val name = MutableLiveData<String>()

    val count = MutableLiveData<String>()

    val description = MutableLiveData<String>()


    var errorDescription = MutableLiveData<String>()

    var newProductCallBack = MutableLiveData<Boolean>()

    fun addNewProductInserted(){
        if (count.value.isNullOrEmpty()
            || name.value.isNullOrEmpty()
            || description.value.isNullOrEmpty()){
            errorDescription.postValue("Zapolnite polya")
            return
        }
        newProductCallBack.postValue(true)
    }

    private fun parseEditText(){
        if (count.value.isNullOrEmpty()
            || name.value.isNullOrEmpty()
            || description.value.isNullOrEmpty()){
            errorDescription.postValue("Zapolnite polya")
            return
        }
    }

}