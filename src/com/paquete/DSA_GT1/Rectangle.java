package com.paquete.DSA_GT1;

public class Rectangle {
    private double length, width;
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public Rectangle(double s){
        length=s;
        width = s;
    }

    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(50,100);
        Rectangle cuadrado = new Rectangle(30);
        System.out.println(rectangulo.length + " " + rectangulo.width );
        System.out.println(cuadrado.length+ " " + cuadrado.width);
    }
}

