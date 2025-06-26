package com.example.pennywise

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonCat = findViewById<Button>(R.id.buttonCat);
        val buttonExp = findViewById<Button>(R.id.buttonExp);
        val buttonAch = findViewById<Button>(R.id.buttonAch);

        //buttons

      buttonCat?.setOnClickListener{
            val intent = Intent(this, Categories::class.java)
            startActivity(intent)
        }

        buttonExp?.setOnClickListener{
            val intent = Intent(this, Expenses::class.java)
            startActivity(intent)
        }

        buttonAch?.setOnClickListener{
            val intent = Intent(this, Achievements::class.java)
            startActivity(intent)
    }
}
}