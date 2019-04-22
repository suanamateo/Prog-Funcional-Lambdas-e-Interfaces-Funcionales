package com.ciceonline;

import com.ciceonline.Impl.ClaseImplementacion;
import com.ciceonline.Interfaces.InterfaceJava8;
import com.ciceonline.Interfaces.InterfaceJava8II;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ClaseImplementacion cl = new ClaseImplementacion();
        String nombre = cl.metodoAbstracto("Susana");
        System.out.println(nombre);

        InterfaceJava8 java = (s) -> (s.concat(";"));
        nombre = java.metodoAbstracto("Susan");
        System.out.println(nombre);
        System.out.println(java.metodoAbstracto("Antonio"));

        java = (nombreDeLaPersona) -> (nombreDeLaPersona.replace('a' , 'b'));
        System.out.println(java.metodoAbstracto("alfredo"));

        String [] arrays = new String[]{
                "Gustavo", "Susana",
                "Gabriel", "David",
                "Jose Luis", "Ciriaco",
                "Chema"
        };

        List <String> nombres = Arrays.asList(arrays);

        long count = Arrays.stream(arrays).filter(s -> s.contains("G")).count();
        System.out.println(count);

        List<String> g = Arrays.stream(arrays).filter(s -> s.contains("G")).collect(Collectors.toList());
        System.out.println(g);

        for (String n: arrays) {
            System.out.println(n.toUpperCase());
        }

        //Ejercicio clase -> Saludo = buenos días con expresión Lambda
        java = (s) -> s.concat(", ");
        nombre = java.metodoAbstracto("Buenos días") +  nombre;
        System.out.println(nombre);

        //Otra forma de resolverlo

        InterfaceJava8II java8II = (n, a) -> (n + " " + a);
        System.out.println(java8II.metodoAbstractoII("Susana", "Mateo"));
        java8II = (n, a) -> (a + ", " +n);
        System.out.println(java8II.metodoAbstractoII("Susana", "Mateo"));
    }
}
