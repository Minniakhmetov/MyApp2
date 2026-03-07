package com.example.myapp2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonStart = findViewById<Button>(R.id.button_start)
        buttonStart.setOnClickListener {
            Toast.makeText(this,"Start", Toast.LENGTH_SHORT).show()
        }

        val buttonStop = findViewById<Button>(R.id.button_stop)
        buttonStop.setOnClickListener {
            Toast.makeText(this,"Stop", Toast.LENGTH_SHORT).show()
        }

        val buttonDelete = findViewById<Button>(R.id.button_delete)
        buttonDelete.setOnClickListener {
            Toast.makeText(this,"Delete", Toast.LENGTH_SHORT).show()
        }

        val buttonOpen = findViewById<Button>(R.id.button_open)
        buttonOpen.setOnClickListener {
            Toast.makeText(this,"Open", Toast.LENGTH_SHORT).show()
        }
    }
}
