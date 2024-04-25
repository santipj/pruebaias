package com.example.iasprueba

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iasprueba.empleados.Empleado
import com.example.iasprueba.empleados.GestionEmpleados

class ResultActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val frame = findViewById<FrameLayout>(R.id.frame)

        val textvi = TextView(this)


        val gestion = GestionEmpleados();

        gestion.main();
        for (i in gestion.empleados.indices) {
            val textvi = TextView(this)
            textvi.text = gestion.empleados[i].toString()

            frame.addView(textvi)
        }

    }


}
