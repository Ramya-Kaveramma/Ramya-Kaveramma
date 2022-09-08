package com.robosoft.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LifeCycleFirstActivity : AppCompatActivity() {

    var textview : TextView? = null
    var msg = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_first_activity)

        val launchSecondActivityBtn = findViewById<Button>(R.id.launch_scnd_button)

        launchSecondActivityBtn.setOnClickListener {
            val intent = Intent(this, LifeCycleSecondActivity::class.java)
            startActivity(intent)
        }
        textview = findViewById(R.id.Display_textview)
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
