package com.example.applicationtasktest.ui.home

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HomeFragmentAdapter: RecyclerView.Adapter<HomeFragmentAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int {
       return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }



    class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}

