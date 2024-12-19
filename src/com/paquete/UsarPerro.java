package com.paquete;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsarPerro {
    public static void main(String[] args) {

        Perro[] misPerros = new Perro[3];
        misPerros[0] = new Perro("Wonki", 30, 30, 2024,2,20);
        misPerros[1] = new Perro("Monki", 40, 20, 2022,5,24);
        misPerros[2] = new Perro("Tronki", 50, 33, 2021,8,10);

        for(Perro e: misPerros ){
            e.vacunarMascota("si");
        }

        System.out.println("Los perros han sido vacunados");
        for(Perro e: misPerros){
            System.out.println("Nombre: " + e.dameNombre() + " Peso: " + e.damePeso() + " Estatura " + e.dameEstatura() + " " +
                    "Fecha de Adopción: " + e.dameFechaAdopcion() + e.dameConfirmacionVacuna());
        }
    }
}


class Perro {

    public Perro(String nombre, int peso, int estatura, int año, int mes, int dia){
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        GregorianCalendar fecha =  new GregorianCalendar(año,mes,dia);
        fecha_adopcion = fecha.getTime();

    }

    public int damePeso(){
        return peso;
    }
    public int dameEstatura(){
        return estatura;
    }
    public String dameNombre(){
        return nombre;
    }

    public Date dameFechaAdopcion(){
        return fecha_adopcion;
    }

    public void vacunarMascota(String vacuna){
        if(vacuna.equalsIgnoreCase("si")){
            this.vacuna = true;
        } else {
            this.vacuna = false;
        }

    }

    public String dameConfirmacionVacuna(){
        if(this.vacuna == true){
            return " El perro ha sido vacunado";
        }else {
            return " El perro no ha sido vacunado";
        }
    }




    private int peso;
    private int estatura;
    private String nombre;
    private Date fecha_adopcion;
    private boolean vacuna;
}