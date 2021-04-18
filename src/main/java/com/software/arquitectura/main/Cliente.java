package com.software.arquitectura.main;

import com.software.arquitectura.factory.animales.ifaces.AbstractFactory;
import com.software.arquitectura.factory.animales.implementaciones.Jirafa;
import com.software.arquitectura.factory.animales.implementaciones.Oso;
import com.software.arquitectura.factory.fabricas.FactoryProvider;
import com.software.arquitectura.metodo.fabricas.NotificacionFabrica;
import com.software.arquitectura.metodo.notificacion.animales.NotificacionIface;
import com.software.arquitectura.prototype.extendidas.JirafaAnimalAbst;
import com.software.arquitectura.prototype.extendidas.OsoAnimalAbst;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        String patron = JOptionPane.showInputDialog("Ingrese el tipo de patrón (metodo fabrica, fabrica abstracta, prototipo");
        //Metodo fabrica
        if (patron.equals("metodo fabrica")) {
            try {
                String tipoNotificacion = JOptionPane.showInputDialog("Ingrese el tipo de notificación (SMS, EMAIL");
                NotificacionFabrica fabrica = new NotificacionFabrica();
                NotificacionIface notification = fabrica.crear(tipoNotificacion);
                notification.notificarZoologico();
            } catch (Exception ex) {
                System.out.println("Ocurrio un error creando los animales ");
                ex.toString();
            } finally {
                System.out.println("Termina la aplicación");

            }
        }
        //Fabrica abstracta de animalesfa
        if (patron.equals("fabrica abstracta")) {
            AbstractFactory fabrica = null;
            try {
                //Crear animales usando la fabrica
                fabrica = FactoryProvider.getFactory("Animal");
                Oso oso = (Oso) fabrica.crear("Oso");
                JOptionPane.showMessageDialog(null, "Se crea " + oso.getNombre() + " de tipo: " + oso.getTipo());
                //Crear Jirafas
                fabrica = FactoryProvider.getFactory("Animal");
                Jirafa jirafa = (Jirafa) fabrica.crear("Jirafa");
                JOptionPane.showMessageDialog(null, "Se crea " + jirafa.getNombre() + " de tipo: " + jirafa.getTipo());
            } catch (Exception ex) {
                System.out.println("Ocurrio un error creando los animales ");
                ex.toString();
            } finally {
                fabrica = null;
                System.out.println("Termina la aplicación");
            }
        }
        //Metodo prototipo
        if (patron.equals("prototipo")) {
            try {
                OsoAnimalAbst oso = new OsoAnimalAbst("Oso", "carnivoro");
                OsoAnimalAbst otroOso = (OsoAnimalAbst) oso.copiar();
                JirafaAnimalAbst jirafa = new JirafaAnimalAbst("Jirafa", "vegetariano");
                JirafaAnimalAbst otraJirafa = (JirafaAnimalAbst) jirafa.copiar();
                JOptionPane.showMessageDialog(null, "Se crea " + oso.getNombre() + " de tipo: " + oso.getTipo());
                JOptionPane.showMessageDialog(null, "Se crea copia de " + otroOso.getNombre() + " de tipo: " + otroOso.getTipo());
                JOptionPane.showMessageDialog(null, "Se crea " + jirafa.getNombre() + " de tipo: " + jirafa.getTipo());
                JOptionPane.showMessageDialog(null, "Se crea copia de " + otraJirafa.getNombre() + " de tipo: " + otraJirafa.getTipo());
            } catch (Exception ex) {
                System.out.println("Ocurrio un error creando los animales ");
                ex.toString();
            } finally {
                System.out.println("Termina la aplicación");
            }
        }
    }
}
