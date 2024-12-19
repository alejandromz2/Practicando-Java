package com.paquete;

public class PrimeraClase {
    public static void main(String args[]){

        // Tipo de datos:

        // Variables
        double base = 5;
        double expo = 3;

        // Constantes
        final double constante = 3.1418;

        // Refundiciones:
        int numero = (int)Math.sqrt(4);
        int resultado = (int)Math.pow(base,expo);
        System.out.println(resultado);

        // Video 11 - Strings
        String nombre = "Alejandro";
        System.out.println("Largo: " + nombre.length() + " Posición 1:" + nombre.charAt(0));
        // Si queremos última letra
        int ultima_letra = nombre.length();
        System.out.println(nombre.charAt(ultima_letra-1));


    }

}
