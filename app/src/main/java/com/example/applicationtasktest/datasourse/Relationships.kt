package com.example.example

import com.google.gson.annotations.SerializedName


data class Relationships (

  @SerializedName("genres"             ) var genres             : Genres?             = Genres(),
  @SerializedName("categories"         ) var categories         : Categories?         = Categories(),
  @SerializedName("castings"           ) var castings           : Castings?           = Castings(),
  @SerializedName("installments"       ) var installments       : Installments?       = Installments(),
  @SerializedName("mappings"           ) var mappings           : Mappings?           = Mappings(),
  @SerializedName("reviews"            ) var reviews            : Reviews?            = Reviews(),
  @SerializedName("mediaRelationships" ) var mediaRelationships : MediaRelationships? = MediaRelationships(),
  @SerializedName("characters"         ) var characters         : Characters?         = Characters(),
  @SerializedName("staff"              ) var staff              : Staff?              = Staff(),
  @SerializedName("productions"        ) var productions        : Productions?        = Productions(),
  @SerializedName("quotes"             ) var quotes             : Quotes?             = Quotes(),
  @SerializedName("episodes"           ) var episodes           : Episodes?           = Episodes(),
  @SerializedName("streamingLinks"     ) var streamingLinks     : StreamingLinks?     = StreamingLinks(),
  @SerializedName("animeProductions"   ) var animeProductions   : AnimeProductions?   = AnimeProductions(),
  @SerializedName("animeCharacters"    ) var animeCharacters    : AnimeCharacters?    = AnimeCharacters(),
  @SerializedName("animeStaff"         ) var animeStaff         : AnimeStaff?         = AnimeStaff()

)