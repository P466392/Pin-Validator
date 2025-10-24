package com.example.pinvalidator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var tvResult: TextView? = null // nullable for null value
    val pin = 1234
    var userPin = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult = findViewById<TextView>(R.id.tvResult) // Result TextView
        var btnEnter = findViewById<Button>(R.id.btnEnter) // Enter button

        btnEnter.setOnClickListener {
            if (userPin == pin) {
                tvResult?.text = "ACCESS GRANTED!!!"
                var btnEnter = findViewById<Button>(R.id.btnEnter)
                btnEnter.isEnabled = false // disable if Access Granted
            } else {
                tvResult?.text = "INVALID PIN!!!"
            }
            userPin = 0
        }

        var btn1 = findViewById<Button>(R.id.btnOne)
        btn1.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn2 = findViewById<Button>(R.id.btnTwo)
        btn2.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn3 = findViewById<Button>(R.id.btnThree)
        btn3.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn4 = findViewById<Button>(R.id.btnFour)
        btn4.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn5 = findViewById<Button>(R.id.btnFive)
        btn5.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn6 = findViewById<Button>(R.id.btnSix)
        btn6.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn7 = findViewById<Button>(R.id.btnSeven)
        btn7.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn8 = findViewById<Button>(R.id.btnEight)
        btn8.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn9 = findViewById<Button>(R.id.btnNine)
        btn9.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }

        var btn0 = findViewById<Button>(R.id.btnZero)
        btn0.setOnClickListener {
            userPin = userPin * 10 + ((it as Button).text).toString().toInt()
        }
    }
}