package com.example.mad_practical_4_21012011050

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.loginButton)
        button1.setOnClickListener {
            Login()
        }

        val button2 = findViewById<Button>(R.id.SignUpButton)
        button2.setOnClickListener {
            SignUp()
        }

    }

    fun Login() {
        Intent(this@MainActivity, LoginActivity::class.java).also {
            startActivity(it) }

    }
    fun SignUp() {
        Intent(this@MainActivity, RegistrationActivity::class.java).also {
            startActivity(it) }
    }
    fun Login3() {
        Intent(this@MainActivity, RegistrationActivity::class.java).also {
            startActivity(it) }
    }
    fun Login4() {
        Intent(this@MainActivity, LoginActivity::class.java).also {
            startActivity(it) }

    }

}


