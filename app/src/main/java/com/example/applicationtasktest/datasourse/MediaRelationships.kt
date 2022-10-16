package com.example.example

import com.google.gson.annotations.SerializedName


data class MediaRelationships (

  @SerializedName("links" ) var links : Links? = Links()

)