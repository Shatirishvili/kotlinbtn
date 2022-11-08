package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById<Button>(R.id.button)
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "ინფორმაცია შენახულია", Toast.LENGTH_LONG).show()
        }
    }
}