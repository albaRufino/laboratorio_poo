/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import excepciones.InvalidNotificationTypeException;
import model.EmailNotification;
import model.Notification;
import model.PushNotification;
import model.SMSNotification;

/**
 *
 * @author alba
 */
public class NotificationFactory {

    public static Notification create(String tipo, String mensaje) throws InvalidNotificationTypeException{
        if(tipo == null){
        throw new InvalidNotificationTypeException("null");
        }
    
        switch(tipo.toUpperCase()){
            case "EMAIL":
                return new EmailNotification(mensaje);
            case "SMS":
                return new SMSNotification(mensaje);
            case "PUSH":
                return new PushNotification(mensaje);     
            default:
                throw new InvalidNotificationTypeException(tipo);
        }
    }
}
