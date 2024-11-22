package com.example.cursodioeletriccar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.cursodioeletriccar.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.vp_view_page)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager2.currentItem = it.position
                }

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }


        })

        binding.btnListView.setOnClickListener{

            val iList = Intent(this, ListView::class.java)
            startActivity(iList)
        }
        binding.btnRecyclerview.setOnClickListener{
            val recycler = Intent(this, ListaRecyclerView::class.java)
            startActivity(recycler)
        }

        setupTabs()

        }

        fun setupTabs(){

            val tabsAdapter = TabsAdapter(this)
            viewPager2.adapter = tabsAdapter

        }
        

}