/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author antonio
 */
public class Automovil extends Vehiculo implements ISElectrico, IAcelerable{

    public Automovil(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encenderMotor(int gas) {
        if(gas > 1)
            System.out.println("Motor de auto encendido.");
        else
            System.out.println("No hay gasolina suficiente, No se puede encender el motor.");            
    }

    @Override
    public void abrirPuertas() {
        System.out.println("Abrindo puertas del utomovil");
    }

    @Override
    public void acelerar() {
        System.out.println("Autobus acelerando");
    }
    
}