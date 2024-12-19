package com.proyecto_practica;


class Cliente extends Persona implements Descuento{

    public enum Membresia{REGULAR, PREMIUM}

    public Cliente(String nombre, int edad, Membresia membresia){
        super(nombre, edad);
        this.membresia = membresia;
    }



    public String mostrarDetalles(){
        return "La membresia del cliente es: " + membresia.toString();
    }

    public double aplicarDescuento(){
        return porcentaje;
    }

    private Membresia membresia;
}
