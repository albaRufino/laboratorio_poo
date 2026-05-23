/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author alba
 */
public class Avion extends Vehiculo implements IVolar, ISElectrico, IAcelerable{

    public Avion(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encenderMotor(int gas) {
        if(gas > 5)
            System.out.println("Motor del avion encendido.");
        else
            System.out.println("No hay gasolina suficiente, No se puede encender el motor del avion.");            
    }

    @Override
    public String volar(int gas) {
        String msg;
        if(gas > 5)
            msg = "Avion volando";
        else
            msg = "El avion no puede volar, no hay suficiente combustible.";
        
        return msg;
    }

    @Override
    public void abrirPuertas() {
        System.out.println("Abrindo puertas del avion");
    }

    @Override
    public void acelerar() {
        System.out.println("Avion acelerando");
    }
    
}