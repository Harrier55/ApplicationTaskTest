package com.example.applicationtasktest.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.applicationtasktest.R

class HomeFragmentAdapterMain : RecyclerView.Adapter<HomeFragmentAdapterMain.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_advert, parent, false)
        return HomeFragmentAdapterMain.ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(R.drawable.foto_free)
            .into(holder.imageItemAdvert)
    }

    override fun getItemCount() = 10

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageItemAdvert: ImageView = itemView.findViewById(R.id.item_advert_card_image_view)
    }
}