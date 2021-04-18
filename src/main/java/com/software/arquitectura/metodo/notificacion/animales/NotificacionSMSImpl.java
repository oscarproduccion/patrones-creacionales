/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.arquitectura.metodo.notificacion.animales;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Quiroz
 */
public class NotificacionSMSImpl implements NotificacionIface {

    @Override
    public void notificarZoologico() {
        JOptionPane.showMessageDialog(null, "Se ha enviado la notificación SMS al administrador del zoologico");
    }
    
}
