/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alba
 */
public class SMSNotification implements Notification{
    private String mensaje;
    
    public SMSNotification(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public void send(String destinatario) {
        System.out.println("[SMS] para: " + destinatario + " | msg: " +
                            mensaje);
        }

    @Override
    public String getType() {
        return "SMS"; 
        }
    
    
}
