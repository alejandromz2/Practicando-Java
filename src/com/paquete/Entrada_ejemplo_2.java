package com.paquete;

import javax.swing.*;

public class Entrada_ejemplo_2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
        String edad = JOptionPane.showInputDialog("Ingrese su edad, porfavor: ");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola " + nombre + " El año que viene tendras: " + (edad_usuario  + 1) + " años");
    }
}
