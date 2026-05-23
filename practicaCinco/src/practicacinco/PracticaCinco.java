/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacinco;

import Transportes.Autobus;
import Transportes.Automovil;
import Transportes.Avion;
import Transportes.Moto;
import java.util.Scanner;
/**
 *
 * @author alba
 */
public class PracticaCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AUTOMOVIL");
        System.out.print("Marca: ");
        String marcaAuto = sc.nextLine();
        System.out.print("Placa: ");
        String placaAuto = sc.nextLine();
        System.out.print("Color: ");
        String colorAuto = sc.nextLine();
        System.out.print("Gasolina: ");
        int gasAuto = sc.nextInt();
        sc.nextLine();

        Automovil auto = new Automovil(marcaAuto, placaAuto, colorAuto);

        auto.encenderMotor(gasAuto);
        auto.abrirPuertas();
        auto.mostrarMarca();

        System.out.println();

        System.out.println("AVION");
        System.out.print("Marca: ");
        String marcaAvion = sc.nextLine();
        System.out.print("Placa: ");
        String placaAvion = sc.nextLine();
        System.out.print("Color: ");
        String colorAvion = sc.nextLine();
        System.out.print("Gasolina: ");
        int gasAvion = sc.nextInt();
        sc.nextLine();

        Avion av = new Avion(marcaAvion, placaAvion, colorAvion);

        av.encenderMotor(gasAvion);
        av.abrirPuertas();
        System.out.println(av.volar(gasAvion));
        av.mostrarMarca();

        System.out.println();

        System.out.println("UTOBUS");
        System.out.print("Marca: ");
        String marcaBus = sc.nextLine();
        System.out.print("Placa: ");
        String placaBus = sc.nextLine();
        System.out.print("Color: ");
        String colorBus = sc.nextLine();
        System.out.print("Gasolina: ");
        int gasBus = sc.nextInt();
        System.out.print("Dinero del pasajero: ");
        double dinero = sc.nextDouble();
        sc.nextLine();

        Autobus bus = new Autobus(marcaBus, placaBus, colorBus);

        bus.encenderMotor(gasBus);
        bus.abrirPuertas();
        System.out.println(bus.cobrarPasaje(dinero));
        bus.mostrarMarca();

        System.out.println();

        System.out.println("MOTO");
        System.out.print("Marca: ");
        String marcaMoto = sc.nextLine();
        System.out.print("Placa: ");
        String placaMoto = sc.nextLine();
        System.out.print("Color: ");
        String colorMoto = sc.nextLine();
        System.out.print("Gasolina: ");
        int gasMoto = sc.nextInt();

        Moto mt = new Moto(marcaMoto, placaMoto, colorMoto);

        mt.encenderMotor(gasMoto);
        mt.mostrarMarca();

        sc.close();
    }
}
