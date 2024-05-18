package com.example.parcial_vilcatoma

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var arrSO = arrayOf("Argentina ",
            "Brazil","Peru","Argentina OS",
            "Argentina OS","Argentina Argentina","Argentina",
            "Brazil Brazil 1", "Argentina Argentina 2")

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)


        }

        val lsvSistemasOperativos: ListView = findViewById(R.id.lvTeam)
        val adaptador: Any? = ArrayAdapter<Any?>(this,
            android.R.layout.simple_list_item_1,
            arrSO)
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos
            .setOnItemClickListener { parent, view, position, id ->
                Toast.makeText(applicationContext,
                    "Posición: $position",
                    Toast.LENGTH_LONG).show()
            }
    }
}