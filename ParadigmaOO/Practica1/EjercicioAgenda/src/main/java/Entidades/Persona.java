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
public class Persona {
    private String nombre;
    private int edad;
    private boolean genero; //true = mujer; false = hombre

    public Persona(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + getEdad() +
                ", genero=" + isGenero() +
                '}';
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the genero
     */
    public boolean isGenero() {
        return genero;
    }
}
