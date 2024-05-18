package com.example.parcial_vilcatoma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btnprizes: Button = findViewById(R.id.btnprizes)
        val btnteams: Button = findViewById(R.id.btnteams)
        val btnstadiums: Button = findViewById(R.id.btnstadiums)


        btnprizes.setOnClickListener {

            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }

        btnteams.setOnClickListener {

            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)

        }

        btnstadiums.setOnClickListener {

            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)

        }


    }
}