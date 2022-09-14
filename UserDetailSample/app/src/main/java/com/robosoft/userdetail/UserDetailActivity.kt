package com.robosoft.userdetail

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class UserDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        displayDetails()
    }
        private fun displayDetails(){
            val userData = intent.getParcelableExtra<DataClassUser>("user")
            val name = findViewById<TextView>(R.id.txtViewFN)
            name.text = "${userData?.firstName.toString()} ${userData?.middleName.toString()} ${userData?.lastName.toString()}"
            val gender = findViewById<TextView>(R.id.txtViewGen)
            gender.text = "${userData?.gender.toString()}"
            val age = findViewById<TextView>(R.id.txtViewAge)
            age.text = "${userData?.age.toString()}"
            val phoneNum = findViewById<TextView>(R.id.txtViewCon)
            phoneNum.text = "${userData?.mobileNum.toString()}"
            val graduation = findViewById<TextView>(R.id.txtViewGrad)
            graduation.text = "${userData?.selectedGraduation.toString()}"
            val mailId = findViewById<TextView>(R.id.txtViewEmail)
            mailId.text = "${userData?.mailId.toString()}"
            val state = findViewById<TextView>(R.id.txtViewState)
            state.text = "${userData?.selectedState.toString()}"
            val marks = findViewById<TextView>(R.id.txtViewMarks)
            marks.text = "${userData?.marks.toString()}"
            val relocate = findViewById<TextView>(R.id.txtViewRelocate)
            relocate.text = "${userData?.relocate.toString()}"
            val passYear = findViewById<TextView>(R.id.txtViewYearOfPass)
            passYear.text = "${userData?.selectedYear.toString()}"
        }
    }
