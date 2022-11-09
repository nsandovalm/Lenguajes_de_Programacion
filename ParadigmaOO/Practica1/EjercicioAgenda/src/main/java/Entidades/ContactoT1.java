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
public class ContactoT1 extends Contacto{
    private String correo;

    public ContactoT1(Persona persona, String direccion, String telefono, String correo) {
        super(persona, direccion, telefono);
        this.correo = correo;
    }

    public ContactoT1(String nombre, int edad, boolean genero, String direccion, String telefono, String correo) {
        super(nombre, edad, genero, direccion, telefono);
        this.correo = correo;
    }


    @Override
    public void imprimir(){
        System.out.println("Contacto 1: " + this.toString());
        ContactoT1Frame pantalla = new ContactoT1Frame();
        pantalla.correoTxt.setText(this. correo);
        pantalla.nombreTxt.setText(this.getPersona().getNombre());
        pantalla.direccionTxt.setText(this.getDireccion());
        pantalla.telefonoTxt.setText(this.getTelefono());
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "correo='" + correo + '\'' +
                '}';
    }
}
