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
public class Calculadora extends Electronics implements ICalculosMatematicos {

    private String marca;
    private float memoria;

    public Calculadora() {
        this.marca = "Casio";
        this.memoria = 0;
    }

    public Calculadora(String marca) {
        this.marca = marca;
        this.memoria = 0;
    }

    public String getMarca() {
        return marca;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    @Override
    public void powerOn() {
        System.out.println("Calculadora marca " + marca + " encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Calculadora marca " + marca + " apagada");
    }

    @Override
    public float sumar(float a, float b) {
        float suma = a + b;
        System.out.println("Sumando " + a + " + " + b + " = " + suma);
        return suma;
    }

    @Override
    public float restar(float a, float b) {
        float resta = a - b;
        System.out.println("Restando " + a + " - " + b + " = " + resta);
        return resta;
    }

    @Override
    public float multiplicar(float a, float b) {
        float multiplicacion = a * b;
        System.out.println("Multiplicando " + a + " * " + b + " = " + multiplicacion);
        return multiplicacion;
    }
}
