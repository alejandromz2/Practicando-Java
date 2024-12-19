package com.paquete.clasesgenericas;

import java.util.*;

public class UsoEmpleadoGenerico {

    public static void main(String[] args) {
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add( new Empleado("Jose", 35, 2200));
        listaEmpleados.add( new Empleado("Jose", 35, 2200));
        listaEmpleados.add( new Empleado("Jose", 35, 2200));
        listaEmpleados.add( new Empleado("Jose", 35, 2200));
        listaEmpleados.add( new Empleado("Jose", 35, 2200));
        listaEmpleados.trimToSize(); // Cortar el exceso de memoria

        listaEmpleados.set(0, new Empleado("Alejandro", 24, 2600));

        /*
        System.out.println(listaEmpleados.size());
        for (Empleado e: listaEmpleados){
            System.out.println(e.dameDatos());
        } */

        Iterator <Empleado> miIterador = listaEmpleados.iterator();

        while(miIterador.hasNext()){
            System.out.println(miIterador.next().dameDatos());
        }

        /*
        for(int i =0; i < listaEmpleados.size(); i++){
            Empleado e = listaEmpleados.get(i);
            System.out.println(e.dameDatos());
        }

        System.out.println(listaEmpleados.get(0).dameDatos()); */

        /*
        Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleados);


        for(int i=0; i<arrayEmpleados.length; i++){
            System.out.println(arrayEmpleados[i].dameDatos());
        } */



    }


}



class Empleado{
    public Empleado(String nombre, int edad, int sueldo){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
    }

    public String dameDatos(){
        return  "El nombre del empleado es " +nombre + " Y tiene una edad de " + edad + " Y su sueldo es " + sueldo;
    }

    public int dameSueldo(){
        return sueldo;
    }

    public void darSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    private String nombre;
    private int edad;
    private int sueldo;
}

class Jefe extends Empleado{
     public Jefe(String nombre, int edad, int sueldo){
         super(nombre, edad, sueldo);
     }

     public void darBono(int bono) {
         int nuevo_sueldo = bono + super.dameSueldo();
         super.darSueldo(nuevo_sueldo);
     }

}