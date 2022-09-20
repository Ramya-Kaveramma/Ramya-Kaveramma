package com.robosoft.fragmentlifecycle.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robosoft.fragmentlifecycle.Communicator
import com.robosoft.fragmentlifecycle.R
import kotlinx.android.synthetic.main.fragment_launcher.view.*

class LauncherFragment : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        
        val view = inflater.inflate(R.layout.fragment_launcher, container, false)
        communicator = activity as Communicator

        view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.firstName.text.toString(),view.secondName.text.toString(),view.age.text.toString().toFloat(),view.IDNum.text.toString().toInt(),view.salary.text.toString().toDouble(),view.relocateSwitch.text.toString().toBoolean())
        }
        return view
    }
}
