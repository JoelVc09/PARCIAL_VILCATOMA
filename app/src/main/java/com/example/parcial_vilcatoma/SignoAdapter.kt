package com.example.parcial_vilcatoma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SignoAdapter(private var lstSong: List<SignoModel>):
    RecyclerView.Adapter<SignoAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView9: TextView = itemView.findViewById(R.id.textView9)
        val txtlugar: TextView = itemView.findViewById(R.id.txtlugar)
        val txtnombre: ImageView = itemView.findViewById(R.id.txtnombre)
        val txtnumero: TextView = itemView.findViewById(R.id.txtnumero)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            layoutInflater
                .inflate(R.layout.itemestadio
                    ,parent
                    ,false))
    }

    override fun onBindViewHolder(holder: SignoAdapter.ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.txtnombre.setImageResource(itemSong.image)
        holder.textView9.text = itemSong.nombre
        holder.txtlugar.text = itemSong.lugar
        holder.txtnumero.text = itemSong.numero

    }
    override fun getItemCount(): Int {
        return lstSong.size
    }

}