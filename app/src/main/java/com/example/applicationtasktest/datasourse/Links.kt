package com.example.example

import com.google.gson.annotations.SerializedName


data class Links (

  @SerializedName("first" ) var first : String? = null,
  @SerializedName("next"  ) var next  : String? = null,
  @SerializedName("last"  ) var last  : String? = null

)