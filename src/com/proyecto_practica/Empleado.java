package com.proyecto_practica;

public class Empleado extends Persona{

    public Empleado(String nombre, int edad, String puesto){
        super(nombre, edad);
        this.puesto = puesto;

    }

    public String mostrarDetalles(){
        return "El puesto del cliente es: " + puesto;
    }

    private String puesto;
}
