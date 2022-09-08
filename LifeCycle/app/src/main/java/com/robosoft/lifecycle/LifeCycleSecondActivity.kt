package com.robosoft.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class LifeCycleSecondActivity : AppCompatActivity() {

    var textview : TextView? = null
    var msg = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_second_activity)

        val launchFirstActivityBtn = findViewById<Button>(R.id.launchFirstActivityBtn)
        launchFirstActivityBtn.setOnClickListener {
            val intent = Intent(this, LifeCycleFirstActivity
            ::class.java)
            startActivity(intent)
        }
        textview = findViewById(R.id.secondTextview)
        textview?.text = "onCreate called"
        Log.d(msg, "onCreate invoked")

    }

    override fun onStart() {
        super.onStart()
        textview?.text = "onStart called"
        Log.d(msg, "onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        textview?.text = "onResume called"
        Log.d(msg, "onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        textview?.text = "onPause called"
        Log.d(msg, "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        textview?.text = "onStop called"
        Log.d(msg, "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        textview?.text = "onRestart called"
        Log.d(msg, "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        textview?.text = "onDestroy called"
        Log.d(msg, "onDestroy invoked")
    }

}