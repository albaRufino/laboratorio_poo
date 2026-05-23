/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author alba
 */
public class Autobus extends Vehiculo implements ICobroDePasaje, ISElectrico, IAcelerable{

    public Autobus(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encenderMotor(int gas) {
        if(gas > 10)
            System.out.println("Motor del autobus encendido.");
        else
            System.out.println("No hay gasolina suficiente, No se puede encender el motor.");            
    }

    @Override
    public void abrirPuertas() {
        System.out.println("Puertas del autobus abiertas.");
    }

    @Override
    public String cobrarPasaje(double dinero) {
        String msg;
        if(dinero > 15)
            msg ="cobro realizado.";
        else
            msg ="Dinero insuficiente";
        
        return msg;
    }

    @Override
    public void acelerar() {
        System.out.println("Automovil acelerando");
    }
    
}