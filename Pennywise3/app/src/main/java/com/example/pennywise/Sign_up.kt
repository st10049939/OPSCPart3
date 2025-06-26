package com.example.pennywise

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class Sign_up : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val editTextUserN =  findViewById<EditText>(R.id.editTextUserN);
        val editTextPassW =  findViewById<EditText>(R.id.editTextPassw);
         val editTextConfirm =  findViewById<EditText>(R.id.editTextConfirm);
         val editTextEmail : EditText =  findViewById<EditText>(R.id.editTextEmail);
         val buttonSign =  findViewById<Button>(R.id.buttonSign);


         buttonSign?.setOnClickListener{

             val name = editTextUserN.text.toString()
             val password = editTextPassW.text.toString()
             val email = editTextEmail.text.toString()
             if (name.isBlank()){
                 editTextUserN.error = "Username cannot be empty "
                 return@setOnClickListener

             }
             else if(email.isBlank()){
                 editTextPassW.error = "Password cannot be empty twin"
                 return@setOnClickListener
             }

             else if(! isValidEmail(email)){
                 editTextEmail.error = "Invalid Email format twin"
                 return@setOnClickListener
             }
         }
     }
     private fun isValidEmail(email: String): Boolean {
         return Patterns.EMAIL_ADDRESS.matcher(email).matches()
     }

}
