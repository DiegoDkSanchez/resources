package com.resources.models

class Bus(
    override val ruedas: Int,
    override val color: String,
    override val asientos: Int,
    val ruta: String
) : Vehiculo()