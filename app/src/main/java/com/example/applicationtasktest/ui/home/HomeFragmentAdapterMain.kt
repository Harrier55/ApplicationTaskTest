package com.example.applicationtasktest.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.applicationtasktest.R
import com.example.applicationtasktest.domain.AnimeEntity

class HomeFragmentAdapterMain : RecyclerView.Adapter<HomeFragmentAdapterMain.ItemViewHolder>() {

    private var listItems = mutableListOf<AnimeEntity>()

    @SuppressLint("NotifyDataSetChanged")
    fun updateListItems(list: List<AnimeEntity>) {
        this.listItems = list as MutableList<AnimeEntity>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_main_anime, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.description.text = listItems[position].description
        Glide.with(holder.itemView.context)
            .load(listItems[position].posterImage)
            .circleCrop()
            .placeholder(R.drawable.placeholder)
            .into(holder.imageItemMain)
    }

    override fun getItemCount() = listItems.size

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageItemMain: ImageView = itemView.findViewById(R.id.image_main_iv)
        var description: TextView = itemView.findViewById(R.id.description_tv)
    }
}