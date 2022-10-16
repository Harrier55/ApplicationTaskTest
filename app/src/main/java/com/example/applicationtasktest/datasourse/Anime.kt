package com.example.example

import com.google.gson.annotations.SerializedName


data class Anime (

  @SerializedName("data"  ) var data  : ArrayList<Data> = arrayListOf(),
  @SerializedName("meta"  ) var meta  : Meta?           = Meta(),
  @SerializedName("links" ) var links : Links?          = Links()

)