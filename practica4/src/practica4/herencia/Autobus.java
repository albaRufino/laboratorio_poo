/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.herencia;

/**
 *
 * @author alba
 */
public class Autobus extends Terrestre {

    public Autobus(String marca, int capacidad) {
        super(marca, capacidad);
    }

    public void cobrarPasaje() {
        System.out.println("Pasaje cobrado");
    }
}
