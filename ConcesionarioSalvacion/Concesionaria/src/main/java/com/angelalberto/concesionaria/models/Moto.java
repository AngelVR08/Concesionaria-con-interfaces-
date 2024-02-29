package com.angelalberto.concesionaria.models;

public class Moto extends Vehiculo{
    protected String cilindros;

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Moto {" +
                ", Modelo='" + modelo + '\'' +
                ", Placa='" + placa + '\'' +
                ", Color='" + color + '\'' +
                ", Fecha de publicacion='" + fechaDePublicacion + '\'' +
                ", Cilindros='" + cilindros + '\'' +
                '}';
    }
}
