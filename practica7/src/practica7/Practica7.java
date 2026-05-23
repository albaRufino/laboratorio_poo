/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;

import excepciones.ExcesoDeCargaException;
import excepciones.PlanDeVueloInvalidoException;
import flota.GestionLogistica;
import modelos.Avion;
import modelos.Camion;

/**
 *
 * @author julio
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PlanDeVueloInvalidoException, ExcesoDeCargaException {
        GestionLogistica flota = new GestionLogistica();
        
        Avion avion = new Avion("Avioncito01", "Boing", 15, 1100);
        Camion camion = new Camion("Camioncito01", "tsuru", 50, 400);
        
        flota.registrarVehiculo(avion);
        flota.registrarVehiculo(camion);
        
        flota.despacharFlota();
    }
    
}
