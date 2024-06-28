package com.mcoders.wanderview.ui.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mcoders.wanderview.data.models.Details
import com.mcoders.wanderview.domain.repository.DetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val repository: DetailsRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val id: String = savedStateHandle.get<String>("id") ?: ""

    private val _details : Flow<Details> = flow {}
    val details : StateFlow<Details> get() = _details as StateFlow<Details>

    fun fetchDetails() {
        viewModelScope.launch {
            //call api
        }
    }

}
