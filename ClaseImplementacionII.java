package com.ciceonline.Impl;

import com.ciceonline.Interfaces.InterfaceJava8II;

public class ClaseImplementacionII implements InterfaceJava8II {

    @Override
    public String metodoAbstractoII(String nombre, String apellido) {
        return nombre + " " + apellido;
    }
}
