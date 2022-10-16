package com.example.example

import com.google.gson.annotations.SerializedName


data class Large (

  @SerializedName("width"  ) var width  : Int? = null,
  @SerializedName("height" ) var height : Int? = null

)