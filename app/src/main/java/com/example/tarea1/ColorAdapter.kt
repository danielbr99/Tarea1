package com.example.tarea1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ColorAdapter(private val colors : List<Card>) : RecyclerView.Adapter<ColorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.color_card, parent, false)
        return ColorViewHolder(view)
    }

    override fun getItemCount() =  colors.size

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {

        holder.render(colors[position])

    }
}