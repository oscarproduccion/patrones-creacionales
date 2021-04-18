package com.software.arquitectura.metodo.notificacion.animales;

import javax.swing.JOptionPane;

public class NotificacionEmailImpl implements NotificacionIface {

    @Override
    public void notificarZoologico() {
        JOptionPane.showMessageDialog(null, "Se ha enviado la notificación E-mail al administrador del zoologico");
    }
    
}
