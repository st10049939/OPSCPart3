package com.example.pennywise

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import java.util.Calendar

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)




        /*data class CategoryTotal(
            val category: String,
            val total: Double
        )*/


    }
    /*class ExpenseViewModel(application: Application) : AndroidViewModel(application) {
        private val expenseDao = AppDabase.getDatabase(application).expenseDao()

        fun getCategoryTotals(start: Long, end: Long): LiveData<List<CategoryTotal>> {
            return expenseDao.getTotalSpentByCategoryBetweenDates(start, end)
        }
    }
*/


            }



