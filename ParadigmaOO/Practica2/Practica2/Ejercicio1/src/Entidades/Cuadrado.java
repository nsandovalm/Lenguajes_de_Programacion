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
public class Cuadrado extends Figura {

    int lado;
    
    public Cuadrado(String nombre, int area, int perimetro, int lado) {

        super(nombre,area,perimetro);
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + '\'' + ", lado=" + lado + '}';
    }
}
