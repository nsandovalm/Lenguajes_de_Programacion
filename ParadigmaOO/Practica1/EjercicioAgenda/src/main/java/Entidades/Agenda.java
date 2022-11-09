/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author nsandoval
 */
public class Agenda {
   private LinkedList<Contacto> contactos;
   private LinkedList<Evento> eventos;

    public Agenda() {
        this.contactos = new LinkedList<Contacto>();
        this.eventos = new LinkedList<Evento>();
    }

    //Agregar Contacto
    public void agregarContacto(Contacto c){
        this.contactos.add(c);
    }
    
    //Agregar Evento
    public void agregarEvento(Evento e){
        this.eventos.add(e);
    }
    //Eliminar Contacto
    public void eliminarContacto(int index){
        this.contactos.remove(index);
    }
    //Eliminar Evento
    public void eliminarEvento(int index){
        this.eventos.remove(index);
    }
    
    public void eliminarContacto(String nombre){
        for(Contacto c : this.contactos){
            if (c.getPersona().getNombre().equals(nombre))
                this.contactos.remove(c);
        }
    }
    
    public void eliminarEvento(String nombre){
        for(Evento e : this.eventos){
            if (e.getNombre().equals(nombre))
                this.eventos.remove(e);
        }
    }
    //modificar Contacto

    //imprimirContactos
    public void imprimirContactos(){
        for(Contacto c : this.contactos)
            c.imprimir();
    }
    
    public void imprimirEvento(){
        for(Evento e : this.eventos)
            e.imprimir();
    }
}
