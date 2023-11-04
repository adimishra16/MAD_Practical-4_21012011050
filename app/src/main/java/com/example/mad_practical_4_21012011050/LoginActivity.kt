package com.example.mad_practical_4_21012011050

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button3 = findViewById<Button>(R.id.LoginToSignUp)
        button3.setOnClickListener {
            login3()
        }
    }

    fun login3() {
        Intent(this@LoginActivity, RegistrationActivity::class.java).also {
            startActivity(it)
        }

    }
}