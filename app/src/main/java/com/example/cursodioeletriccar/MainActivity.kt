package com.example.cursodioeletriccar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cursodioeletriccar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnListView.setOnClickListener{

            val iList = Intent(this, ListView::class.java)
            startActivity(iList)
        }
        binding.btnRecyclerview.setOnClickListener{
            val recycler = Intent(this, ListaRecyclerView::class.java)
            startActivity(recycler)
        }


        }

        

}