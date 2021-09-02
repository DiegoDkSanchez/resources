package com.resources.models;

public class CalculadorViajeJava {

    String tipoDeViaje;

    public CalculadorViajeJava(String tipoDeViaje) {

        for(int i = 1; i>10; i++) {

        }

        this.tipoDeViaje = tipoDeViaje;
    }

    public void mostrarTipoDeViaje() {
        if (tipoDeViaje != null) {
            System.out.println(tipoDeViaje);
        }
    }

}
