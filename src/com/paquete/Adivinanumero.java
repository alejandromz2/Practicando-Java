package com.paquete;

import java.util.Random;
import java.util.Scanner;

public class Adivinanumero {
    public static void main(String[] args) {

        int aleatorio = (int)Math.round(Math.random()*100.0);
        Scanner ingreso = new Scanner(System.in);
        int intentos = 0;
        int numero = 0;

        while(numero != aleatorio) {
            System.out.println("Ingrese un número: ");
            numero = ingreso.nextInt();

            if(aleatorio < numero) {
                System.out.println("Más bajo");
                intentos ++;
            }
            else if(aleatorio> numero) {
                System.out.println("Más alto");
                intentos ++;
            }

        }
        System.out.println("Correcto");
        System.out.println("Número aleatorio: " + aleatorio);
        System.out.println("Número de intentos: "+ intentos);

    }
}
