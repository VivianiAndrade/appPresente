package com.example.apppresente.dialog

import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import com.example.apppresente.R
import com.kd.dynamic.calendar.generator.ImageGenerator
import kotlinx.android.synthetic.main.activity_sign_up_dialog_fragment.view.*
import java.util.*

class SignUpDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_sign_up_dialog_fragment, container, false)
    }

}
