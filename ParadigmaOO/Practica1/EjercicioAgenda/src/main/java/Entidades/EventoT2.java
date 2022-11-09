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
public class EventoT2 extends Evento{
    private String nombreConvecion;

    public EventoT2(int cantidadAsistentes, String nombre, String fecha, String lugar, String nombreConvecion) {
        super(cantidadAsistentes, nombre, fecha, lugar);
        this.nombreConvecion = nombreConvecion;
    }

    @Override
    public void imprimir() {
       System.out.println("Evento 2: " + this.toString());
        EventoT2Frame pantalla = new EventoT2Frame();
        pantalla.cantidadAsistentesTxt.setText(String.valueOf(this.getCantidadAsistentes()));
        pantalla.nombreTxt.setText(this.getNombre());
        pantalla.fechaTxt.setText(this.getFecha());
        pantalla.lugarTxt.setText(this.getLugar());
        pantalla.nombreConvencionTxt.setText(this.nombreConvecion);
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "Evento T1{" +
                super.toString() + '\'' +
                "nombre convencion='" + nombreConvecion + '\'' +
                '}';
    }
    
    /**
     * @return the nombreExhibicion
     */
    public String getNombreConvecion() {
        return nombreConvecion;
    }

}
