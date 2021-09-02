package com.resources.models;

public class BusJava extends VehiculoJava {

    String ruta;

    public BusJava(int ruedas, String color, int asientos, String ruta) {
        super(ruedas, color, asientos);
        this.ruta = ruta;
    }
}
