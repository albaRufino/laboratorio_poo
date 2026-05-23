/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import practica4.herencia.Autobus;
import practica4.herencia.Automovil;
import practica4.herencia.Avion;
/**
 *
 * @author alba
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Autobus bus = new Autobus("Mercedes", 50);
        Automovil auto = new Automovil("Toyota", 5);
        Avion avion = new Avion("Boeing", 200);

        System.out.println("--- AUTOBUS ---");
        bus.imprimirDatos();
        bus.avanzar();
        bus.cobrarPasaje();

        System.out.println("\n--- AUTOMOVIL ---");
        auto.imprimirDatos();
        auto.avanzar();
        auto.encenderRadio();

        System.out.println("\n--- AVION ---");
        avion.imprimirDatos();
        avion.avanzar();
        avion.volar();
    }
}
