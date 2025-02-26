package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonHome = findViewById<Button>(R.id.btnSignUp)
        buttonHome.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)}
    }
}