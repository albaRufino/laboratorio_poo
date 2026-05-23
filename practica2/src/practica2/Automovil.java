/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author alba
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String placas;
    private int gasolina;
    private boolean encendido;

    public Automovil(String marca, String modelo, String placas, int gasolina) {
        this.marca = marca;
        this.modelo = modelo;
        this.placas = placas;
        this.gasolina = gasolina;
        this.encendido = false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El automovil " + marca + " " + modelo + " ha sido destruido.");
        super.finalize();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void encenderMotor() {
        if (gasolina > 0) {
            encendido = true;
            System.out.println("Motor encendido");
        } else {
            System.out.println("No hay gasolina, no se puede encender el motor");
        }
    }

    public void apagarMotor() {
        if (encendido) {
            encendido = false;
            System.out.println("Motor apagado");
        } else {
            System.out.println("El motor ya esta apagado");
        }
    }

    public void acelerar() {
        if (encendido && gasolina > 0) {
            System.out.println("ACELERANDO");
            gasolina -= 1;
            System.out.println("Vehiculo avanzando");
        } else if (!encendido) {
            System.out.println("Primero debes encender el motor");
        } else if (gasolina <= 0) {
            System.out.println("No hay gasolina, no puedes acelerar");
        }
    }

    public void frenar() {
        if (encendido) {
            System.out.println("FRENANDO");
            System.out.println("Vehiculo detenido");
        } else {
            System.out.println("El vehiculo esta apagado, no puede frenar");
        }
    }

    public void pagar() {
        System.out.println("Vehiculo pagado");
        System.out.println("Gracias por su pago");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placas: " + placas);
        System.out.println("Gasolina: " + gasolina + " litros");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}