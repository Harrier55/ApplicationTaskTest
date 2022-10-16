package com.example.example

import com.google.gson.annotations.SerializedName


data class AnimeCharacters (

  @SerializedName("links" ) var links : Links? = Links()

)