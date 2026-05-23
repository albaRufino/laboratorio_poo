/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author alba
 */

public class GestorTareas {
   ArrayList<Tarea> lista;
   HashMap<Integer,Tarea> mapa;
   HashSet<String> set;
   LinkedList<Tarea> cola;
   
   private File carpeta = new File("Tareas");
   private File archivo = new File(carpeta, "tarea.txt");
   
   public GestorTareas(){
       this.lista = new ArrayList<>();
       this.mapa = new HashMap<>();
       this.set = new HashSet<>();
       this.cola = new LinkedList<>();
       this.crearCarpetasYArchivo(); 
   }
   
   public void crearCarpetasYArchivo(){
        try{
            if(!carpeta.exists()){
                carpeta.mkdirs();
            }
            if(!archivo.exists()){
                archivo.createNewFile();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
   
   public void agregarTarea(Tarea tarea){
       if(mapa.containsKey(tarea.getId())){
           System.out.println("Error: ya existe una tarea con ID " +
                   tarea.getId());
           return;
       }
       
       if(set.contains(tarea.getNombre())){
           System.out.println("Error: ta existe una tarea con el nombre '"+tarea.getNombre()+"'");
           return;
       }
       lista.add(tarea);
       mapa.put(tarea.getId(), tarea);
       set.add(tarea.getNombre());
       cola.add(tarea);
       
       System.out.println("tarea: " + tarea.getNombre() + " Agregada exitosamente");
   }
   
   public void guardarArchivo(){
       try{
            BufferedWriter bwrite = new BufferedWriter(new FileWriter(archivo));
            for(Tarea tarea: lista){
               bwrite.write(tarea.toFileString());
               bwrite.newLine();
           }
           bwrite.close();
       }
       catch(IOException e){
           System.out.println("Error " + e.getMessage());
       }
   }
   
    public void leerArchivo(){
    try{
        BufferedReader bread = new BufferedReader(new FileReader(archivo));
        lista.clear();
        String linea;
        String[] argumentos;
        int id;
        String nombre;
        String estado;
        
        while((linea = bread.readLine()) != null){
            argumentos = linea.split(",");
            id = Integer.parseInt(argumentos[0]);
            nombre = argumentos[1];
            estado = argumentos[2];
            
            Tarea tarea = new Tarea(id, nombre, estado);
            lista.add(tarea);
        }
        bread.close();
    }
    catch(IOException e){
        System.out.println("Error: " + e.getMessage());
    }
    }
       
    public void mostrarTareas() {
        System.out.println("Lista de tareas");
        if (lista.isEmpty()) {
            System.out.println("No hay tareas registradas");
            return;
        }
        
        for (Tarea tarea : lista) {
            System.out.println(tarea);
        }
        System.out.println("Total: " + lista.size() + " tareas");
    }
    
    public Tarea buscarPorId(int id) {
        return mapa.get(id);
    }
    public void mostrarTareasConIterator() {
        System.out.println("Tareas usando Iterator:");
        Iterator<Tarea> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public LinkedList<Tarea> getCola() {
        return cola;
    }
    
    public boolean hayTareasPendientes() {
        return !cola.isEmpty();
    }   
    
     public void mostrarEstadisticas() {
        System.out.println("Estadisticas");
        System.out.println("ArrayList size: " + lista.size());
        System.out.println("HashMap size: " + mapa.size());
        System.out.println("HashSet size: " + set.size());
        System.out.println("LinkedList (cola) size: " + cola.size());
    }
}
