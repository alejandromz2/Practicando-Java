package com.paquete.POO;
import javax.swing.*;

public class Uso_Vehiculo {
    public static void main(String[] args) {

        Coche micoche = new Coche();
        Furgoneta mifurgoneta = new Furgoneta(7, 570);
        mifurgoneta.dimeDatosFurgoneta();

        micoche.establece_color("Rojo");
        mifurgoneta.establece_color("Azul");
        mifurgoneta.configura_asientos("si");
        mifurgoneta.configurar_climatizador("si");

        System.out.println(micoche.dime_datos_generales() + ' ' + micoche.dime_color());
        System.out.println(mifurgoneta.dime_datos_generales() + ' ' + mifurgoneta.dime_color() + mifurgoneta.dimeDatosFurgoneta());

    }
}
