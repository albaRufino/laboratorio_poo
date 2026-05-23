/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import excepciones.ExcesoDeCargaException;

/**
 *
 * @author julio
 */
public interface Cargamento {
    public void verificarPesoDelCargamento(double capacidadCarga) throws ExcesoDeCargaException;
}
