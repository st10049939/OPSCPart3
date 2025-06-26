package com.example.pennywise

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUser = findViewById<EditText>(R.id.editTextUser);
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword);
        val buttonLogin = findViewById<Button>(R.id.buttonLogin);
        val buttonCreate = findViewById<Button>(R.id.buttonCreate)

        buttonLogin.setOnClickListener {

            val name = editTextUser.text.toString()
            val password = editTextPassword.text.toString()


            if (name.isBlank()) {
                editTextUser.error = "Username cannot be empty"
                return@setOnClickListener


            }
            if (password.isBlank()){
                editTextPassword.error = "Password cannot be empty"
                return@setOnClickListener

            }

            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        buttonCreate.setOnClickListener {
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
        }

    }
}