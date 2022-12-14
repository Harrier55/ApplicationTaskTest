package com.example.example

import com.google.gson.annotations.SerializedName


data class Attributes (

  @SerializedName("createdAt"           ) var createdAt           : String?            = null,
  @SerializedName("updatedAt"           ) var updatedAt           : String?            = null,
  @SerializedName("slug"                ) var slug                : String?            = null,
  @SerializedName("synopsis"            ) var synopsis            : String?            = null,
  @SerializedName("description"         ) var description         : String?            = null,
  @SerializedName("coverImageTopOffset" ) var coverImageTopOffset : Int?               = null,
  @SerializedName("titles"              ) var titles              : Titles?            = Titles(),
  @SerializedName("canonicalTitle"      ) var canonicalTitle      : String?            = null,
  @SerializedName("abbreviatedTitles"   ) var abbreviatedTitles   : ArrayList<String>  = arrayListOf(),
  @SerializedName("averageRating"       ) var averageRating       : String?            = null,
//  @SerializedName("ratingFrequencies"   ) var ratingFrequencies   : RatingFrequencies? = RatingFrequencies(),
  @SerializedName("userCount"           ) var userCount           : Int?               = null,
  @SerializedName("favoritesCount"      ) var favoritesCount      : Int?               = null,
  @SerializedName("startDate"           ) var startDate           : String?            = null,
  @SerializedName("endDate"             ) var endDate             : String?            = null,
  @SerializedName("nextRelease"         ) var nextRelease         : String?            = null,
  @SerializedName("popularityRank"      ) var popularityRank      : Int?               = null,
  @SerializedName("ratingRank"          ) var ratingRank          : Int?               = null,
  @SerializedName("ageRating"           ) var ageRating           : String?            = null,
  @SerializedName("ageRatingGuide"      ) var ageRatingGuide      : String?            = null,
  @SerializedName("subtype"             ) var subtype             : String?            = null,
  @SerializedName("status"              ) var status              : String?            = null,
  @SerializedName("tba"                 ) var tba                 : String?            = null,
  @SerializedName("posterImage"         ) var posterImage         : PosterImage?       = PosterImage(),
  @SerializedName("coverImage"          ) var coverImage          : CoverImage?        = CoverImage(),
  @SerializedName("episodeCount"        ) var episodeCount        : Int?               = null,
  @SerializedName("episodeLength"       ) var episodeLength       : Int?               = null,
  @SerializedName("totalLength"         ) var totalLength         : Int?               = null,
  @SerializedName("youtubeVideoId"      ) var youtubeVideoId      : String?            = null,
  @SerializedName("showType"            ) var showType            : String?            = null,
  @SerializedName("nsfw"                ) var nsfw                : Boolean?           = null

)