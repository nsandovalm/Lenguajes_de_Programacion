/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author nsandoval
 */
public class Numero {
    int numero;

    public Numero(String n) {
        this.numero = Integer.parseInt(n);
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }   
}
