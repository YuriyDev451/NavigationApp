package com.example.navigationapp.addItem

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.navigationapp.model.Colors

class AddFragmentViewModel: ViewModel() {

    val dataForShowListFragment = MutableLiveData<Colors>()

    val name = MutableLiveData<String>()

    val count = MutableLiveData<String>()

    val description = MutableLiveData<String>()


  //  var errorDescription = MutableLiveData<String>()

  //  var newProductCallBack = MutableLiveData<Boolean>()

   /* fun addNewProductInserted(){
        if (count.value.isNullOrEmpty()
            || name.value.isNullOrEmpty()
            || description.value.isNullOrEmpty()){
            errorDescription.postValue("Zapolnite polya")
            return
        }
        newProductCallBack.postValue(true)
    }*/

  /*  private fun parseEditText(){
        if (count.value.isNullOrEmpty()
            || name.value.isNullOrEmpty()
            || description.value.isNullOrEmpty()){
            errorDescription.postValue("Zapolnite polya")
            return
        }
    }*/

}