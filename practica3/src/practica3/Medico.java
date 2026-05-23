/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author alba
 */
public class Medico extends Persona {
    private String especialidad;
    private String hospital;
    private int aniosExperiencia;

    public Medico(String nombre, int edad, String direccion, String especialidad, String hospital, int aniosExperiencia) {
        super(nombre, edad, direccion);
        this.especialidad = especialidad;
        this.hospital = hospital;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia >= 0) {
            this.aniosExperiencia = aniosExperiencia;
        }
    }

    public void diagnosticar() {
        System.out.println("El doctor " + getNombre() + " esta diagnosticando a un paciente");
    }

    public void recetarMedicamento() {
        System.out.println("El doctor " + getNombre() + " esta recetando medicamento");
    }

    public void realizarCirugia() {
        System.out.println("El doctor " + getNombre() + " esta realizando una cirugia");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El doctor de nombre: " + getNombre() + " Tiene: " + getEdad() + 
                          " Años y vive en: " + getDireccion());
        System.out.println("  - Especialidad: " + especialidad);
        System.out.println("  - Hospital: " + hospital);
        System.out.println("  - Años de experiencia: " + aniosExperiencia);
    }
}