package com.example.example

import com.google.gson.annotations.SerializedName


data class StreamingLinks (

  @SerializedName("links" ) var links : Links? = Links()

)