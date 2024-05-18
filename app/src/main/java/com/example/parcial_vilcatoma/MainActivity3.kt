package com.example.parcial_vilcatoma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtamount: EditText = findViewById(R.id.txtamount)
        val btncalcular: Button = findViewById(R.id.btncalcular)

        val txtprimer: TextView = findViewById(R.id.txtprimer)
        val txtsegundo: TextView = findViewById(R.id.txtsegundo)
        val txtercero: TextView = findViewById(R.id.txtercero)
        val txtcuarto: TextView = findViewById(R.id.txtcuarto)

        val btnmenu: Button = findViewById(R.id.btnmenu)

        btncalcular.setOnClickListener {

            val amount = txtamount.text.toString()

            val amoutt = amount.toDouble()

            val uno = 0.25
            val dos = 0.15
            val tres = 0.10

            val imc = (amoutt * uno)
            val imc1 = (amoutt * dos )
            val imc2 = (amoutt * tres)
            val imc3 = (amoutt -(imc+imc1+imc2))/13

            txtprimer.text = " 1st Place : %.2f".format(imc)+"USD"
            txtsegundo.text = " 2nd Place : %.2f".format(imc1)+"USD"
            txtercero.text = "3rd Place : %.2f".format(imc2)+"USD"
            txtcuarto.text = "4th to 16th Place :  %.2f".format(imc3)+"USD"

        }

        btnmenu.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }



    }
}