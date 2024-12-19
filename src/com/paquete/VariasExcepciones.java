package com.paquete;

import javax.swing.*;

public class VariasExcepciones {
    public static void main(String[] args) {
        try{
        division();
        } catch (ArithmeticException e){
            System.out.println("No se permite dividir entre 0");
        } catch (NumberFormatException e){
            System.out.println("No has introducido un número entero");
            System.out.println(e.getMessage());
            System.out.println("Se ha generado un error de este tipo " + e.getClass().getName());
        }

    }

    static void division(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor: "));
        System.out.println("El resultado es: " + num1/num2);
    }
}

