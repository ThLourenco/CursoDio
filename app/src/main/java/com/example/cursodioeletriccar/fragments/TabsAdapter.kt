package com.example.cursodioeletriccar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cursodioeletriccar.fragments.FavoriteFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    //implementar construtores
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
      return  when(position){
            0 -> CarFragment()
            1 -> FavoriteFragment()
          else -> CarFragment()
        }
    }
}