/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.herencia;

/**
 *
 * @author alba
 */
public class Aereo extends Transporte {

    public Aereo(String marca, int capacidad) {
        super(marca, capacidad);
    }

    @Override
    public void avanzar() {
        System.out.println("Transporte Aereo avanzando");
    }
}