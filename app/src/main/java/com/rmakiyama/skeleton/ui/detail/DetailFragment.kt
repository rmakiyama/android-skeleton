package com.rmakiyama.skeleton.ui.detail

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.rmakiyama.skeleton.R
import com.rmakiyama.skeleton.core.ext.assistedViewModels
import com.rmakiyama.skeleton.databinding.FragmentDetailBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class DetailFragment : DaggerFragment(R.layout.fragment_detail) {

    @Inject lateinit var factory: DetailViewModel.Factory
    private val viewModel by assistedViewModels { factory.create(navArgs.id) }

    private val navArgs: DetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDetailBinding.bind(view)

        with(viewModel) {
            id.observe(viewLifecycleOwner, binding.uuid::setText)
        }
    }
}
