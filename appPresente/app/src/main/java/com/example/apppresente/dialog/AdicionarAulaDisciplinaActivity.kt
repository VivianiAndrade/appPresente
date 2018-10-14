package com.example.apppresente.dialog

import android.app.DatePickerDialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.example.apppresente.R
import java.util.*

class AdicionarAulaDisciplinaActivity : DialogFragment() {

    lateinit var mDateEditText: EditText
    lateinit var mCurrentDate:Calendar

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_adicionar_aula_disciplina, container, false)

        mDateEditText = view?.findViewById(R.id.txtDateEntered) as EditText
        mDateEditText.setOnClickListener(object:View.OnClickListener {
            override fun onClick(view: View) {
                mCurrentDate = Calendar.getInstance()
                val year = mCurrentDate.get(Calendar.YEAR)
                val month = mCurrentDate.get(Calendar.MONTH)
                val day = mCurrentDate.get(Calendar.DAY_OF_MONTH)
                val mDatePicker = DatePickerDialog(context, DatePickerDialog.OnDateSetListener { datePicker, selectedYear, selectedMonth, selectedDay ->
                    mDateEditText.setText(selectedDay + selectedMonth + selectedYear)
                    mCurrentDate.set(selectedYear, selectedMonth, selectedDay)
                }, year, month, day)
                mDatePicker.show()
            }
        })

    }

    }
