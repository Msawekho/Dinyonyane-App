package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Community : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)

        val buttonHome = findViewById<Button>(R.id.bntBack)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)}
    }
}