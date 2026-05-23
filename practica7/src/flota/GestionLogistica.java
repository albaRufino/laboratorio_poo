/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota;

import excepciones.EstadoInvalidoException;
import excepciones.ExcesoDeCargaException;
import excepciones.PlanDeVueloInvalidoException;
import java.util.ArrayList;
import modelos.Avion;
import modelos.Camion;
import modelos.Vehiculo;

/**
 *
 * @author julio
 */
public class GestionLogistica {
    private ArrayList<Vehiculo> flota;
    
    public GestionLogistica(){
       this.flota = new ArrayList<>(); 
    }
    
    public void registrarVehiculo(Vehiculo vehiculo){
        flota.add(vehiculo);
        System.out.println("Vehiculo " + vehiculo.getId() + " registrado exitosamente");
    }
    
    public void despacharFlota() throws PlanDeVueloInvalidoException, ExcesoDeCargaException{
        for (Vehiculo vehiculo: flota){
            try{
                vehiculo.validarEstado();
                if(vehiculo instanceof Avion avion){
                    avion.verificarPlanDeVuelo(avion.getAltitudMaxima());
                }
                if(vehiculo instanceof Camion camion){
                    camion.verificarPesoDelCargamento(camion.getCapacidadCarga());
                }
                System.out.println("Vehiculo: " + vehiculo.getId() + " aprobado");
            }
            catch (EstadoInvalidoException | PlanDeVueloInvalidoException | ExcesoDeCargaException e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }
    }

    /**
     * @return the flota
     */
    public ArrayList<Vehiculo> getFlota() {
        return flota;
    }
}
