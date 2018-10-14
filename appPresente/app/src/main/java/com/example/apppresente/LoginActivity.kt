package com.example.apppresente

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apppresente.dialog.AdicionarAlunoActivity
import com.example.apppresente.dialog.Main3Activity
import com.example.apppresente.dialog.SignUpDialogFragment
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        createAccountLink.setOnClickListener {
            val dialog = SignUpDialogFragment()
            dialog.show(supportFragmentManager, "SignUpDialog")
        }
    }
    fun telaProfessor(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
