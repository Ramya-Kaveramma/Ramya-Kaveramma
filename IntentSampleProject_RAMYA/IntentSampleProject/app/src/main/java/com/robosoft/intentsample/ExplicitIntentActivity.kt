package com.robosoft.intentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplicitIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        val launchBtn = findViewById<Button>(R.id.launch_button)
        launchBtn.setOnClickListener {
            launchButton()
        }

        val launchImplicitBtn = findViewById<Button>(R.id.launch_implicit_button)
        launchImplicitBtn.setOnClickListener {
            launchImplicitButton()
        }
    }
        private fun launchButton(){
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

    private fun launchImplicitButton(){
        val intent = Intent(this,ImplicitIntentActivity::class.java)
        startActivity(intent)
    }

}