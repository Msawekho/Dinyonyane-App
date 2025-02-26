package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonHome = findViewById<Button>(R.id.bntBack)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)}

        val buttonOut = findViewById<Button>(R.id.btnLogOut)
        buttonOut.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)}
    }
}