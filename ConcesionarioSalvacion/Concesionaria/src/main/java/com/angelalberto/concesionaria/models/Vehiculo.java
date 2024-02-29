package com.angelalberto.concesionaria.models;

import java.util.Objects;

public class Vehiculo {
    protected String modelo;
    protected String placa;
    protected String color;
    protected String fechaDePublicacion;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", fechaDePublicacion='" + fechaDePublicacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(placa, vehiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}
