package com.example.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button10: Button = findViewById(R.id.button10)
        val button11: Button = findViewById(R.id.button11)
        val button12: Button = findViewById(R.id.button12)
        val button13: Button = findViewById(R.id.button13)
        val button14: Button = findViewById(R.id.button14)
        val button15: Button = findViewById(R.id.button15)

        val textView: TextView = findViewById(R.id.textView)

        button1.setOnClickListener {
            textView.append("1")
        }

        button2.setOnClickListener {
            textView.append("2")
        }

        button3.setOnClickListener {
            textView.append("3")
        }

        button4.setOnClickListener {
            textView.append("4")
        }

        button5.setOnClickListener {
            textView.append("5")
        }

        button6.setOnClickListener {
            textView.append("6")
        }

        button7.setOnClickListener {
            textView.append("7")
        }

        button8.setOnClickListener {
            textView.append("8")
        }

        button9.setOnClickListener {
            textView.append("9")
        }

        button10.setOnClickListener {
            textView.append("0")
        }

        button11.setOnClickListener {
            textView.append("+")
        }

        button12.setOnClickListener {
            textView.append("-")
        }

        button13.setOnClickListener {
            textView.append("*")
        }

        button14.setOnClickListener {
            textView.append("/")
        }

        button15.setOnClickListener {
            textView.text = ""
        }
    }
}

