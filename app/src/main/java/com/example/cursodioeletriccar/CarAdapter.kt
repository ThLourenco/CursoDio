package com.example.cursodioeletriccar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cursodioeletriccar.data.Carros

class CarAdapter(private val carros: List<Carros>) : RecyclerView.Adapter<CarViewHolder>() {

    //cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return  CarViewHolder(view)
    }

    //pega a quantidade de carros da lista
    override fun getItemCount(): Int = carros.size

    //pegar conteudo da view  e troca pela informaçao de item de uma lista
    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.preco.text =  carros[position].preco
        holder.bateria.text =  carros[position].bateria
        holder.potencia.text =  carros[position].potencia
        holder.recarga.text =  carros[position].recarga
    }
    
}

class CarViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val preco : TextView = view.findViewById(R.id.txt_RCpreço)
    val bateria : TextView = view.findViewById(R.id.txt_RCbateria)
    val potencia : TextView = view.findViewById(R.id.txt_RCpotencia)
    val recarga : TextView = view.findViewById(R.id.txt_RCtemporecarga)


    }