package com.paquete.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Trabajador("Alejandro M", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Pedro", "Mecatrónica");

        for(Persona e: lasPersonas){
            System.out.println(e.dameNombre() + ", " + e.dameDescripcion());
        }

    }
}

abstract class  Persona {

    public Persona(String nom){
        nombre=nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;
}


class Trabajador extends Persona{

    public Trabajador(String nom, double sue, int agno, int mes, int dia) {

        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    public String dameDescripcion(){
        return "Este empleado tiene un Id = " + Id + " con un suledo= " + sueldo;
    }


    public double dameSueldo(){
        return sueldo;
    }
    public Date dameFechaContrado(){
        return altaContrato;
    }

    // MÉTODOS SETTER
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    // VARIABLES
    private int Id;
    private static int IdSiguiente = 1;
    private double sueldo;
    private Date altaContrato;
}

class Alumno extends Persona{

    public Alumno(String nom, String car){
        super(nom);
        carrera = car;
    }

    public String dameDescripcion(){
        return "Este Alumno está estudiando la carrera de " + carrera;
    }

    private String carrera;
}