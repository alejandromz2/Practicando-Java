package com.paquete.clasesgenericas;

public class UsoPareja {
    public static void main(String[] args) {
        Pareja<String> una = new Pareja<String>();
        una.setearPrimero("Juan");
        System.out.println(una.devolverPrimero());

        Pareja<Integer> uno = new Pareja<Integer>();
        uno.setearPrimero(1);
        System.out.println(uno.devolverPrimero());

        Persona per1= new Persona("Ana");
        Pareja<Persona> otra = new Pareja<Persona>();
        otra.setearPrimero(per1);
        System.out.println(otra.devolverPrimero().toString());
    }
}

class Persona{

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return nombre;
    }

    private String nombre;

}