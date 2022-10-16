package com.example.example

import com.google.gson.annotations.SerializedName


data class Dimensions (

  @SerializedName("tiny"  ) var tiny  : Tiny?  = Tiny(),
  @SerializedName("large" ) var large : Large? = Large(),
  @SerializedName("small" ) var small : Small? = Small()

)