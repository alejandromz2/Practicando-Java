package com.paquete;

import javax.swing.*;
import java.util.Scanner;

public class Acceso_java {
    public static void main(String[] args) {
        String clave = "Alejandro";
        String pass = "";

        while (clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña, porfavor \n");
            if (clave.equals(pass)==false){
                System.out.print("Contraseña incorrecta, ingresala de nuevo \n");
            }
        }

        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
