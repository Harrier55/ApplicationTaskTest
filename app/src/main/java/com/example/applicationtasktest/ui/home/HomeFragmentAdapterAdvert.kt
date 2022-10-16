package com.example.applicationtasktest.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.applicationtasktest.R
import com.example.applicationtasktest.domain.AdvertEntity

class HomeFragmentAdapterAdvert: RecyclerView.Adapter<HomeFragmentAdapterAdvert.ItemViewHolder>() {

    private var listItems = mutableListOf<AdvertEntity>()

    @SuppressLint("NotifyDataSetChanged")
    fun updateListItems(list: List<AdvertEntity>) {
        this.listItems = list as MutableList<AdvertEntity>
        notifyDataSetChanged()
    }

    override fun getItemCount() = listItems.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_advert, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       Glide.with(holder.itemView.context)
           .load(listItems[position].advertImage)
           .into(holder.imageItemAdvert)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageItemAdvert:ImageView = itemView.findViewById(R.id.item_advert_card_image_view)
    }
}

