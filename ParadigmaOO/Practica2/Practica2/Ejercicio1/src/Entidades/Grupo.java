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
import java.util.ArrayList;

public class Grupo {

    private String nombre;
    private ArrayList<Figura> figuras;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void addFigura(Figura figuras1) {

        this.figuras.add(figuras1);
    }

    public String toString() {
        return "Grupo{" + "nombre='" + nombre + '\'' + ", figuras=" + figuras + '}';
    }
}
