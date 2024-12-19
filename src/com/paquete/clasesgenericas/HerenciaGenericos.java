package com.paquete.clasesgenericas;

public class HerenciaGenericos {
    public static void main(String[] args) {
     /*  Empleado Administrativa = new Empleado("Elena",45, 1500);
        Jefe DirectoraComercial = new Jefe("Alejandro", 27, 2023);

        Empleado nuevoEmpleado = DirectoraComercial; */

        Pareja<Empleado> Administrativa = new Pareja<Empleado>();
        Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
        //Pareja<Empleado> nuevoEmpleado = DirectoraComercial;

        Pareja.imprimirTrabajador(Administrativa);
        Pareja.imprimirTrabajador(DirectoraComercial);
    }
}
