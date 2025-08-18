package com.example.wishoclock

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wishoclock.R.id.add_wish_btn

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val topBar_Title = findViewById<TextView>(R.id.topbar_Text)
        val subtitle = findViewById<TextView>(R.id.subtitle)
        val add_wish_btn : Button = findViewById<Button>(add_wish_btn)

    }
}