package com.software.arquitectura.metodo.fabricas;

import com.software.arquitectura.metodo.notificacion.animales.NotificacionEmailImpl;
import com.software.arquitectura.metodo.notificacion.animales.NotificacionIface;
import com.software.arquitectura.metodo.notificacion.animales.NotificacionSMSImpl;


public class NotificacionFabrica {

    public NotificacionIface crear(String canal) {
        if (canal == null || canal.isEmpty()) {
            return null;
        }
        if ("SMS".equals(canal)) {
            return new NotificacionSMSImpl();
        } else if ("EMAIL".equals(canal)) {
            return new NotificacionEmailImpl();
        } 
        return null;
    }
}
