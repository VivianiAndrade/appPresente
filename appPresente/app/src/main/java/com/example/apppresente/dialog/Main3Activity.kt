package com.example.apppresente.dialog

import android.app.DatePickerDialog
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import com.example.apppresente.R
import com.kd.dynamic.calendar.generator.ImageGenerator
import java.util.*

class Main3Activity : AppCompatActivity() {

    lateinit var mDateEditText:EditText
    lateinit var mCurrentDate:Calendar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        mDateEditText = findViewById(R.id.txtDateEntered) as EditText

        mDateEditText.setOnClickListener(object:View.OnClickListener {
            override fun onClick(view: View) {
                mCurrentDate = Calendar.getInstance()
                val year = mCurrentDate.get(Calendar.YEAR)
                val month = mCurrentDate.get(Calendar.MONTH)
                val day = mCurrentDate.get(Calendar.DAY_OF_MONTH)
                val mDatePicker = DatePickerDialog(this@Main3Activity, DatePickerDialog.OnDateSetListener { datePicker, selectedYear, selectedMonth, selectedDay ->
                    mDateEditText.setText(selectedDay + selectedMonth + selectedYear)
                    mCurrentDate.set(selectedYear, selectedMonth, selectedDay)
                }, year, month, day)
                mDatePicker.show()
            }
        })
    }

}

