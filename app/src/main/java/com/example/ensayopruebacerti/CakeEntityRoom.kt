package com.example.ensayopruebacerti

import androidx.room.Entity
import androidx.room.PrimaryKey

//hemos creado la tabla para la BD
@Entity(tableName = "cake_entity") // nombre de la tabla
data class CakeEntityRoom(
        //Atributos de la tabla
        @PrimaryKey val id:Int,
        val title:String,
        val previewDescription:String,
        val size:String,
        val price:Int,
        val image:String

)
