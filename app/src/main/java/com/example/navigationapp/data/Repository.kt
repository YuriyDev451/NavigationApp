package com.example.navigationapp.data

import androidx.lifecycle.LiveData
import com.example.navigationapp.model.Colors

class Repository(private val productDao : ColorsDao) {

    suspend fun insert (product: Colors) {
        productDao.insert(product)
    }

    fun getAll() : LiveData<List<Colors>> {
        return productDao.getAll()
    }

    suspend fun delete (product: Colors) {
        productDao.delete(product)
    }
}