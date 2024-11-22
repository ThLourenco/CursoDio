package com.example.cursodioeletriccar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.cursodioeletriccar.databinding.ActivityListaRecyclerViewBinding

class ListaRecyclerView : AppCompatActivity() {
    lateinit var binding: ActivityListaRecyclerViewBinding
    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupList()
    }

    fun setupList(){

        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter


    }
}