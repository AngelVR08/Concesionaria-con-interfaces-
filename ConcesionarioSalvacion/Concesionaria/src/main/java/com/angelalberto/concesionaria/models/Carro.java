package com.angelalberto.concesionaria.models;

public class Carro extends Vehiculo {
    protected String numeroDePuertas;
    protected String cantidadDePasajeros;

    public void setNumeroDePuertas(String numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public void setCantidadDePasajeros(String cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public String toString() {
        return "Carro {" +
                ", Modelo='" + modelo + '\'' +
                ", Placa='" + placa + '\'' +
                ", Color='" + color + '\'' +
                ", Fecha de publicacion='" + fechaDePublicacion + '\'' +
                ", Numero de puertas='" + numeroDePuertas + '\'' +
                ", Cantidad de pasajeros='" + cantidadDePasajeros + '\'' +
                '}';
    }
}
