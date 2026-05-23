/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author alba
 */
public class Plomero extends Persona {
    private String especialidad;
    private String empresa;
    private int aniosExperiencia;
    private boolean disponible;

    public Plomero(String nombre, int edad, String direccion, String especialidad, String empresa, int aniosExperiencia) {
        super(nombre, edad, direccion);
        this.especialidad = especialidad;
        this.empresa = empresa;
        this.aniosExperiencia = aniosExperiencia;
        this.disponible = true;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia >= 0) {
            this.aniosExperiencia = aniosExperiencia;
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void repararFuga() {
        System.out.println("El plomero " + getNombre() + " esta reparando una fuga de agua");
    }

    public void instalarTuberias() {
        System.out.println("El plomero " + getNombre() + " esta instalando tuberias nuevas");
    }

    public void cobrarServicio() {
        System.out.println("El plomero " + getNombre() + " esta cobrando el servicio");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El Plomero de nombre: " + getNombre() + " Tiene: " + getEdad() + 
                          " Años y vive en: " + getDireccion());
        System.out.println("  - Especialidad: " + especialidad);
        System.out.println("  - Empresa: " + empresa);
        System.out.println("  - Años de experiencia: " + aniosExperiencia);
        System.out.println("  - Disponible: " + (disponible ? "Si" : "No"));
    }
}
