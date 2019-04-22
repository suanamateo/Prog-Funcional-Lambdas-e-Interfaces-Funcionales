package com.ciceonline.Impl;

import com.ciceonline.Interfaces.InterfaceJava8;

public class ClaseImplementacion implements InterfaceJava8 {
    @Override
    public String metodoAbstracto(String nombre) {
        return nombre;
    }
}
