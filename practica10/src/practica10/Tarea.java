/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author alba
 */

public class Tarea {
    private int id;
    private String nombre;
    private String estado;
    
    public Tarea(int id, String nombre, String estado){
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public String toFileString(){
        return getId()+","+getNombre()+","+getEstado();
    }
    
    @Override
    public String toString(){
        return "id: " + getId() +
                ", nombre: " + getNombre() +
                ", estado: " + getEstado();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
