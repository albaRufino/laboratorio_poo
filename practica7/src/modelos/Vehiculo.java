/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import excepciones.EstadoInvalidoException;

/**
 *
 * @author julio
 */
public abstract class Vehiculo {
    private String id;
    private String modelo;
    private int nivelCombustible;
    
    public Vehiculo(String id, String modelo, int nivelCombustible) {
        this.id = id;
        this.modelo = modelo;
        this.nivelCombustible = nivelCombustible;
    }
    
    public abstract void validarEstado() throws EstadoInvalidoException;    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the nivelCombustible
     */
    public int getNivelCombustible() {
        return nivelCombustible;
    }
}
