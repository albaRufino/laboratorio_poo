/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

import java.util.LinkedList;

/**
 *
 * @author alba
 */

public class ProcesadorTareas implements Runnable {
    private LinkedList<Tarea> cola;
    private String nombreProcesador;
    private boolean ejecutando;
    
    public ProcesadorTareas(LinkedList<Tarea> cola, String nombreProcesador) {
        this.cola = cola;
        this.nombreProcesador = nombreProcesador;
        this.ejecutando = true;
    }
    
    public void detener() {
        this.ejecutando = false;
    }
    
    @Override
    public void run() {
        System.out.println(nombreProcesador + " iniciado...");
        
        while (ejecutando) {
            synchronized (cola) {
                if (!cola.isEmpty()) {
                    Tarea tarea = cola.poll(); 
                    System.out.println(nombreProcesador + " procesando: " + tarea.getNombre());
                    
                    try {
                        int tiempoProcesamiento = (int) (Math.random() * 2000) + 1000;
                        Thread.sleep(tiempoProcesamiento);
                        
                        tarea.setEstado("Completada");
                        System.out.println(nombreProcesador + " completo: " + tarea.getNombre() 
                                         + " (tomo " + tiempoProcesamiento + "ms)");
                        
                    } catch (InterruptedException e) {
                        System.out.println("ERROR: " + nombreProcesador + " fue interrumpido");
                        Thread.currentThread().interrupt();
                    }
                }
            }
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println(nombreProcesador + " finalizado");
    }
}
