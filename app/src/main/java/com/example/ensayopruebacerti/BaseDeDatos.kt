package com.example.ensayopruebacerti

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(CakeEntityRoom::class,CakeDetailEntityRoom::class),version = 1)
abstract class BaseDeDatos : RoomDatabase() {
    abstract fun taskDao(): CakeDAO
}