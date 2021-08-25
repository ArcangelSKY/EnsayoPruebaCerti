package com.example.ensayopruebacerti

import androidx.room.Insert
import androidx.room.Query

interface CakeDAO {
    //
    @Insert
    fun addCake(cakeEntidad:CakeEntityRoom)
    // anotacion de BD
    @Query("SELECT * from cake_entity")
    fun getAllCakes():List<CakeEntityRoom>
    // anotacion metodo

    @Query("SELECT * from cake_entity WHERE id=:id")
    fun getCakeById(id:Int)

    @Insert
    fun addCakeDetails(cakeDetallesEntidad:CakeDetailEntityRoom)

    @Query("SELECT * from cake_detail_entity WHERE id=:id")
    fun getCakeDetailsEntity(id:Int):CakeDetailEntityRoom



}