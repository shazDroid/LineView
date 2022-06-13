package com.shazdroid.lineview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatSpinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lineView = findViewById<LineView>(R.id.lineView)

        val spinner = findViewById<AppCompatSpinner>(R.id.spinner)
        spinner.adapter = ArrayAdapter<Int>(
            this,
            android.R.layout.simple_dropdown_item_1line,
            listOf(40,50,60,70,80)
        )

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                lineView.setLineHeight(spinner.selectedItem as Int)
                lineView.setLineColor(Color.BLACK)
                lineView.setLineWidth(2.5f)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}