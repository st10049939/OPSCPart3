package com.example.pennywise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class Achievements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        val minGoalEditText = findViewById<EditText>(R.id.minGoalEditText)
        val maxGoalEditText = findViewById<EditText>(R.id.maxGoalEditText)

        val saveGoalsButton = findViewById<Button>(R.id.saveGoalsButton)
        saveGoalsButton.setOnClickListener {
            val minGoal = minGoalEditText.text.toString().toDoubleOrNull()
            val maxGoal = maxGoalEditText.text.toString().toDoubleOrNull()

            if (minGoal != null && maxGoal != null) {
                saveGoalsToDatabase(minGoal, maxGoal)
                Toast.makeText(this, "Goals saved", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid goals", Toast.LENGTH_SHORT).show()
            }

        }

    } private fun saveGoalsToDatabase(minGoal: Double, maxGoal: Double) {
        // Save goals to your database or shared preferences
        val sharedPreferences = getSharedPreferences("ExpenseTracker", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putFloat("minGoal", minGoal.toFloat())
        editor.putFloat("maxGoal", maxGoal.toFloat())
        editor.apply()
    }

    


}
