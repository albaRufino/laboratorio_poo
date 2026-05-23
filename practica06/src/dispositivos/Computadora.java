/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

import componentes.Electronics;
import componentes.ICalculosMatematicos;
/**
 *
 * @author alba
 */
public class Computadora extends Electronics implements ICalculosMatematicos {

    private String marca;
    private int volumen;

    public Computadora() {
        this.marca = "HP";
        this.volumen = 50;
    }

    public Computadora(String marca) {
        this.marca = marca;
        this.volumen = 50;
    }

    public String getMarca() {
        return marca;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void subirVolumen(int incremento) {
        volumen += incremento;
        System.out.println("Computadora " + marca + " subió el volumen a: " + volumen);
    }

    public void bajarVolumen(int decremento) {
        volumen -= decremento;
        System.out.println("Computadora " + marca + " bajó el volumen a: " + volumen);
    }

    @Override
    public void powerOn() {
        System.out.println("Computadora marca " + marca + " encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Computadora marca " + marca + " apagada");
    }

    @Override
    public float sumar(float a, float b) {
        float suma = a + b;
        System.out.println("Computadora " + marca + " suma: " + suma);
        return suma;
    }

    @Override
    public float restar(float a, float b) {
        float resta = a - b;
        System.out.println("Computadora " + marca + " resta: " + resta);
        return resta;
    }

    @Override
    public float multiplicar(float a, float b) {
        float multiplicacion = a * b;
        System.out.println("Computadora " + marca + " multiplica: " + multiplicacion);
        return multiplicacion;
    }
}
