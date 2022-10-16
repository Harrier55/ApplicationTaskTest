package com.example.example

import com.google.gson.annotations.SerializedName


data class PosterImage (

  @SerializedName("tiny"     ) var tiny     : String? = null,
  @SerializedName("large"    ) var large    : String? = null,
  @SerializedName("small"    ) var small    : String? = null,
  @SerializedName("medium"   ) var medium   : String? = null,
  @SerializedName("original" ) var original : String? = null,
  @SerializedName("meta"     ) var meta     : Meta?   = Meta()

)