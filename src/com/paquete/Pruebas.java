package com.paquete;

public class Pruebas {
    public static void main(String[] args) {

        Empleados[] misTrabajadores = new Empleados[4];
        misTrabajadores[0] = new Empleados("Paco");
        misTrabajadores[1] = new Empleados("Ana");
        misTrabajadores[2] = new Empleados("Antonio");
        misTrabajadores[3] = new Empleados("Maria");

        misTrabajadores[0].cambiaSeccion("RRHH");

        for(Empleados e: misTrabajadores){
            System.out.println(e.dameDatos());

        }
        System.out.println(Empleados.dameIdSiguiente());

    }
}


class Empleados{

    public Empleados(String nom){
        nombre = nom;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion){

          this.seccion = seccion;
    }

    public String dameDatos(){
        return "El nombre es " + nombre + " y la sección es "  +seccion + " y el Id = " + Id;

    }

    public static String dameIdSiguiente(){
        return "El IdSiguiente es: " + IdSiguiente;
    }


    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;
}