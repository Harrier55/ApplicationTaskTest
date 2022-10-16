package com.example.example

import com.google.gson.annotations.SerializedName


data class Titles (

  @SerializedName("en"    ) var en   : String? = null,
  @SerializedName("en_jp" ) var enJp : String? = null,
  @SerializedName("ja_jp" ) var jaJp : String? = null

)