package com.example.iasprueba.empleados

import android.util.Log

class GestionEmpleados {
    val empleados = ArrayList<Empleado>()

    fun main(){


        val empleado1 = Empleado()
        empleado1.id = 1
        empleado1.nombre = "Santiago"
        empleado1.apellido = "Diaz"
        empleado1.setSalario(500.0)
        empleados.add(empleado1)

        val empleado2 = Empleado()
        empleado2.id = 2
        empleado2.nombre = "Jose"
        empleado2.apellido = "Lopez"
        empleado2.setSalario(300.0)
        empleados.add(empleado2)

        val empleado3 = Empleado()
        empleado3.id = 3
        empleado3.nombre = "Andres"
        empleado3.apellido = "Mendoza"
        empleado3.setSalario(800.0)
        empleados.add(empleado3)

        val empleado4 = Empleado()
        empleado4.id = 4
        empleado4.nombre = "Manuel"
        empleado4.apellido = "Gonzales"
        empleado4.setSalario(600.0)
        empleados.add(empleado4)

        val empleado5 = Empleado()
        empleado5.id = 5
        empleado5.nombre = "Valentina"
        empleado5.apellido = "Gutierrez"
        empleado5.setSalario(900.0)
        empleados.add(empleado5)


        //calcularPromedioSalario(empleados);


        calcularPromedioSalario(empleados);
        println("main: " + calcularPromedioSalario(empleados))

        listarEmpleados(empleados)
    }

    fun calcularPromedioSalario(empleados: java.util.ArrayList<Empleado>): Double {
        var promedio = 0.0
        for (i in empleados.indices) {
            promedio += empleados[i].salario
        }
        promedio = promedio / empleados.size
        return promedio
    }

    fun listarEmpleados(empleados: java.util.ArrayList<Empleado>) {
        for (i in empleados.indices) {
            empleados[i].toString()
        }
    }
}