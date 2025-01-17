package com.nandits.potenz.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.nandits.potenz.data.Repository

class HomeViewModel(private val repository: Repository) : ViewModel() {
    fun getUser() = repository.getUser().asLiveData()
}