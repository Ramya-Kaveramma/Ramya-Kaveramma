package com.robosoft.drawableexample

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.TypedValue
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet as ConstraintSet1

class DetailsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //creating textview
        val textView1 = findViewById<TextView>(R.id.text_view_dailah_id)
        textView1.setText("Dahlia is a genus of bushy, tuberous, herbaceous perennial plants native to Mexico and Central America. A member of the Compositae family of dicotyledonous plants, its garden relatives thus include the sunflower, daisy, chrysanthemum, and zinnia")
        textView1.setTextColor(Color.parseColor("#AA3456"));
        textView1.setGravity(Gravity.LEFT);

        val textView2 = findViewById<TextView>(R.id.text_view_rose_id)
        textView2.setText("A rose is either a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears.")
        textView2.setTextColor(Color.parseColor("#AA3456"));
        textView2.setGravity(Gravity.LEFT);


        //creating button
        val detailButton = findViewById<Button>(R.id.detail_button)
        detailButton.text = "Go Back"

        detailButton.setBackgroundColor(R.drawable.detail_button_color)
        detailButton.setOnClickListener{
            onBackPressed()
        }
    }
}