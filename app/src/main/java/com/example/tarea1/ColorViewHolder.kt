package com.example.tarea1

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(view: View) : RecyclerView.ViewHolder(view){
    private val cvVertColor: CardView = view.findViewById(R.id.cvVertColor)
    private val tvVertColor: TextView = view.findViewById(R.id.tvVertColor)

    fun render(cardColor: Card){
        var color = Color.parseColor(cardColor.color)
        var name = cardColor.name
        cvVertColor.setCardBackgroundColor(color)
        cvVertColor.setTag(cardColor.name)
        tvVertColor.setText(name)


    }
}