/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.herencia;

/**
 *
 * @author alba
 */

public class Transporte {
    protected String marca;
    protected int capacidad;

    public Transporte() {
    }

    public Transporte(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void avanzar() {
        System.out.println("El transporte esta avanzando");
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad);
    }
}