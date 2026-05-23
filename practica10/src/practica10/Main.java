/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10;

/**
 *
 * @author alba
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestor de tareas");
        
        GestorTareas gestor = new GestorTareas();
                
        Tarea tarea1 = new Tarea(1, "Estudiar Java", "Pendiente");
        Tarea tarea2 = new Tarea(2, "Hacer ejercicio", "Pendiente");
        Tarea tarea3 = new Tarea(3, "Hacer tarea de Proba", "Pendiente");
        Tarea tarea4 = new Tarea(4, "Hacer PIA de Dora", "Pendiente");
        Tarea tarea5 = new Tarea(5, "Hacer PIA de fundamento de redes", "Pendiente");
        
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);
        gestor.agregarTarea(tarea4);
        gestor.agregarTarea(tarea5);
        
        Tarea tareaDuplicada = new Tarea(6, "Estudiar Java", "Pendiente");
        gestor.agregarTarea(tareaDuplicada);
        
        gestor.mostrarTareas();
        
        Tarea encontrada = gestor.buscarPorId(3);
        if (encontrada != null) {
            System.out.println("Tarea encontrada: " + encontrada);
        }
                
        gestor.mostrarEstadisticas();
                
        ProcesadorTareas procesador1 = new ProcesadorTareas(gestor.getCola(), "Procesador-1");
        ProcesadorTareas procesador2 = new ProcesadorTareas(gestor.getCola(), "Procesador-2");
        ProcesadorTareas procesador3 = new ProcesadorTareas(gestor.getCola(), "Procesador-3");
        
        Thread hilo1 = new Thread(procesador1);
        Thread hilo2 = new Thread(procesador2);
        Thread hilo3 = new Thread(procesador3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        try {
            while (gestor.hayTareasPendientes()) {
                Thread.sleep(500);
                System.out.println("Tareas pendientes en cola: " + gestor.getCola().size());
            }
            
            Thread.sleep(2000);
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrumpido");
        }
        
        procesador1.detener();
        procesador2.detener();
        procesador3.detener();
        
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Resultado final:");
        gestor.mostrarTareas();
        
        gestor.guardarArchivo();
        
        GestorTareas nuevoGestor = new GestorTareas();
        nuevoGestor.leerArchivo();
        nuevoGestor.mostrarTareas();            
    }
}