package com.example.apppresente

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        this@RegistroActivity.title = "Registro de Presenças"
    }
}
