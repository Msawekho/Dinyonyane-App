package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

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