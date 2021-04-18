package com.software.arquitectura.factory.animales.implementaciones;

import com.software.arquitectura.factory.animales.ifaces.AnimalIface;


public class Jirafa implements AnimalIface{

    @Override
    public String getNombre() {
        return "Jirafa";
    }

    @Override
    public String getTipo() {
        return "Vegetariano";
    }
    
}
