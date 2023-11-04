package com.example.mad_practical_4_21012011050

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val button4 = findViewById<Button>(R.id.signuptologin)
        button4.setOnClickListener {
            login4()
        }
    }

        fun login4() {
            Intent(this@RegistrationActivity, LoginActivity::class.java).also {
                startActivity(it)
            }

        }
    }
