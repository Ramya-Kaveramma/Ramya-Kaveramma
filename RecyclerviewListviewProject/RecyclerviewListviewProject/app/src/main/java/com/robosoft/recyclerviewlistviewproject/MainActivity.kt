package com.robosoft.recyclerviewlistviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listviewFragment = ListviewFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, listviewFragment).commit()
    }

    override fun passDataCommunicator() {

        val transaction = this.supportFragmentManager.beginTransaction()
        val recyclerviewFragment = RecyclerviewFragment()

        transaction.replace(R.id.fragment_container, recyclerviewFragment, null)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}