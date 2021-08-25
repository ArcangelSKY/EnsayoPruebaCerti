package com.example.ensayopruebacerti

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

//hemos creado la tabla para la BD
@Entity(tableName = "cake_detail_entity")
data class CakeDetailEntityRoom(
        // atributos de la tabla
        @PrimaryKey val id:Int,
        val title:String,
        val detailDescription:String,
        val image:String,
        val shape:String,
        val size:String,
        val price:Int,
        val lastPrice:Int,
        val delivery:Boolean
)
