/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.herencia;

/**
 *
 * @author alba
 */
public class Avion extends Aereo {

    public Avion(String marca, int capacidad) {
        super(marca, capacidad);
    }

    public void volar() {
        System.out.println("Avion Volando");
    }
}