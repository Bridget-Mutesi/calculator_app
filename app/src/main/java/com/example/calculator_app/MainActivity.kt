package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var btn_add: Button
    lateinit var btn_sub: Button
    lateinit var btn_mult: Button
    lateinit var btn_div: Button
    lateinit var etenter: TextView
    lateinit var etenter2: TextView
    lateinit var tvanswer: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validatecalc()

    }

    fun castviews(){
        btn_add = findViewById(R.id.btn_add)
        btn_sub = findViewById(R.id.btn_sub)
        btn_mult = findViewById(R.id.btn_mult)
        btn_div = findViewById(R.id.btn_div)
        etenter = findViewById(R.id.etenter)
        etenter2 = findViewById(R.id.etenter2)
    }
    fun validatecalc(){
        castviews()

        btn_add!!.setOnClickListener {
            val result= etenter.text.toString().toDouble()!!+etenter2.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btn_sub.setOnClickListener {
            val result= etenter.text.toString().toDouble()!!-etenter2.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btn_mult.setOnClickListener {
            val result= etenter.text.toString().toDouble()!! * etenter2.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btn_div.setOnClickListener {
            val result= etenter.text.toString().toDouble()!! % etenter2.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }


   }
}