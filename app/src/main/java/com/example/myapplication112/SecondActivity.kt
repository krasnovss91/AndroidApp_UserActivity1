package com.example.myapplication112

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editText = findViewById<EditText>(R.id.editTextTextPersonName3)
        val intent = Intent(this, SecondActivity::class.java)

        // val arguments = intent.extras  ловим данные из предыдущей activity
        // val data = arguments?.get("result").toString()

        val button = findViewById<AppCompatButton>(R.id.button3)

        button.setOnClickListener(object : View.OnClickListener {
            //здесь возврат в предыдущую activity
            override fun onClick(v: View?) {
                intent.putExtra("data", editText.text.toString())
                startActivity(intent)

            }
        })
    }
}