package com.example.ensayopruebacerti

import com.google.gson.annotations.SerializedName

data class Cake(
    @SerializedName("id") val id:Int,
    @SerializedName("title") val title:String,
    @SerializedName("previewDescription") val previewDescription:String,
    @SerializedName("size") val size:String,
    @SerializedName("price") val price:Int,
    @SerializedName("image") val image:String

)
