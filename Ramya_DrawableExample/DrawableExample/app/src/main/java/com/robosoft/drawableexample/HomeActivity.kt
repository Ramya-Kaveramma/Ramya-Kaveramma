package com.robosoft.drawableexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val clickForDetailsButton = findViewById<Button>(R.id.click_for_details_button)
        clickForDetailsButton.setOnClickListener {
            clickbutton()
        }
    }
    private fun clickbutton(){
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }
    }
