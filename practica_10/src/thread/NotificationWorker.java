/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import factory.NotificationFactory;
import model.Notification;
import singleton.NotificationLogger;
import excepciones.InvalidNotificationTypeException; 

/**
 *
 * @author alba
 */
public class NotificationWorker implements Runnable{
    private String tipo;
    private String destinatario;
    private String mensaje;
    
    public NotificationWorker(String tipo, String destinatario, String mensaje){
        this.tipo = tipo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    @Override
    public void run() {
        try{
            Notification notificacion = NotificationFactory.create(tipo, mensaje);
            
            notificacion.send(destinatario);
            
            String registrarMensaje = "Enviada" + notificacion.getType() + " a " +
                                        destinatario;
        }
        catch(InvalidNotificationTypeException e){
            NotificationLogger.getNotificationLogger().ingresarBuzon("ERROR "+e.getMessage());
        }
    }
    
}
