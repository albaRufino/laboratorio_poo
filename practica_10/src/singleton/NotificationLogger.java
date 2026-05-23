/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alba
 */
public class NotificationLogger {

    private static NotificationLogger notificaciones;
    private List<String> buzonDeMensajes;
    
    private NotificationLogger(){
        buzonDeMensajes = new ArrayList<>();
    }
    
    public static synchronized NotificationLogger getNotificationLogger(){
        if(notificaciones == null){
            notificaciones = new NotificationLogger();
        }
        return notificaciones;
    }
    
    public synchronized void ingresarBuzon(String mensaje){
        buzonDeMensajes.add(mensaje);
        System.out.println("[LOG] " + mensaje);
    }
    
    public synchronized List<String> getBuzonDeMensajes(){
        return new ArrayList<>(buzonDeMensajes);
    }
}
