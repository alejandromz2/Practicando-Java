package com.paquete.DSA_GT1;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        /* Person person1 = new Person("Ivan", 20);
        Person person2 = new Person("Mary", 30);

        System.out.println(person2.compareTo(person1)); */

        Person person1 = new Person("Miguel", 31);

        Person person2 = new Person("Ivan", 43);

        Person person3 = new Person("Adrianna", 15);

        Person person4 = new Person("Mary", 26);

        Person person5 = new Person("Andrew", 7);


        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);

        // Crear un comparador basado en la longitud del nombre
        PersonNameLengthComparator nameLengthComparator = new PersonNameLengthComparator();

        // Ordenar la lista por la longitud del nombre
        Collections.sort(personList, nameLengthComparator);

        // Imprimir la lista ordenada
        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getEdad());
        }



    }
}


class Person implements Comparable<Person>{

    public Person(String name, int edad){
        this.edad = edad;
        this.name=name;
    }

    public int compareTo(Person otherPerson){
        return  edad- otherPerson.edad;
    }

    public String getName(){
        return name;
    }

    public String getEdad(){
        return name;
    }



    private String name;
    private int edad;
}



class PersonNameLengthComparator implements Comparator<Person> {

    public int compare(Person personOne, Person personTwo){
        return personOne.getName().length() - personTwo.getName().length();
    }

}
