package com.example.ensayopruebacerti

import android.app.Application
import androidx.room.Database
import androidx.room.Room

class CakeApp: Application() {
    companion object{
        lateinit var databaseApp:BaseDeDatos
    }

    override fun onCreate() {
        super.onCreate()
        CakeApp.databaseApp = Room.databaseBuilder(this, BaseDeDatos::class.java,"app-db").build()
    }
}