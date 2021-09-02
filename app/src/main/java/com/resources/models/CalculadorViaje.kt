package com.resources.models

class CalculadorViaje(val tipoDeViaje: String?) {

    val alumnoCreado : Alumno? = null

    fun mostrarTipoDeViaje() {

        for(i in 0..10) {

        }

        tipoDeViaje?.let {
            println(tipoDeViaje)
        }
    }


}