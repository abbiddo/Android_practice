package com.sy.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculation=findViewById<TextView>(R.id.calculation)

        findViewById<Button>(R.id.button0).setOnClickListener{
            calculation.text=button0.text
        }
    }
}