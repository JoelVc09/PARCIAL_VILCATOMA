package com.example.parcial_vilcatoma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6) // Configura la vista para la actividad

        val rvSigno: RecyclerView = findViewById(R.id.rvSigno) // Encuentra el RecyclerView en la vista

        rvSigno.layoutManager = LinearLayoutManager(this) // Establece el LinearLayoutManager
        rvSigno.adapter = SignoAdapter(listasigno()) // Establece el adaptador con los datos

        val btngomennu: Button = findViewById(R.id.btngomennu)


        btngomennu.setOnClickListener {

            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)

        }

    }

    private fun listasigno(): List<SignoModel>{
        var lstSong: ArrayList<SignoModel> = ArrayList()

        lstSong.add(
            SignoModel(
                R.drawable.stadio
                ,"Mercedes Benz Stadium"
                ,"2001 - 2023"
                , "7.100"
            )
        )
        lstSong.add(
            SignoModel(
                R.drawable.stadio
                ,"Mercedes Benz Stadium"
                ,"2001 - 2023"
                , "7.100"
            )
        )
        lstSong.add(
            SignoModel(
                R.drawable.stadio
                ,"Mercedes Benz Stadium"
                ,"2001 - 2023"
                , "7.100"
            )
        )
        lstSong.add(
            SignoModel(
                R.drawable.stadio
                ,"Mercedes Benz Stadium"
                ,"2001 - 2023"
                , "7.100"
            )
        )
        return lstSong

    }





}