package com.rmakiyama.skeleton.ui

import com.rmakiyama.skeleton.di.AssistedInjectModule
import com.rmakiyama.skeleton.di.PageScope
import com.rmakiyama.skeleton.ui.detail.DetailFragment
import com.rmakiyama.skeleton.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @PageScope
    @ContributesAndroidInjector(modules = [AssistedInjectModule::class])
    abstract fun contributeHomeFragment(): HomeFragment

    @PageScope
    @ContributesAndroidInjector(modules = [AssistedInjectModule::class])
    abstract fun contributeDetailFragment(): DetailFragment
}
