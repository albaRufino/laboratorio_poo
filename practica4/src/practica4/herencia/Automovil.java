/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.herencia;

/**
 *
 * @author alba
 */
public class Automovil extends Terrestre {

    public Automovil(String marca, int capacidad) {
        super(marca, capacidad);
    }

    public void encenderRadio() {
        System.out.println("Radio del automovil encendida");
    }
}
