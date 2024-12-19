package com.paquete.clasesgenericas;

public class Pareja<T> {

    public Pareja(){
        primero=null;
    }

    public void setearPrimero(T nuevoValor){
        primero = nuevoValor;
    }

    public T devolverPrimero(){
        return primero;
    }


    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        Empleado primero = p.devolverPrimero();
        System.out.println(primero);
    }

    private T primero;

}
