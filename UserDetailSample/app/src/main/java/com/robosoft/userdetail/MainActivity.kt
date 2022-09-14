package com.robosoft.userdetail

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var selectedGraduation = ""
    var selectedState = ""
    var selectedYear = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        graduationFunction()
        statesFunction()
        yearFunction()

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        saveBtn.setOnClickListener {
            sendData()
        }
    }

    private fun sendData() {
        val firstName = findViewById<EditText>(R.id.txtViewFirstName)?.text.toString()
        val middleName = findViewById<EditText>(R.id.txtViewMiddleName)?.text.toString()
        val lastName = findViewById<EditText>(R.id.txtViewLastName)?.text.toString()
        val gender = findViewById<RadioButton>(findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId)?.text.toString()
        val age = findViewById<EditText>(R.id.age)?.text.toString()
        val phoneNumber = findViewById<TextInputEditText>(R.id.contactNum)?.text.toString()
        val mailId = findViewById<TextInputEditText>(R.id.mailId)?.text.toString()
        val marks = findViewById<EditText>(R.id.marksPer)?.text.toString()
        val relocate =
            if (findViewById<Switch>(R.id.relocateSwitch)?.isChecked.toString() == "true") "Yes" else "No"

        val userData = DataClassUser(
            firstName,
            middleName,
            lastName,
            gender,
            age,
            selectedGraduation,
            phoneNumber,
            mailId,
            selectedState,
            marks,
            relocate,
            selectedYear
        )
        val intent = Intent(this, UserDetailActivity::class.java).also {
            it.putExtra("user", userData)
        }
        startActivity(intent)
    }

    fun graduationFunction() {
        val spinner: Spinner = findViewById(R.id.coursesspinner)
        val spinnerAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.graduation_array,
            android.R.layout.simple_spinner_item
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter
        spinner.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        selectedGraduation = parent?.getItemAtPosition(pos).toString()
        Log.d("Selected value G", selectedGraduation)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    fun statesFunction() {
        val statesArray = resources.getStringArray(R.array.state_names)
        val statesTv = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val stateAdapter = ArrayAdapter(this, R.layout.state_item, statesArray)
        statesTv.setAdapter(stateAdapter)
        statesTv.setOnItemClickListener { adapterView, view, i, l ->
            selectedState = statesArray[i]
            Log.d("Selected state ", selectedState)
        }
    }

    fun yearFunction() {
        val yearArray = arrayListOf<String>("2018-19", "2019-20", "2021-22", "2022-23")
        val passYearTv = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextview_Yop)
        val yearAdapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item, yearArray
        )
        passYearTv.setAdapter(yearAdapter)
        passYearTv.setOnItemClickListener { adapterView, view, i, l ->
            selectedYear = yearArray[i]
            Log.d("Selected Year ", selectedYear)
        }
    }
}
