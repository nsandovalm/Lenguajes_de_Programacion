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
public class Texto {
    String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String toString() {
        return "Texto{" + "texto='" + texto + '\'' + '}';
    }
}
