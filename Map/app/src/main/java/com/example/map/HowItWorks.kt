package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call.Details
import android.widget.Button

class HowItWorks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_it_works)

        val buttonHome = findViewById<Button>(R.id.btnHome)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)}


        val buttonWorks = findViewById<Button>(R.id.btnWorks)
        buttonWorks.setOnClickListener {
            val intent = Intent(this, HowItWorks::class.java)
            startActivity(intent)
        }

        val buttonContactUs = findViewById<Button>(R.id.btnContact)
        buttonContactUs.setOnClickListener {
            val intent = Intent(this, ContactUs::class.java)
            startActivity(intent)}

        val buttonLocation = findViewById<Button>(R.id.button)
        buttonLocation.setOnClickListener {
            val intent = Intent(this, Location::class.java)
            startActivity(intent)}

        val buttonDetails = findViewById<Button>(R.id.button15)
        buttonDetails.setOnClickListener {
            val intent = Intent(this, Birds_Details::class.java)
            startActivity(intent)}

        val buttonMy_sightings = findViewById<Button>(R.id.button5)
        buttonMy_sightings.setOnClickListener {
            val intent = Intent(this, My_sightings::class.java)
            startActivity(intent)}

        val buttonSettings = findViewById<Button>(R.id.btnSettings)
        buttonSettings.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)}

        val buttonCommunity = findViewById<Button>(R.id.btnCommunity)
        buttonCommunity.setOnClickListener {
            val intent = Intent(this, Community::class.java)
            startActivity(intent)}


    }
}