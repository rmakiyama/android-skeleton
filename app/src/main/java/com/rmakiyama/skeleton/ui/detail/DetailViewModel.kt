package com.rmakiyama.skeleton.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class DetailViewModel @AssistedInject constructor(
    @Assisted id: String
) : ViewModel() {

    private val _id = MutableLiveData(id)
    val id: LiveData<String> get() = _id

    @AssistedInject.Factory
    interface Factory {
        fun create(id: String): DetailViewModel
    }
}
