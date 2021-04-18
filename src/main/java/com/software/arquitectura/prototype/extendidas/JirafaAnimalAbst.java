package com.software.arquitectura.prototype.extendidas;

import com.software.arquitectura.prototype.abstractas.AnimalAbst;

public class JirafaAnimalAbst extends AnimalAbst{
    
    public JirafaAnimalAbst(String nombre, String tipo) {
        super.setNombre(nombre);
        super.setTipo(tipo);
    }

    @Override
    public AnimalAbst copiar() {
        JirafaAnimalAbst jirafa = new JirafaAnimalAbst(this.getNombre(), this.getTipo());
        return jirafa;
    }
    
}
