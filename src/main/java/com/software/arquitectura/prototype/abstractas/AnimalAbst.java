package com.software.arquitectura.prototype.abstractas;

public abstract class AnimalAbst {

    private String nombre;
    private String tipo;

    public abstract AnimalAbst copiar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
