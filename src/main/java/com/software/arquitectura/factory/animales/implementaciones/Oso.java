package com.software.arquitectura.factory.animales.implementaciones;

import com.software.arquitectura.factory.animales.ifaces.AnimalIface;


public class Oso implements AnimalIface{

    @Override
    public String getNombre() {
        return "Oso";
    }

    @Override
    public String getTipo() {
        return "Carnivoro";
    }
    
}
