
package com.paquete.empleado;
import java.util.*;
public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Pepe", 55000,2006,9,25);
        jefe_RRHH.darIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López",95000, 1995,06, 02);
        misEmpleados[2] = new Empleado("Maria Martín",10500, 2002,03, 15);
        misEmpleados[3] = new Empleado("Alejandro Muñoz");
        misEmpleados[4] = jefe_RRHH; // Poliformismo principio de subtitución
        misEmpleados[5] = new Jefatura("Maria", 95000,1999, 5,  26);
        Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
        jefa_finanzas.darIncentivo(55000);

        System.out.println(jefa_finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));


        Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05,05);
        // Crear una instancia de tipo interfaz pero al momento de definirla por el principio de sustitución decirle
        // que es de tipo empleado
        Comparable ejemplo = new Empleado("Elisabeth", 9500, 2011, 06, 07);



        // Jefatura jefe_compras = (Jefatura) misEmpleados[1]; Esto es incorrecto ya que un Jefe siempre es empleado pero
        // No siempre un empleado es Jefe

        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo " + e.dameSueldo() + "" +
                    " Fecha de Alta: " + e.dameFechaContrado() + " Tiene un bonus de: " + e.establece_bonus(500));
        }


    }

}

class Empleado implements Comparable, Trabajadores {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom){

        this(nom, 30000, 2000, 01,01);
    }

    // MÉTODOS GETTER
    public String dameNombre(){
        return nombre;
    }
   public double dameSueldo(){
        return sueldo;
    }
    public Date dameFechaContrado(){
        return altaContrato;
    }

    // MÉTODOS SETTER
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    // Método de interfaz
    public int compareTo(Object miObjeto){
        Empleado otroEmpleado = (Empleado) miObjeto;
        if(this.sueldo < otroEmpleado.sueldo){
            return -1;
        }
        if(this.sueldo> otroEmpleado.sueldo){
            return 1;
        }
        return 0;
    }

    public double establece_bonus(double gratificacion){

        return Trabajadores.bono_minimo + gratificacion;
    }


    // VARIABLES
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}


class Jefatura extends Empleado implements Jefes{

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);
    }

    public void darIncentivo(double b){
        incentivo=b;
    }

    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    public String tomar_decisiones(String decision){
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    public double establece_bonus(double gratificacion){
            double prima=2000;
            return Trabajadores.bono_minimo + gratificacion + prima;
        }

    private double incentivo;


    }

