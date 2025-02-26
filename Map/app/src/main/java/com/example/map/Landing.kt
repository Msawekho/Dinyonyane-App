package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Landing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val buttonHome = findViewById<Button>(R.id.button2)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)}
    }
}