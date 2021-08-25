package com.example.ensayopruebacerti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.doAsync
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.ensayopruebacerti.getRetrofit as getRetrofit

// BIENVENIDO ESTA FUCKING CLASE PARA TRABAJAR

    var listCakes:List<Cake> = listOf()
    var listCakeDetails:List<CakeDetail> = listOf()
    lateinit var rvCake:RecyclerView

//val superheroName = view.findViewById(R.id.tvSuperhero) as TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listCakes
        listCakeDetails

        rvCake = findViewById(R.id.rvCakes)
        rvCake.layoutManager(LinearLayoutManager(applicationContext))


    }

    //CREAR EL HILO DOASYNC
    fun loadCakes(){
      
        doAsync {
            listCakes = getRetrofit(0).create(CakeAPI::class.java).getCakes("cake").execute().body()
        }

        }
    }


    // listo metodo retrofit
    fun getRetrofit(mode:Int):Retrofit{

        if (mode == 0){
            return Retrofit.Builder().baseUrl(getString(R.string.endPoint_Cakes)).addConverterFactory(GsonConverterFactory.create()).build()
        }else{
            return Retrofit.Builder().baseUrl(getString(R.string.endPoint_CakeDetails)).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }

}