package com.example.apppresente

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.fab_add.*
import android.content.Intent
import android.view.View
import com.example.apppresente.dialog.AdicionarAulaDisciplinaActivity
import com.example.apppresente.dialog.SignUpDialogFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFloatingButton.setOnClickListener {
            val dialog = AdicionarAulaDisciplinaActivity()
            dialog.show(supportFragmentManager, "AdicionarAulaDisciplina")
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /** Called when the user taps the Send button  */
    fun listaAlunos(view: View) {
        val intent = Intent(this, ListaAlunosActivity::class.java)
        startActivity(intent)
    }

    fun listaPresencas(view: View) {
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }


}
