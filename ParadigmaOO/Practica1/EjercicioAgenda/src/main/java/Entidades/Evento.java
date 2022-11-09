/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author nsandoval
 */
public abstract class Evento extends Object{
    private int cantidadAsistentes;
    private String nombre;
    private String fecha;
    private String lugar;

    public Evento(int cantidadAsistentes, String nombre, String fecha, String lugar) {
        this.cantidadAsistentes = cantidadAsistentes;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    
    public abstract void imprimir();
    
    @Override
    public String toString() {
        return "Eveto{" +
                "catidad asistentes=" + cantidadAsistentes +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
    
    /**
     * @return the cantidadAsistentes
     */
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    /**
     * @return the eveto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

}
