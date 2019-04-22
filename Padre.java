package com.ciceonline.Polimorfismo;

import com.ciceonline.Interfaces.InterfaceFamilia;

public class Padre implements InterfaceFamilia {

    @Override
    public String saludar(){
        return "Hola Hijo";
    }
}
