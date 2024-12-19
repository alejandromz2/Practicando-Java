package com.paquete;

public class ManipulaCadenas2 {

    public static void main(String[] args) {
        String frase = "Hoy es un estupendo día para aprender a programar java";
        int a,b;
        a = 1;
        b = 3;
        String frase_resumen = frase.substring(a,frase.length());
        System.out.println(frase_resumen);

    }
}
