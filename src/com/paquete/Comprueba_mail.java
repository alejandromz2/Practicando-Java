package com.paquete;

import javax.swing.*;
import java.io.EOFException;

public class Comprueba_mail {
    public static void main(String[] args) {

        String el_mail = JOptionPane.showInputDialog("Ingrese un mail: ");
       try {
        examina_mail(el_mail);
       } catch (Exception e){
        System.out.println("La dirección de email no es correcta");
        e.printStackTrace();
       }


    }

    static  void examina_mail(String mail) throws Longitud_mail_erronea { //throws EOFException {
        int arroba = 0;
        boolean punto =false;

        if (mail.length()<=3){
       //     throw new EOFException();
            throw new Longitud_mail_erronea("El mail es demasiado corto");
        }

        for (int i = 0; i<mail.length(); i++){
            if (mail.charAt(i)=='@'){
                arroba++;
            }
            if (mail.charAt(i) =='.'){
                punto=true;
            }
            else {
                System.out.println("Ingresa un correo valido");
            }
        }

    }
}

class Longitud_mail_erronea extends RuntimeException{

    public Longitud_mail_erronea(){

    }

    public Longitud_mail_erronea(String msj_error){
        super(msj_error);
    }

}