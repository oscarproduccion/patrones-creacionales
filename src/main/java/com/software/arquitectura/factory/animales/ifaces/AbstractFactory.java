package com.software.arquitectura.factory.animales.ifaces;


public interface AbstractFactory<T> {
    T crear(String tipoAnimal);
}
