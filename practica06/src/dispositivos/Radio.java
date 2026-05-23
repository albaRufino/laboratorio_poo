/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

import componentes.Electronics;
import componentes.IElectricComp;
/**
 *
 * @author alba
 */
public class Radio extends Electronics implements IElectricComp {

    private String marca;
    private int volumen;
    private int frecuencia;

    public Radio() {
        this.marca = "Sony";
        this.volumen = 15;
        this.frecuencia = 1;
    }

    public Radio(String marca) {
        this.marca = marca;
        this.volumen = 15;
        this.frecuencia = 1;
    }

    public String getMarca() {
        return marca;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    @Override
    public void powerOn() {
        System.out.println("Radio marca " + marca + " encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio marca " + marca + " apagada");
    }

    @Override
    public String volumeUp(int incremento) {
        volumen += incremento;
        return "Radio " + marca + " - Volumen subio a: " + volumen;
    }

    @Override
    public String volumeDown(int decremento) {
        volumen -= decremento;
        return "Radio " + marca + " - Volumen bajo a: " + volumen;
    }

    @Override
    public String channelUp(int incremento) {
        frecuencia += incremento;
        if (frecuencia < 1) frecuencia = 2;
        String tipo = (frecuencia == 1) ? "FM" : "AM";
        return "Radio " + marca + " - Cambiado a: " + tipo;
    }

    @Override
    public String channelDown(int decremento) {
        frecuencia -= decremento;
        if (frecuencia < 1) frecuencia = 2;
        String tipo = (frecuencia == 1) ? "FM" : "AM";
        return "Radio " + marca + " - Cambiado a: " + tipo;
    }

    @Override
    public String newChannel(int nuevaFrecuencia) {
        this.frecuencia = nuevaFrecuencia;
        String tipo = (frecuencia == 1) ? "FM" : "AM";
        return "Radio " + marca + " - Sintonizando: " + tipo;
    }
}
