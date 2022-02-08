package com.example.myapplication112

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class UserNameActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_name)

        val editText_1 = findViewById<EditText>(R.id.editTextTextPersonName1)
        val editText_2 = findViewById<EditText>(R.id.editTextTextPersonName2)

        val button1 = findViewById<AppCompatButton>(R.id.button1)
        val button2 = findViewById<AppCompatButton>(R.id.button2)

        val intent = Intent(this, SecondActivity::class.java)

        button1.setOnClickListener(object : View.OnClickListener { // описать сохранение editText1 и editText2
            override fun onClick(p0: View?) {

            }
        })

        button2.setOnClickListener(object :
            View.OnClickListener { // описать события при вводе информации и сохранении информации о работе
            override fun onClick(v: View?) {
                // intent.putExtra("result", editText_1.text.toString() + editText_2.text.toString())
                startActivity(intent)
            }
        })
    }

    //предусмотреть ситуацию, что activity может упасть, сделать восстановление состояния
}