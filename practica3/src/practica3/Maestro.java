/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author alba
 */
public class Maestro extends Persona {
    private String materia;
    private String escuela;
    private int aniosExperiencia;
    private String gradoEstudios;

    public Maestro(String nombre, int edad, String direccion, String materia, String escuela, int aniosExperiencia, String gradoEstudios) {
        super(nombre, edad, direccion);
        this.materia = materia;
        this.escuela = escuela;
        this.aniosExperiencia = aniosExperiencia;
        this.gradoEstudios = gradoEstudios;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia >= 0) {
            this.aniosExperiencia = aniosExperiencia;
        }
    }

    public String getGradoEstudios() {
        return gradoEstudios;
    }

    public void setGradoEstudios(String gradoEstudios) {
        this.gradoEstudios = gradoEstudios;
    }

    public void enseniar() {
        System.out.println("El maestro " + getNombre() + " esta enseñando " + materia);
    }

    public void calificarExamenes() {
        System.out.println("El maestro " + getNombre() + " esta calificando examenes");
    }

    public void tomarLista() {
        System.out.println("El maestro " + getNombre() + " esta tomando lista");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El Maestro de nombre: " + getNombre() + " Tiene: " + getEdad() + 
                          " Años y vive en: " + getDireccion());
        System.out.println("  - Materia: " + materia);
        System.out.println("  - Escuela: " + escuela);
        System.out.println("  - Años de experiencia: " + aniosExperiencia);
        System.out.println("  - Grado de estudios: " + gradoEstudios);
    }
}
