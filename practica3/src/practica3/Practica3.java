/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *
 * @author alba
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona = new Persona("Pedro Navajas", 25, "Calle falsa 123");

        Medico medico = new Medico("Juanito", 25, "Calle falsa 123", "Cardiologia", "Hospital General", 8);
        
        Plomero plomero = new Plomero("Juan Alimaña", 25, "Calle falsa 123", "Fontaneria", "Plomeros SA", 5);
        
        Maestro maestro = new Maestro("Maria Gonzalez", 35, "Avenida Principal 456", "Matematicas", "Escuela Central", 10, "Maestria");

        persona.mostrarInformacion();

        System.out.println();
        
        persona.mostrarInformacion();
        
        System.out.println();
        
        medico.mostrarInformacion();
        
        System.out.println();
        
        plomero.mostrarInformacion();
                
        medico.diagnosticar();
        medico.recetarMedicamento();
        
        System.out.println();
        
        plomero.repararFuga();
        plomero.instalarTuberias();
        
        System.out.println();
        
        maestro.enseniar();
        maestro.calificarExamenes();
        maestro.tomarLista();
                
        medico.setEspecialidad("Pediatria");
        medico.setHospital("Hospital Infantil");
        System.out.println("Despues de actualizar:");
        System.out.println("El doctor " + medico.getNombre() + " ahora es especialista en " + medico.getEspecialidad());
        System.out.println("Y trabaja en " + medico.getHospital());
    }
}