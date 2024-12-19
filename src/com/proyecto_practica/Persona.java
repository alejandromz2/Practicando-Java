package com.proyecto_practica;

abstract public class Persona {

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String dameNombre(){
        return nombre;
    }

    public int dameEdad(){
        return edad;
    }

    private String nombre;
    private int edad;
    public abstract String mostrarDetalles();
}
