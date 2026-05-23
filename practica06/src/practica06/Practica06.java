/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica06;

import componentes.Electronics;
import componentes.IElectricComp;
import componentes.ICalculosMatematicos;
import dispositivos.Calculadora;
import dispositivos.Computadora;
import dispositivos.Television;
import dispositivos.Radio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author alba
 */

public class Practica06 {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {

        ArrayList<Electronics> dispositivos = new ArrayList<>();

        Calculadora calc1 = new Calculadora("Casio");
        Calculadora calc2 = new Calculadora("Sharp");
        Computadora pc1 = new Computadora("Dell");
        Computadora pc2 = new Computadora("Lenovo");
        Television tv1 = new Television("Samsung");
        Television tv2 = new Television("LG");
        Radio radio1 = new Radio("Sony");
        Radio radio2 = new Radio("Panasonic");

        dispositivos.add(calc1);
        dispositivos.add(calc2);
        dispositivos.add(pc1);
        dispositivos.add(pc2);
        dispositivos.add(tv1);
        dispositivos.add(tv2);
        dispositivos.add(radio1);
        dispositivos.add(radio2);

        System.out.println("\nEncendiendo todos los dispositivos:");
        for (Electronics e : dispositivos) {
            e.powerOn();
        }

        System.out.println("\nApagando todos los dispositivos:");
        Iterator<Electronics> it = dispositivos.iterator();
        while (it.hasNext()) {
            Electronics e = it.next();
            e.powerOff();
        }

        ArrayList<ICalculosMatematicos> calculadoras = new ArrayList<>();
        calculadoras.add(calc1);
        calculadoras.add(calc2);
        calculadoras.add(pc1);
        calculadoras.add(pc2);

        for (ICalculosMatematicos c : calculadoras) {
            c.sumar(10, 5);
            c.restar(10, 5);
            c.multiplicar(10, 5);
        }

        ArrayList<IElectricComp> electronicsComp = new ArrayList<>();
        electronicsComp.add(tv1);
        electronicsComp.add(tv2);
        electronicsComp.add(radio1);
        electronicsComp.add(radio2);

        for (IElectricComp ec : electronicsComp) {
            System.out.println(ec.volumeUp(5));
            System.out.println(ec.channelUp(1));
            System.out.println(ec.newChannel(10));
        }

        HashMap<String, Electronics> mapaDispositivos = new HashMap<>();
        mapaDispositivos.put("Casio", calc1);
        mapaDispositivos.put("Sharp", calc2);
        mapaDispositivos.put("Dell", pc1);
        mapaDispositivos.put("Lenovo", pc2);
        mapaDispositivos.put("Samsung", tv1);
        mapaDispositivos.put("LG", tv2);
        mapaDispositivos.put("Sony", radio1);
        mapaDispositivos.put("Panasonic", radio2);

        System.out.println("\nDispositivos en HashMap (Marca:Dispositivo):");
        for (String marca : mapaDispositivos.keySet()) {
            System.out.println("Marca: " + marca + ":" + mapaDispositivos.get(marca).getClass().getSimpleName());
        }

        HashSet<String> marcas = new HashSet<>();
        marcas.add("Casio");
        marcas.add("Sharp");
        marcas.add("Dell");
        marcas.add("Lenovo");
        marcas.add("Samsung");
        marcas.add("LG");
        marcas.add("Sony");
        marcas.add("Panasonic");
        marcas.add("Casio");

        System.out.println("\nMarcas únicas (HashSet): " + marcas);
        System.out.println("Total marcas únicas: " + marcas.size());

        LinkedList<String> historialOperaciones = new LinkedList<>();
        historialOperaciones.add("Encendido TV Samsung");
        historialOperaciones.add("Canal 5 en TV LG");
        historialOperaciones.add("Suma 10+5 en Casio");
        historialOperaciones.add("Volumen +5 en Radio Sony");
        historialOperaciones.add("Apagado Computadora Dell");

        System.out.println("\nHistorial de operaciones (LinkedList):");
        for (String operacion : historialOperaciones) {
            System.out.println(" - " + operacion);
        }

        tv1.powerOn();
        System.out.println(tv1.newChannel(5));
        System.out.println(tv1.volumeUp(5));
        System.out.println(tv1.channelUp(3));
        System.out.println(tv1.volumeDown(2));
        tv1.powerOff();

        radio1.powerOn();
        System.out.println(radio1.volumeUp(10));
        System.out.println(radio1.channelUp(1));
        System.out.println(radio1.newChannel(2));
        System.out.println(radio1.volumeDown(5));
        radio1.powerOff();

        calc1.powerOn();
        System.out.println("Suma: " + calc1.sumar(15, 7));
        System.out.println("Resta: " + calc1.restar(20, 8));
        System.out.println("Multiplicación: " + calc1.multiplicar(6, 4));
        calc1.powerOff();

        pc1.powerOn();
        pc1.subirVolumen(10);
        pc1.bajarVolumen(5);
        System.out.println("Suma: " + pc1.sumar(100, 50));
        pc1.powerOff();
    }
}