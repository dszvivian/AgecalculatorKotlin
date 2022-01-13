package com.example.apkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = findViewById<EditText>(R.id.etDate)
        val done = findViewById<Button>(R.id.btnDone)
        val answer = findViewById<TextView>(R.id.tvAns)

        done.setOnClickListener(View.OnClickListener {
            val year = date.text.toString()
            if(year.isNullOrBlank()){
                answer.text = "Invalid Year"
            }
            else{
                answer.text = calAge(year)
            }
        })

    }

    private fun calAge(year:String): String {
        val year = year.toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        return if (currentYear < year){
            "Enter Correct Year"
        }else{
            "You are ${currentYear - year} year's old"
        }
    }

}