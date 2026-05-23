/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alba
 */
public class PushNotification implements Notification{
    private String mensaje;
    
    public PushNotification(String mensaje){
        this.mensaje = mensaje;
    }
    @Override
    public void send(String destinatario) {
        System.out.println("[PUSH] para: "+destinatario + ", mensaje: " +
                            mensaje);
    }

    @Override
    public String getType() {
        return "PUSH";
    }
    
    
}
