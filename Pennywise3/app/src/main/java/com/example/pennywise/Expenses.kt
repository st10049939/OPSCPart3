package com.example.pennywise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import java.util.Date;
class Expenses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses)

        data class ExpenseEntry(
            val date: String,
            val startTime: String,
            val endTime: String,
            val description: String,
            val category: String,
        )

        val editTextDate = findViewById<EditText>(R.id.editTextDate)
        val editTextStartTime = findViewById<EditText>(R.id.editTextStartTime)
        val editTextEndTime = findViewById<EditText>(R.id.editTextEndTime)
        val editTextDescription = findViewById<EditText>(R.id.editTextDescription)
        val spinnerCategory = findViewById<Spinner>(R.id.spinnerCategory)
        val btnSaveExpense = findViewById<Button>(R.id.btnSaveExpense)

        // Set up category spinner
        val categories = arrayOf("Business", "Food", "Travel", "Supplies")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCategory.adapter = adapter

        // Save button click listener
        btnSaveExpense.setOnClickListener {
            val date = editTextDate.text.toString()
            val startTime = editTextStartTime.text.toString()
            val endTime = editTextEndTime.text.toString()
            val description = editTextDescription.text.toString()
            val category = spinnerCategory.selectedItem.toString()

            if (date.isEmpty() || startTime.isEmpty() || endTime.isEmpty() || description.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Create the expense entry
                val expense = ExpenseEntry(date, startTime, endTime, description, category)

                // Handle saving logic here (e.g., saving to a database or list)

                // Example: Show a Toast message
                Toast.makeText(this, "Expense Saved: $expense", Toast.LENGTH_SHORT).show()

                // Optionally, navigate back or reset the form
                finish()
                val expenseList = mutableListOf<ExpenseEntry>()

// To save the expense
                expenseList.add(expense)
            }


        }

}

    }








