package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val buttonHome = findViewById<Button>(R.id.btnLogIn)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)}
    }
}