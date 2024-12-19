package com.paquete;

import java.util.Scanner;

public class Evaluar_edad {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad: ");
        Scanner edad = new Scanner(System.in);
        int edad_usuario = edad.nextInt();

        if(edad_usuario>=20){
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un wawito");
        }
    }
}
