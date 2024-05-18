package com.example.parcial_vilcatoma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        title = "Sing in "

        val emailSuccess: String = "admin@americancup.com";
        val passwordSuccess: String = "admin123"

        val txtemail: EditText = findViewById(R.id.txtemail)
        val txtPassword: EditText = findViewById(R.id.txtPassword)
        val btnSign: Button = findViewById(R.id.btnSign)

        btnSign.setOnClickListener {
            val email: String = txtemail.text.trim().toString()
            val  password: String = txtPassword.text.trim().toString()

            if ( email == emailSuccess && password == passwordSuccess) {
                val intent = Intent(this,MainActivity4::class.java)
                startActivity(intent)

            } else {

                Toast.makeText(this, "CREDENCIALES INVALIDAS", Toast.LENGTH_SHORT).show()
            }

    }
} }