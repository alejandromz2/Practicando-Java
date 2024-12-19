package com.alejandro;

import java.util.ArrayList;


public class Seleccion {
    // variable
    // comportamiento

    String nombreEquipo;
    char grupo;
    boolean clasificadoACuartos;

    void imprimirEquipo(){
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadoACuartos);
    }

    public static void main(String[] args) {
        Seleccion argentina = new Seleccion();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasificadoACuartos = false;

        // if statement
        if(argentina.clasificadoACuartos == true) {
            System.out.println("Clasificados");
        } else if (argentina.clasificadoACuartos == false) {
            System.out.println("Somos Malisimos");;
        }

        // bucle

        for(int i = 1; i < 10; i++) {
            System.out.println("Asiento: " + i);
        }

        //
        int j = 0;
        while(j<11){
            System.out.println("Asiento:" + j);
            j++;
        }

        // Excepciones

        int x = 0;
        int z = 5;

        try {
            System.out.println(x/z);
        } catch (Exception exception) {
            System.out.println("Fallo por división con 0");
        }

        // API
        ArrayList<String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Inglaterra");
        selecciones.add("Brasil");
        selecciones.add("Marruecos");

        System.out.println(selecciones);


    }
}
