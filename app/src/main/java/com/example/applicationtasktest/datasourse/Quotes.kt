package com.example.example

import com.google.gson.annotations.SerializedName


data class Quotes (

  @SerializedName("links" ) var links : Links? = Links()

)