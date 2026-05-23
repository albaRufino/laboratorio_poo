/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoBiblioteca;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author julio
 */
public class GestorLibros{
    private File carpeta = new File("biblioteca");
    private File archivo = new File(carpeta, "libros.txt");
    private ArrayList<Libro> libros;
    
    public GestorLibros(){
        this.libros = new ArrayList<>();
    }
    
    public void crearCarpetasYArchivo(){
        try{
            if(!carpeta.exists()){
                carpeta.mkdir();
            }
            if(!archivo.exists()){
                archivo.createNewFile();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro" + libro.getCodigo() + " agregado exitosamente");
    }
    
    public void guardarLibros(){
       try{
           BufferedWriter bwrite = new BufferedWriter(new FileWriter(archivo));
           for(Libro libro: libros){
               bwrite.write(libro.toFileString());
               bwrite.newLine();
           }
           bwrite.close();
       }
       catch(IOException e){
           System.out.println("Error: " + e.getMessage());
       }
    }
    
    public void cargarLibros(){
    try{
        BufferedReader bread = new BufferedReader(new FileReader(archivo));
        libros.clear();
        String linea;
        String[] argumentos;
        String codigo;
        String titulo;
        String autor;
        int anio;
        while((linea = bread.readLine()) != null){
            argumentos = linea.split(",");
            codigo = argumentos[0];
            titulo = argumentos[1];
            autor = argumentos[2];
            anio = Integer.parseInt(argumentos[3]);
            
            Libro libro = new Libro(codigo, titulo, autor, anio);
            libros.add(libro);
        }
        bread.close();
    }
    catch(IOException e){
        System.out.println("Error: " + e.getMessage());
    }
    
    }
    
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
