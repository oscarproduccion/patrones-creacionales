package com.software.arquitectura.factory.fabricas;

import com.software.arquitectura.factory.animales.ifaces.AbstractFactory;
import com.software.arquitectura.factory.animales.ifaces.AnimalIface;
import com.software.arquitectura.factory.animales.implementaciones.Jirafa;
import com.software.arquitectura.factory.animales.implementaciones.Oso;

public class AnimalFactory implements AbstractFactory<AnimalIface> {

    @Override
    public AnimalIface crear(String tipoAnimal) {
        if ("Oso".equalsIgnoreCase(tipoAnimal)) {
            return new Oso();
        } else if ("Jirafa".equalsIgnoreCase(tipoAnimal)) {
            return new Jirafa();
        }

        return null;
    }


}
