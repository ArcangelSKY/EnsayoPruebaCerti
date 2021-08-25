package com.example.ensayopruebacerti

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CakeAdapter : RecyclerView.Adapter<CakeAdapter.ViewHolder>() {

    var cake: List<Cake> = listOf()
    lateinit var context: Context

    fun CakeAdapter(cake : List<Cake>, context: Context){
        this.cake = cake
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.cake_item_adapter,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cake.get(position)
        holder.bind(item,context)
    }

    override fun getItemCount(): Int {
        return cake.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        fun bind(cake: Cake, context: Context){

        }
    }




}

