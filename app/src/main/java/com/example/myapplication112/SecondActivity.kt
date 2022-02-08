package com.example.myapplication112

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // val arguments = intent.extras  ловим данные из предыдущей activity
        // val data = arguments?.get("result").toString()

        val button = findViewById<AppCompatButton>(R.id.button3)

        button.setOnClickListener(object : View.OnClickListener {//здесь возврат в предыдущую activity
        override fun onClick(v: View?) {
            //  intent.putExtra("result", editText_1.text.toString() + editText_2.text.toString())
            //   startActivity(intent)
        }
        })
    }
}