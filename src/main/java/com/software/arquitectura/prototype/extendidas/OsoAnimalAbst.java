package com.software.arquitectura.prototype.extendidas;

import com.software.arquitectura.prototype.abstractas.AnimalAbst;

public class OsoAnimalAbst extends AnimalAbst {

    public OsoAnimalAbst(String nombre, String tipo) {
        super.setNombre(nombre);
        super.setTipo(tipo);
    }

    @Override
    public AnimalAbst copiar() {
        OsoAnimalAbst oso = new OsoAnimalAbst(this.getNombre(), this.getTipo());
        return oso;
    }
}
