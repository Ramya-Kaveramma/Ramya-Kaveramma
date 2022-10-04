package com.example.viewpagersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagersample.adapter.viewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager2? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.main_tab_layout)
        viewPager = findViewById(R.id.main_View_Pager)

        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Red")) }
        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Green")) }
        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Blue")) }
        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Brown")) }
        tabLayout?.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = viewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager?.adapter = adapter

        registerOnPageChangeCallback()

        tabLayout?.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager?.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }
        })
    }

}

private fun registerOnPageChangeCallback() {

}
