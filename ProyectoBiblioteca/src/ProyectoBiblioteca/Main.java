/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectoBiblioteca;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorLibros gestor = new GestorLibros();
        String codigo;
        String titulo;
        String autor;
        int anio;
        int opcion = 0;

        gestor.crearCarpetasYArchivo();
        gestor.cargarLibros();
        while (opcion != 5) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Guardar libros");
            System.out.println("3. Cargar libros");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Codigo: ");
                    codigo = sc.nextLine();

                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    autor = sc.nextLine();

                    System.out.print("Año: ");
                    anio = sc.nextInt();
                    sc.nextLine();

                    Libro libro = new Libro(codigo, titulo, autor, anio);
                    gestor.agregarLibro(libro);
                    break;

                case 2:
                    gestor.guardarLibros();
                    System.out.println("Libros guardados");
                    break;

                case 3:
                    gestor.cargarLibros();
                    System.out.println("Libros cargados");
                    break;

                case 4:
                    gestor.mostrarLibros();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }

        }
}