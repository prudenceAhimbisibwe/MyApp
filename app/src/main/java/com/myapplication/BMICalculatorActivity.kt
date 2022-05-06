package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TtsSpan
import android.widget.Button

class BMICalculatorActivity : AppCompatActivity() {
    lateinit var btnMoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)
        btnMoney=findViewById(R.id.btnMoney)
        btnMoney.setOnClickListener{
            val intent=Intent(this,MobileMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}