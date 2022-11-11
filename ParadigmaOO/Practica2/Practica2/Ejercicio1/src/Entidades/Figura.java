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
public abstract class Figura {

    private String nombre;
    int area;
    int perimetro;

    public Figura(String nombre, int area, int perimetro ) {
        this.nombre = nombre;
        this.area = area;        
        this.perimetro = perimetro;
    }
     
    public String toString(){
        return "Figura{" + "  nombre='" + getNombre() + '\'' + 
                ", area=" + area + ", largo=" + perimetro ;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
}
