package com.example.navigationapp.data

import androidx.lifecycle.LiveData
import com.example.navigationapp.model.Colors
import javax.inject.Inject


interface RepositoryInterface {

}

class Repository @Inject constructor(private val productDao : ColorsDao): RepositoryInterface {

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