package com.angelalberto.concesionaria.models;

import java.util.ArrayList;

public class ConcesionariaModelo {
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private ArrayList<Empleado> listaDeEmpleado = new ArrayList<>();
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void agregarVehiculos(Vehiculo newVehiculo) {
        listaVehiculos.add(newVehiculo);
    }
    public void agregarEmpleado (Empleado newEmpelado){
        listaDeEmpleado.add(newEmpelado);
    }
    public String imprimirVehiculos(){
        String listaVehiculosImpresa = "";
        for (Vehiculo vehiculo: listaVehiculos){
            listaVehiculosImpresa = listaVehiculosImpresa + vehiculo.toString() + "\n";
        }
        return listaVehiculosImpresa;
    }

    public String imprimirEmpleado(){
        String listaEmpleadoImpresa = "";
        for (Empleado empleado: listaDeEmpleado){
            listaEmpleadoImpresa = listaEmpleadoImpresa + empleado.toString() + "\n";
        }
        return listaEmpleadoImpresa;
    }

}
