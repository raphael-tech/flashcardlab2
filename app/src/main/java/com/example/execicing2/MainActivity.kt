package com.example.execicing2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashCardQuestion=findViewById<TextView>(R.id.flashCardQuestion)
        flashCardQuestion.setOnClickListener {
            flashCardQuestion.visibility = View.INVISIBLE
            findViewById<TextView>(R.id.flashCardAnswer).visibility = View.VISIBLE
        }
        val flashCardAnswer=findViewById<TextView>(R.id.flashCardAnswer)
        flashCardAnswer.setOnClickListener {
            flashCardAnswer.visibility = View.INVISIBLE
            findViewById<TextView>(R.id.flashCardQuestion).visibility = View.VISIBLE
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}