package com.example.apppresente

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apppresente.dialog.AdicionarAlunoActivity
import kotlinx.android.synthetic.main.fab_aluno.*

class ListaAlunosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        this@ListaAlunosActivity.title = "Lista de Alunos"

        addPersonFloatingButton.setOnClickListener {
            val dialog = AdicionarAlunoActivity()
            dialog.show(supportFragmentManager, "AdicionarAluno")
        }
    }
}
