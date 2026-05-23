/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_10;

import singleton.NotificationLogger;
import thread.NotificationWorker;

/**
 *
 * @author alba
 */
public class Practica_10 {

    public static void main(String[] args) throws InterruptedException {
        
        Thread[] hilos = new Thread[6]; 
        
        hilos[0] = new Thread(new NotificationWorker("EMAIL", "julio.blancorfn@uanl.edu.mx", "hola :)"));
        hilos[1] = new Thread(new NotificationWorker("SMS", "8180808080", "Tu código es 123456"));
        hilos[2] = new Thread(new NotificationWorker("PUSH", "UsuarioApp", "Alerta nacional, esto es un simulacro"));
        hilos[3] = new Thread(new NotificationWorker("EMAIL", "Daniela.rodriguezalv@uanl.edu.mx", "Carta de invitacion al Congreso de matematicas"));
        hilos[4] = new Thread(new NotificationWorker("SMS", "8160606060", "Recorde registrar su curp en telcel (?"));
        hilos[5] = new Thread(new NotificationWorker("WHATSAPP", "8155555555", "Esto es invalido"));
        
        for (Thread hilo : hilos) {
            hilo.start();
        }
        
        for (Thread hilo : hilos) {
            hilo.join();
        }
        
        System.out.println("Buzon de notificaciones: ");
        NotificationLogger.getNotificationLogger().getBuzonDeMensajes().forEach(System.out::println);
    }
}
