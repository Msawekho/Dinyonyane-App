package com.example.map

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class My_sightings : AppCompatActivity() {

    private lateinit var selectedImage: ImageView

    private val getContent = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val selectedImageUri = result.data?.data
            selectedImage.setImageURI(selectedImageUri)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_sightings)

        val buttonHome = findViewById<Button>(R.id.bntBack)
        buttonHome.setOnClickListener {
            val intent = Intent(this, HowItWorks::class.java)
            startActivity(intent)
        }

        selectedImage = findViewById(R.id.selectedImage)
        val btnPhoto: Button = findViewById(R.id.btnphoto)

        btnPhoto.setOnClickListener {
            openGalleryForImage()
        }
    }

    private fun openGalleryForImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        getContent.launch(intent)
    }
}
