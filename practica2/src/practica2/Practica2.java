/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author alba
 */

public class Practica2 {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese las placas: ");
        String placas = scanner.nextLine();

        System.out.print("Ingrese la cantidad de gasolina (litros): ");
        int gasolina = scanner.nextInt();

        Automovil miAuto = new Automovil(marca, modelo, placas, gasolina);

        miAuto.mostrarInformacion();

        System.out.println("\nEl automovil " + miAuto.getMarca() + ", " + miAuto.getModelo() + 
                           ", " + miAuto.getPlacas() + " tiene " + miAuto.getGasolina() + " litros de gasolina:");

        miAuto.encenderMotor();
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.pagar();
        miAuto.apagarMotor();

        miAuto.mostrarInformacion();

        miAuto = null;
        System.gc();

        scanner.close();
    }
}