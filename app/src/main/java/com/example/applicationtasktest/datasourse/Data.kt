package com.example.example

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("id"            ) var id            : String?        = null,
  @SerializedName("type"          ) var type          : String?        = null,
  @SerializedName("links"         ) var links         : Links?         = Links(),
  @SerializedName("attributes"    ) var attributes    : Attributes?    = Attributes(),
  @SerializedName("relationships" ) var relationships : Relationships? = Relationships()

)