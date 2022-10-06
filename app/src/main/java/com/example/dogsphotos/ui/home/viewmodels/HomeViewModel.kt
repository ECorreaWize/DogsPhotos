package com.example.dogsphotos.ui.home.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogsphotos.data.repository.DogsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val dogsRepo: DogsRepo
): ViewModel() {

    private val _state = MutableStateFlow(emptyList<String>())
    val state: StateFlow<List<String>>
        get() = _state

    init {
        viewModelScope.launch {
            val imagesDog = dogsRepo.getDogImages()
            _state.value = imagesDog.message
        }
    }
}
