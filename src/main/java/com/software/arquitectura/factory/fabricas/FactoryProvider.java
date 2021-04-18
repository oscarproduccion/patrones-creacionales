package com.software.arquitectura.factory.fabricas;

import com.software.arquitectura.factory.animales.ifaces.AbstractFactory;

public class FactoryProvider {
    //Obtener objeto creado de la fabrica    
    public static AbstractFactory getFactory(String tipo){
        if("Animal".equalsIgnoreCase(tipo)){
            return new AnimalFactory();
        }
        return null;
    }
}
