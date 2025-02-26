package com.example.map

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        val buttonWorks = findViewById<Button>(R.id.bntBack)
        buttonWorks.setOnClickListener {
            val intent = Intent(this, HowItWorks::class.java)
            startActivity(intent)}

        val buttonLocation = findViewById<Button>(R.id.btnLocation)
        buttonLocation.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}

        // Find your button by its ID
        val openMapsButton = findViewById<Button>(R.id.btnSkip)

        // Set an OnClickListener for the button
        openMapsButton.setOnClickListener {
            // Define the Google Maps URL
            val mapsUrl = "https://www.google.com/maps/dir/-26.1906229,28.0320684/Cumberland+Bird+Sanctuary,+Bryanston,+Sandton,+2191/@-26.1234798,27.9557161,12z/am=t/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1e95746cdec8df0d:0xd188361f1eb82721!2m2!1d28.0037135!2d-26.0563835?entry=ttu"

            // Create an Intent to open the URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl))

            // Start the intent to open Google Maps
            startActivity(intent)

        }

        val openMaps = findViewById<Button>(R.id.btnWorks)

        // Set an OnClickListener for the button
        openMapsButton.setOnClickListener {
            // Define the Google Maps URL
            val mapsUrl = "https://www.google.com/search?q=current%20location&oq=current+loct&gs_lcrp=EgZjaHJvbWUqDAgBEAAYChixAxiABDIGCAAQRRg5MgwIARAAGAoYsQMYgAQyCQgCEAAYChiABDIPCAMQABgKGIMBGLEDGIAEMgkIBBAAGAoYgAQyCQgFEAAYChiABDIJCAYQABgKGIAEMgkIBxAAGAoYgAQyCQgIEAAYChiABDIJCAkQABgKGIAE0gEJMTU1OTRqMWo3qAIAsAIA&sourceid=chrome&ie=UTF-8&ved=2ahUKEwiRnPKO7P-BAxW4hP0HHSz2CcMQ7vgDegQIChAG&dlnr=1"

            // Create an Intent to open the URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl))

            // Start the intent to open Google Maps
            startActivity(intent)


        }

        val addLocation = findViewById<Button>(R.id.btnLocation)

        // Set an OnClickListener for the button
        addLocation.setOnClickListener {
            // Define the Google Maps URL
            val mapsUrl = "https://www.google.com/search?q=current%20location&oq=current+loct&gs_lcrp=EgZjaHJvbWUqDAgBEAAYChixAxiABDIGCAAQRRg5MgwIARAAGAoYsQMYgAQyCQgCEAAYChiABDIPCAMQABgKGIMBGLEDGIAEMgkIBBAAGAoYgAQyCQgFEAAYChiABDIJCAYQABgKGIAEMgkIBxAAGAoYgAQyCQgIEAAYChiABDIJCAkQABgKGIAE0gEJMTU1OTRqMWo3qAIAsAIA&sourceid=chrome&ie=UTF-8&ved=2ahUKEwiRnPKO7P-BAxW4hP0HHSz2CcMQ7vgDegQIChAG&dlnr=1"

            // Create an Intent to open the URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl))

            // Start the intent to open Google Maps
            startActivity(intent)


        }
}
}