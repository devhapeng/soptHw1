package com.example.soptandroidhw1_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class SignActivity : AppCompatActivity() {

    private var editText1: EditText? = null
    private var editText2: EditText? = null

    private var button1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_activity)


        editText1 = findViewById<View>(R.id.editText1) as EditText
        editText2 = findViewById<View>(R.id.editText2) as EditText

        button1 = findViewById<View>(R.id.button) as Button
        button1!!.setOnClickListener(object : Button.OnClickListener {
            override fun onClick(v: View) {

                Toast.makeText(applicationContext, "가입완료를 축하합니다.", Toast.LENGTH_SHORT).show()

                val email = editText1!!.text.toString()
                val password = editText2!!.text.toString()

                val intent = Intent(this@SignActivity, MainActivity::class.java)

                intent.putExtra("email", email)
                intent.putExtra("password", password)

                startActivity(intent)

            }
        })

    }
}
