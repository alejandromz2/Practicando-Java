package com.proyecto_practica;

public class Libro {
    enum Stock{NO_STOCK, STOCK}
    public Libro(String título, String autor, int precio){
        this.título = título;
        this.autor = autor;
        this.precio = precio;
        LibroContador ++;
        LibrosTotales = LibroContador;
    }

    public Libro(String título, String autor){
        this.título = título;
        this.autor = autor;
        LibroContador ++;
        LibrosTotales = LibroContador;
    }

    public String verDatosLibro(){
        return "El titulo del libro es: " + título + " Escrito por: " + autor + " Y su precio es: " + precio + " y su stock es: " + stock;
    }

    public void definirStock(Stock stock){
        this.stock = stock;
    }

    public void definirStock(int stock_numerico){
        this.stock_numerico = stock_numerico;
        if(stock_numerico == 0){
            stock = Stock.NO_STOCK;
        } else{
            stock = Stock.STOCK;
        }
    }

    public int totalLibros(){
        return LibrosTotales;
    }


    public String aplicarDescuentoLibro(int descuento){
        return " El precio con descuento es: " + (precio*descuento/100);
    }

    public String añadirYObtenerReseña(String reseña) {
        class Reseña{
            private void añadirReseña(String reseña) {
                this.reseña = reseña;
            }

            private String dameReseña() {
                return this.reseña;
            }

            String reseña;
        }
        Reseña reseña1 = new Reseña();
        reseña1.añadirReseña(reseña);
        return reseña1.dameReseña();
    }


    private String reseña;
    private String título;
    private String autor;
    private int precio;
    private int stock_numerico;
    private Stock stock;
    final private int ISBN = 0;
    private int LibrosTotales;
    static int LibroContador = 1;


}
