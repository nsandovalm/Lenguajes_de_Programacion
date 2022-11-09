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
public class ContactoT2 extends Contacto{
    private String facebook;
    private String telegram;

    public ContactoT2(Persona persona, String direccion, String telefono, String facebook, String telegram) {
        super(persona, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    public ContactoT2(String nombre, int edad, boolean genero, String direccion, String telefono, String facebook, String telegram) {
        super(nombre, edad, genero, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    @Override
    public void imprimir(){
        System.out.println("CONTACTO2 : " + this.toString());
        ContactoT2Frame pantalla = new ContactoT2Frame();
        pantalla.facebookTxt.setText(this. facebook);
        pantalla.nombreTxt.setText(this.getPersona().getNombre());
        pantalla.direccionTxt.setText(this.getDireccion());
        pantalla.telefonoTxt.setText(this.getTelefono());
        pantalla.telegramTxt.setText(this. telegram);
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT2{" +
                "facebook='" + facebook + '\'' +
                ", telegram='" + telegram + '\'' +
                "} " + super.toString();
    }
}
