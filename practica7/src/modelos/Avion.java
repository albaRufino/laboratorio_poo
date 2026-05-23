/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import excepciones.EstadoInvalidoException;
import excepciones.PlanDeVueloInvalidoException;

/**
 *
 * @author julio
 */
public class Avion extends Vehiculo implements Volador{
    private int altitudMaxima;

    public Avion(String id, String modelo, int nivelCombustible, int altitudMaxima) {
        super(id, modelo, nivelCombustible);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void validarEstado() throws EstadoInvalidoException {
        if(getNivelCombustible() < 30){
            throw new EstadoInvalidoException(
            "Avion" + getId() + " no puede despegar: combustible insuficiente ("
            + getNivelCombustible() + "%). Minimo requerido: 30%"
            );
        }
    }

    @Override
    public void verificarPlanDeVuelo(int planDeVuelo) throws PlanDeVueloInvalidoException{
        if(getAltitudMaxima() > 12000){
            throw new PlanDeVueloInvalidoException(
            "Advertencia: Avion +" + getId() +" no puede despegar: altitud maxima extremadamente alta: (" 
                    + getAltitudMaxima() + "m). La altura maxima es de 12000 metros"
            );
        }
    }

    /**
     * @return the altitudMaxima
     */
    public int getAltitudMaxima() {
        return altitudMaxima;
    }
    
}
