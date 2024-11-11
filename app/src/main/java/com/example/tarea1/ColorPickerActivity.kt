package com.example.tarea1

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ColorPickerActivity : AppCompatActivity() {
    private lateinit var rvColorCards: RecyclerView
    private lateinit var colorAdapter: ColorAdapter
    private lateinit var abChangeColor: AppCompatButton

    private val colors = listOf(
        Card("V1(20%)", "#33000000"),
        Card("V2(35%)", "#59000000"),
        Card("V3(50%)", "#8020B2AA"),
        Card("V4(65%)", "#A60000CD"),
        Card("V5(80%)", "#CC00FF00"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initcomponents()
        initUI()
        initListeners()
    }

    private fun initcomponents() {
        rvColorCards = findViewById<RecyclerView>(R.id.rvColorCards)
        abChangeColor = findViewById(R.id.abChangeColor)

    }

    private fun initUI() {
        colorAdapter = ColorAdapter(colors)
        rvColorCards.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvColorCards.adapter = colorAdapter

    }

    private fun initListeners() {
        abChangeColor.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_color)
        val btnChangeColor : Button = findViewById(R.id.btnChangeColor)
        val rgBars : RadioGroup = findViewById(R.id.rgBars)
        val rgColors : RadioGroup = findViewById(R.id.rgColors)

        btnChangeColor.setOnClickListener{
            var selectedIdB = rgBars.checkedRadioButtonId
            val selectedRadioButtonB: RadioButton = rgBars.findViewById(selectedIdB)
            var selectedIdC = rgColors.checkedRadioButtonId
            val selectedRadioButtonC: RadioButton = rgColors.findViewById(selectedIdC)

            updateBar(selectedRadioButtonB.text.toString(),selectedRadioButtonC.text.toString());
            dialog.hide()
        }

        dialog.show()
    }

    private fun updateBar( bar : String,  color : String){

        when (bar){

        }

    }

}