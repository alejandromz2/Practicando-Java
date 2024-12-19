package com.paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_datos {
    public static void main(String[] args) {
        try {
            pedirDatos();
        }catch (InputMismatchException e){
            System.out.println("Que has introducido???");
        }


    }

    static void pedirDatos() throws InputMismatchException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce edad, por favor");
        int edad = entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " El año que viene tendrás " + (edad+1) + " años.");

    }
}

class  Longitud_mail_erroneas extends Exception{
    public Longitud_mail_erroneas(){}
    public Longitud_mail_erroneas(String msj_error){
        super(msj_error);
    }
}