package com.rmakiyama.skeleton.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.rmakiyama.skeleton.R
import com.rmakiyama.skeleton.core.ext.assistedViewModels
import com.rmakiyama.skeleton.databinding.FragmentHomeBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Provider

class HomeFragment : DaggerFragment(R.layout.fragment_home) {

    @Inject lateinit var factory: Provider<HomeViewModel>
    private val viewModel by assistedViewModels { factory.get() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomeBinding.bind(view)

        with(viewModel) {
            time.observe(viewLifecycleOwner, binding.countUp::setText)
        }
    }
}
