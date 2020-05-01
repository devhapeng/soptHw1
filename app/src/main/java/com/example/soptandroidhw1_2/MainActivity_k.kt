package com.example.soptandroidhw1_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity_k : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edit1 = findViewById<View>(R.id.editText_email) as EditText
        var edit2 = findViewById<View>(R.id.editText_pw) as EditText
        var text = findViewById<View>(R.id.textView3) as TextView
        var button = findViewById<View>(R.id.button) as Button

        val intent2 = intent
        val email = intent2.getStringExtra("email")
        val password = intent2.getStringExtra("password")

        edit1.setText(email)
        edit2.setText(password)

        text.setOnClickListener {
            val intent = Intent(applicationContext, SignActivity::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "회원가입을 합니다.", Toast.LENGTH_SHORT).show()
        }

        button.setOnClickListener { Toast.makeText(applicationContext, "로그인 되었습니다.", Toast.LENGTH_SHORT).show() }

    }
}
