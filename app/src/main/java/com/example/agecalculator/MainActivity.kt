package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener {
            val DOB: Int = Integer.parseInt(enterDOB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var Age:Int = currentYear - DOB
            showAge.text = "Your Age is: $Age Years"
        }
    }
}
