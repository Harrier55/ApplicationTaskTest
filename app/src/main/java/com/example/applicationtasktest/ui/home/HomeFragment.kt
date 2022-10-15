package com.example.applicationtasktest.ui.home

import androidx.lifecycle.ViewModelProvider
import com.example.applicationtasktest.databinding.FragmentHomeBinding
import com.example.applicationtasktest.ui.basefragment.BaseBindingFragment

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>() {

    private val homeViewModel by lazy { ViewModelProvider(this).get(HomeViewModel::class.java) }

    override fun init() {

        homeViewModel.text.observe(viewLifecycleOwner) {
//            binding.textHome.text = it
        }
    }
}