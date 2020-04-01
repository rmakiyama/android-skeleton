package com.rmakiyama.skeleton.data

import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun dummyRepository(impl: SkeletonDummyRepository): DummyRepository
}
