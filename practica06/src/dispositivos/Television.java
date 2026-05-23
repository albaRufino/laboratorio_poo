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
public class Television extends Electronics implements IElectricComp {

    private String marca;
    private int volumen;
    private int canal;

    public Television() {
        this.marca = "Samsung";
        this.volumen = 20;
        this.canal = 1;
    }

    public Television(String marca) {
        this.marca = marca;
        this.volumen = 20;
        this.canal = 1;
    }

    public String getMarca() {
        return marca;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getCanal() {
        return canal;
    }

    @Override
    public void powerOn() {
        System.out.println("Television marca " + marca + " encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Television marca " + marca + " apagada");
    }

    @Override
    public String volumeUp(int incremento) {
        volumen += incremento;
        return "El volumen subio a: " + volumen;
    }

    @Override
    public String volumeDown(int decremento) {
        volumen -= decremento;
        return "El volumen bajo a: " + volumen;
    }

    @Override
    public String channelUp(int incremento) {
        canal += incremento;
        return "Estas viendo el canal: " + canal;
    }

    @Override
    public String channelDown(int decremento) {
        canal -= decremento;
        return "Estas viendo el canal: " + canal;
    }

    @Override
    public String newChannel(int nuevoCanal) {
        canal = nuevoCanal;
        return "Estas viendo el canal: " + canal;
    }
}

