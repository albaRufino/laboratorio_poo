/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author alba
 */
public class Moto extends Vehiculo implements IAcelerable{

    public Moto(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encenderMotor(int gas) {
        if(gas > 3)
            System.out.println("Motor de la moto encendido.");
        else
            System.out.println("No hay gasolina suficiente, No se puede encender el motor de la moto.");            
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }
    
}