package com.angelalberto.concesionaria.models;

public class Empleado {
    protected String nombre;
    protected String edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "Nombre='" + nombre + '\'' +
                ", Edad='" + edad + '\'' +
                '}';
    }
}
