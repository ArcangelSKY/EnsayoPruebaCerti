package com.example.ensayopruebacerti

import com.google.gson.annotations.SerializedName

data class CakeDetail(
    @SerializedName("id") val id:Int,
    @SerializedName("title") val title:String,
    @SerializedName("previewDescription") val previewDescription:String,
    @SerializedName("detailDescription") val detailDescription:String,
    @SerializedName("image") val image:String,
    @SerializedName("shape") val shape:String,
    @SerializedName("size") val size:String,
    @SerializedName("price") val price:Int,
    @SerializedName("lastPrice") val lastPrice:Int,
    @SerializedName("delivery") val delivery:Boolean
)
