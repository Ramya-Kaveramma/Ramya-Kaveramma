package com.robosoft.fragmentlifecycle.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robosoft.fragmentlifecycle.R
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_detail.view.*

class DetailFragment : Fragment() {

    var displayString1: String ? = ""
    var displayString2: String ? = ""
    var displayFloat: String ? = ""
    var displayInt: String ? = ""
    var displayDouble: String ? = ""
    var displayBoolean: String ? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_detail,container,false)

        displayString1 = arguments?.getString("stringValue1")
        view.stringMsg1.text = displayString1

        displayString2 = arguments?.getString("stringValue1")
        view.stringMsg2.text = displayString2

        displayFloat = arguments?.getString("floatValue")
        view.floatMsg.text = displayFloat

        displayInt = arguments?.getString("intValue")
        view.intMsg.text = displayInt

        displayDouble = arguments?.getString("doubleValue")
        view.doubleMsg.text = displayDouble

        displayBoolean = arguments?.getString("booleanValue")
        view.booleanMsg.text = displayBoolean

        return view
    }
}