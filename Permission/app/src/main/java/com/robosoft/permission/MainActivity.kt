package com.robosoft.permission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    private var textViewPermission: TextView? = null
    private var PERMISSION: Array<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PERMISSION = arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_CONTACTS
        )

        val checkButton: Button = findViewById(R.id.buttonCheck)

        checkButton.setOnClickListener {
            if (checkForInternet(this)) {
                Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Disconnected", Toast.LENGTH_SHORT).show()
            }
        }

        val btnRequestPermission = findViewById<Button>(R.id.btnRequestPermission)
        btnRequestPermission.setOnClickListener {
           if(!hadPermissions(this, PERMISSION!!)){
               ActivityCompat.requestPermissions(this, PERMISSION!!, 1)
           }
        }

        textViewPermission = findViewById(R.id.textViewPermission)
    }

    private fun hadPermissions(context: Context?, vararg PERMISSIONS: Array<String>): Boolean {
        if (context != null && PERMISSIONS != null){
            for (permission in PERMISSIONS) {
                if (ActivityCompat.checkSelfPermission(
                        context,
                        permission.toString()
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    return false
                }
            }
        }
        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        var allowedPermission = ""

        if (requestCode == 1){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                allowedPermission += "Location permission granted\n"
            }else{
                Toast.makeText(this,"Location permission is denied", Toast.LENGTH_SHORT).show()
            }
            if (grantResults[1] == PackageManager.PERMISSION_GRANTED){
                allowedPermission += "Contact permission granted\n"
            }else{
                Toast.makeText(this,"Read contacts permission is denied", Toast.LENGTH_SHORT).show()
            }
            grantPermission(allowedPermission)
        }
    }

    private  fun grantPermission(allowedPermission: String){
        textViewPermission?.text = allowedPermission
    }
}

private fun checkForInternet(context: Context): Boolean {

        // register activity with the connectivity manager service
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false
            return when {
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                else -> false
            }
        } else {
            @Suppress("DEPRECATION") val networkInfo =
                connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }




