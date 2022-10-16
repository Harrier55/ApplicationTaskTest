package com.example.applicationtasktest.ui.home

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applicationtasktest.databinding.FragmentHomeBinding
import com.example.applicationtasktest.ui.basefragment.BaseBindingFragment

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>() {


    private val recyclerAdapter by lazy { HomeFragmentAdapter() }
    private val homeViewModel by lazy { ViewModelProvider(this).get(HomeViewModel::class.java) }

    override fun init() {
        // RV
        binding.recyclerAdvert.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerAdvert.adapter = recyclerAdapter


        homeViewModel.text.observe(viewLifecycleOwner) {
//            binding.textHome.text = it
        }
    }
}