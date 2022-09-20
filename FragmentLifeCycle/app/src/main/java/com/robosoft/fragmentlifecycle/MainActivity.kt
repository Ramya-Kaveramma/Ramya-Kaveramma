package com.robosoft.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robosoft.fragmentlifecycle.fragments.DetailFragment
import com.robosoft.fragmentlifecycle.fragments.LauncherFragment

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = LauncherFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentA).commit()
    }



    override fun passDataCom(
        firstName: String,
        secondName: String,
        age: Float,
        IDNum: Int,
        salary: Double,
        relocateSwitch: Boolean
    ) {
        val bundle =  Bundle()
        bundle.putString("stringValue1", firstName)
        bundle.putString("stringValue1", secondName)
        bundle.putString("floatValue", age.toString())
        bundle.putString("intValue", IDNum.toString())
        bundle.putString("doubleValue", salary.toString())
        bundle.putString("booleanValue", relocateSwitch.toString())

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = DetailFragment()
        fragmentB.arguments = bundle

        transaction.replace(R.id.fragment_container,fragmentB)
        transaction.commit()
    }
}



