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


public class Circulo extends Figura{
    int circunferencia;
    int diametro;

    public Circulo(String nombre, int area, int perimetro, int circunferencia, int diametro) {
        super(nombre, area, perimetro);
        this.circunferencia = circunferencia;        
        this.diametro = diametro;
    }
    
    @Override
    public String toString() {
        return super.toString() +'\'' +
                "Circulo{" + "  nombre='" + getNombre() + '\'' + 
                ", circunferencia=" + circunferencia + 
                ", diametro=" + diametro + '}';
    }

}
