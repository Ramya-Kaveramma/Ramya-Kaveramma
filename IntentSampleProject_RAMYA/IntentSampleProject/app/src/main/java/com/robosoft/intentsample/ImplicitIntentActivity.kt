package com.robosoft.intentsample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ImplicitIntentActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val openBrowser = findViewById<Button>(R.id.open_browser_button)
        openBrowser.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.robosoftin.com/")
            startActivity(openURL)
        }

        val openDialpad = findViewById<Button>(R.id.open_dialpad_button)
        openDialpad.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+91-8899776688")
            startActivity(intent)
        }

        val openGoogleMap = findViewById<Button>(R.id.open_googleMap_button)
        openGoogleMap.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/maps/dir/13.376575,74.731585/Robosoft,+Udupi+location/@13.3787299,74.7296882,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3bbcbcd3ffffffff:0xaa6468a5ada29205!2m2!1d74.7401981!2d13.3791765")
            startActivity(openURL)
        }
    }
}