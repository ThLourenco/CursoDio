package com.example.cursodioeletriccar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
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

class CarFragment: Fragment() {

   lateinit var btnRecyclerview : Button
   lateinit var btnListView : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //o melhor metodo para adicionar os binding é dentro do Onviewcreated pois é depois da view mostra

        setupView()

        btnListView.setOnClickListener{

            startActivity(Intent(context, ListView::class.java))

        }
        btnRecyclerview.setOnClickListener{
            startActivity(Intent(context, RecyclerView::class.java))
        }


    }

    fun setupView(){
        view?.apply {
            btnRecyclerview = findViewById(R.id.btn_recyclerview)
            btnListView = findViewById(R.id.btn_listView)
        }

    }

}