package com.paquete.timmer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        // DameLaHora oyente = new DameLaHora();
        ActionListener oyente = new DameLaHora();
        Timer mitemporizador = new Timer(5000, oyente );
        mitemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class DameLaHora implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}

