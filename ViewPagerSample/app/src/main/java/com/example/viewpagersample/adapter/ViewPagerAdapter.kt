package com.example.viewpagersample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagersample.tabFragment.BlueFragment
import com.example.viewpagersample.tabFragment.BrownFragment
import com.example.viewpagersample.tabFragment.GreenFragment
import com.example.viewpagersample.tabFragment.RedFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return RedFragment()
            }
            1 -> {
                return GreenFragment()
            }
            2 -> {
                return BlueFragment()
            }
            else -> {
                return BrownFragment()
            }

        }
    }
}