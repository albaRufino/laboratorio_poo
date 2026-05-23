/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author vehiculo
 */
public abstract class Vehiculo {
    
    String marca;
    String placa;
    String color;
    
    public Vehiculo(String marca, String placa, String color){
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }
    
    public void mostrarMarca(){
        System.out.println("Marca: " + marca);
    }
    
    public abstract void encenderMotor(int gas);
    }