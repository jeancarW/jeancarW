package com.example.juninturistico

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the reference to the login button
        val loginButton = findViewById<Button>(R.id.login)

        // Set an onclick listener for the login button
        loginButton.setOnClickListener {
            // Start the second activity
            val intent = Intent(this, IniSesionActivity::class.java)
            startActivity(intent)
        }
    }
}
