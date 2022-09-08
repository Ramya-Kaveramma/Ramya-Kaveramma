package com.robosoft.drawableexample

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //creating textview
        val textViewDailiah = findViewById<TextView>(R.id.text_view_dailah_id)
        textViewDailiah.setText("Dahlia is a genus of bushy, tuberous, herbaceous perennial plants native to Mexico and Central America. A member of the Compositae family of dicotyledonous plants, its garden relatives thus include the sunflower, daisy, chrysanthemum, and zinnia")
        textViewDailiah.setTextColor(Color.parseColor("#AA3456"));
        textViewDailiah.setGravity(Gravity.LEFT);

        val textViewRose = findViewById<TextView>(R.id.text_view_rose_id)
        textViewRose.setText("A rose is either a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears.")
        textViewRose.setTextColor(Color.parseColor("#AA3456"));
        textViewRose.setGravity(Gravity.LEFT);

        //creating button
        val detailButton = findViewById<Button>(R.id.detail_button)
        detailButton.text = "Go Back"

        detailButton.setBackgroundColor(R.drawable.detail_button_color)
        detailButton.setOnClickListener{
            onBackPressed()
        }
    }
}