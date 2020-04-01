package com.rmakiyama.skeleton.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.rmakiyama.skeleton.data.DummyRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val repository: DummyRepository
) : ViewModel() {

    private val _timeMillis = MutableLiveData(0L)
    val time: LiveData<String> get() = _timeMillis.map { it.toTimeText() }
    val dummies = repository.dummies().asLiveData()

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
