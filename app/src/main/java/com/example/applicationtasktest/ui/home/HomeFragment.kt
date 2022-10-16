package com.example.applicationtasktest.ui.home

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applicationtasktest.databinding.FragmentHomeBinding
import com.example.applicationtasktest.ui.basefragment.BaseBindingFragment
import org.koin.android.ext.android.inject

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>() {

    private val recyclerAdapterAdvert by lazy { HomeFragmentAdapterAdvert() }
    private val recyclerAdapterMain by lazy { HomeFragmentAdapterMain() }
    private val homeViewModel: HomeViewModel by inject()

    override fun init() {

        //RV Main
        binding.recyclerMain.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.recyclerMain.adapter = recyclerAdapterMain

        // RV AdvertList
        binding.recyclerAdvert.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerAdvert.adapter = recyclerAdapterAdvert

        homeViewModel.listAdvertEntity.observe(viewLifecycleOwner) {
                recyclerAdapterAdvert.updateListItems(it)
        }
    }
}