package com.proyecto_practica;


public class UsoGestionLibreria {
    public static void main(String[] args) {

        Persona misPersonas[] = new Persona[2];
        misPersonas[0] =  new Cliente("Alejandro", 24, Cliente.Membresia.PREMIUM);
        misPersonas[1] = new Empleado("Naira", 23, "Nutricionista");

        Cliente cliente1 = (Cliente) misPersonas[0];

        for(Persona e: misPersonas){
            System.out.println("La persona se llama: " + e.dameNombre() + " Y tiene: " + e.dameEdad() + " años, " + e.mostrarDetalles());
        }

        Libro misLibros[] = new Libro[4];
        misLibros[0] = new Libro("La ciudad y los perros", "Mario Vargas Llosa", 30);
        misLibros[1] = new Libro("Maestria", "Robert Greene", 50);
        misLibros[2] = new Libro("Termodinamica", "Cengel Boles", 30);
        misLibros[3] = new Libro("Cazadores de sombras", "Autora 1");
        for (Libro e: misLibros){
            e.definirStock(Libro.Stock.NO_STOCK);
        }
        misLibros[3].definirStock(1);

        for (Libro e: misLibros){
            System.out.println(e.verDatosLibro());
        }


        System.out.println(misLibros[0].verDatosLibro() + misLibros[0].aplicarDescuentoLibro((int) cliente1.aplicarDescuento()));

        System.out.println(misLibros[3].añadirYObtenerReseña("Este libro es muy malo"));

        System.out.println("En total existen " + misLibros[3].totalLibros() + " libros");


    }
}
