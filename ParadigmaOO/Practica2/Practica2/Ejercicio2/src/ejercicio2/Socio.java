/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author nsandoval
 */
public class Socio {
    int numeroSocio;
    String nombre;
    String direccion;
    ArrayList<Libro> librosPrestados;

    public Socio(int numeroSocio, String nombre, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.librosPrestados = new ArrayList<Libro>();
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Libro> getLibros_prestados() {
        return librosPrestados;
    }

    public void setLibros_prestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Socio{" + "numeroSocio=" + numeroSocio + 
                ", nombre=" + nombre 
                + ", direccion=" + direccion +
                ",\n librosPrestados=" + 
                librosPrestados + "\n}";
    }    
}
