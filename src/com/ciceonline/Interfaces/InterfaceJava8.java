package com.ciceonline.Interfaces;

@FunctionalInterface
public interface InterfaceJava8 {

    String metodoAbstracto (String nombre);

    default String metodoDefault (String nombre){
        return nombre;

    }

}
