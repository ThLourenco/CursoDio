package com.example.cursodioeletriccar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.cursodioeletriccar.databinding.ActivityListViewBinding


class ListView : AppCompatActivity() {

    lateinit var binding: ActivityListViewBinding
    lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupList()

        binding.btnVoltar.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))

        }



    }

    fun setupList(){

        var dados = arrayOf("Cupcake", "donaldo", "Gingerbread", "honeycomb", "ice Cream Sandwich")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)
        binding.listViewTexte.adapter = adapter
    }

    }

