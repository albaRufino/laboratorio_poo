/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import excepciones.EstadoInvalidoException;
import excepciones.ExcesoDeCargaException;

/**
 *
 * @author julio
 */
public class Camion extends Vehiculo implements Cargamento{
    
    private double capacidadCarga;
    
    public Camion(String id, String modelo, int nivelCombustible, double capacidadCarga) {
        super(id, modelo, nivelCombustible);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void validarEstado() throws EstadoInvalidoException {
        if(getNivelCombustible() < 10){
            throw new EstadoInvalidoException(
                "Camion " + getId() + " no puede salir: combustible insuficiente (" 
                + getNivelCombustible() + "%). Minimo requerido: 10%"
            );
        }
    }

    @Override
    public void verificarPesoDelCargamento(double capacidadCarga) throws ExcesoDeCargaException{
        if(getCapacidadCarga() > 500){
            throw new ExcesoDeCargaException(
            "Camion " + getId() + " no puede salir: exceso de carga ("
            + getCapacidadCarga() + "kg). Maximo peso de carga: 500kg"
            );
        }
    }

    /**
     * @return the capacidadCarga
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    
}
