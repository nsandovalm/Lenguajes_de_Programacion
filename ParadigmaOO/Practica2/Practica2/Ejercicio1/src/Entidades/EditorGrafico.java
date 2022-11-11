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

public class EditorGrafico{


    private String nombre;    
    private ArrayList<Figura> figuras;
    private ArrayList<Texto> textos;
    private ArrayList<Grupo> grupos;

    public EditorGrafico(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
        this.textos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public ArrayList<Texto> getTextos() {
        return textos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void addFigura(Figura figura) {
        figuras.add(figura);
    }

    public void addTexto(Texto texto) {
        textos.add(texto);
    }

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
    
    
    public String toString() {
        return "EditorGrafico {\n" + "nombre=" + nombre + 
                '\'' + ",\n figuras=" + 
                figuras + ",\n textos=" + 
                textos + ",\n grupos=" + 
                grupos + "\n" + '}';
    }
}