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
public class EventoT1 extends Evento{
    private String nombreExhibicion;

    public EventoT1(int cantidadAsistentes, String nombre, String fecha, String lugar, String nombreExhibicion) {
        super(cantidadAsistentes, nombre, fecha, lugar);
        this.nombreExhibicion = nombreExhibicion;
    }

    @Override
    public void imprimir() {
        System.out.println("Evento 1: " + this.toString());
        EventoT1Frame pantalla = new EventoT1Frame();
        pantalla.cantidadAsistentesTxt.setText(String.valueOf(this.getCantidadAsistentes()));
        pantalla.nombreTxt.setText(this.getNombre());
        pantalla.fechaTxt.setText(this.getFecha());
        pantalla.lugarTxt.setText(this.getLugar());
        pantalla.nombreExhibicionTxt.setText(this.nombreExhibicion);
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "Evento T1{" +
                super.toString() + '\'' +
                "nombre exhibicion='" + nombreExhibicion + '\'' +
                '}';
    }
    
    /**
     * @return the nombreExhibicion
     */
    public String getNombreExhibicion() {
        return nombreExhibicion;
    }

}
