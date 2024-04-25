package com.example.iasprueba

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iasprueba.empleados.GestionEmpleados

class ListaActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        btnStart.setOnClickListener {



                val intent = Intent(this, ResultActivity::class.java)

                startActivity(intent)

        }

    }
}