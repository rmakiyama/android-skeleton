package com.rmakiyama.skeleton.data

import com.rmakiyama.skeleton.model.Dummy
import kotlinx.coroutines.flow.Flow

interface DummyRepository {

    fun dummies(): Flow<List<Dummy>>

    suspend fun save(dummy: Dummy)
}
