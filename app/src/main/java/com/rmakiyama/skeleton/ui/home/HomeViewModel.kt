package com.rmakiyama.skeleton.ui.home

import androidx.lifecycle.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class HomeViewModel @Inject constructor() : ViewModel() {

    private val _timeMillis = MutableLiveData(0L)
    val time: LiveData<String> get() = _timeMillis.map { it.toTimeText() }

    private var updateTime: Boolean = true

    init {
        viewModelScope.launch { countUp(System.currentTimeMillis()) }
    }

    private suspend fun countUp(currentTimeMillis: Long) {
        delay(100L)
        _timeMillis.value = System.currentTimeMillis() - currentTimeMillis
        if (updateTime) countUp(currentTimeMillis)
    }

    private fun Long.toTimeText(): String {
        val format = SimpleDateFormat("mm:ss", Locale.US)
        return format.format(this)
    }

    override fun onCleared() {
        super.onCleared()
        updateTime = false
    }
}
