package com.paquete;

import javax.swing.*;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        String area = JOptionPane.showInputDialog("Elige una opción: \n1. Cuadrado \n2. Rectángulo \n3: Triangulo \n4. Circulo");
        int area_seleccionada = Integer.parseInt(area);
        Scanner lados = new Scanner(System.in);

        switch (area_seleccionada){
            case 1:
                System.out.println("Ingrese lado: ");
                int lado_cuadrado = lados.nextInt();
                System.out.println("El área del cuadrado es igual: " + Math.pow(lado_cuadrado, 2));
                break;
            case 2:
                System.out.println("Ingrese la base: ");
                int base_rec = lados.nextInt();
                System.out.println("Ingrese la altura: ");
                int altura_rec = lados.nextInt();
                System.out.println("El área del rectangulo es: " + (base_rec * altura_rec));
                break;
            case 3:
                System.out.println("Ingrese la base: ");
                double base_triag = lados.nextInt();
                System.out.println("Ingrese la altura: ");
                double altura_triag = lados.nextInt();
                System.out.println("El área del triangulo es: " + ((base_triag * altura_triag) / 2));
                break;
            case 4:
                double pi_valor = 3.1416;
                System.out.println("Ingrese el radio: ");
                double radio = lados.nextDouble();
                System.out.print("El área del circulo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                break;
            default:
                System.out.println("Introduce valor válido");

        }

    }


}
