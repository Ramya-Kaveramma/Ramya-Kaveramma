package com.robosoft.activityresult

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ChoosePhoto : AppCompatActivity() {

    private val cameraRequest = 1888
    private val pickImage = 100
    lateinit var imageViewCamera: ImageView
    lateinit var galleryButton: Button
    lateinit var photoButton: Button
    private var imageUri: Uri? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_photo)


        title = "KotlinApp"

        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_DENIED
        )
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                cameraRequest
            )

        imageViewCamera = findViewById(R.id.imageViewCamera)

        val photoButton: Button = findViewById(R.id.photoButton)
        val galleryButton: Button = findViewById(R.id.galleryButton)


        photoButton.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, cameraRequest)
        }

        galleryButton.setOnClickListener{
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == cameraRequest){
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            imageViewCamera.setImageBitmap(photo)
        }
        if (resultCode == RESULT_OK && requestCode == pickImage){
            imageUri = data?.data
            imageViewCamera.setImageURI(imageUri)
        }
    }



}