package com.example.map

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Birds_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds_details)

        val buttonHome = findViewById<Button>(R.id.bntBack)
        buttonHome.setOnClickListener {
            val intent = Intent(this, HowItWorks::class.java)
            startActivity(intent)}

        // Find your button by its ID
        val openMapsButton = findViewById<Button>(R.id.btnContact2)

        // Set an OnClickListener for the button
        openMapsButton.setOnClickListener {
            // Define the Google Maps URL
            val mapsUrl = "https://www.britannica.com/animal/bird-animal"

            // Create an Intent to open the URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl))

            // Start the intent to open Google Maps
            startActivity(intent)

        }

  }
}