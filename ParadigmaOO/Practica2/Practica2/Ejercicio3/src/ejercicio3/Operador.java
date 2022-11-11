/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author nsandoval
 */
public class Operador {
    String operador;
            
    public Operador(String operador){
        this.operador = operador;
    }      

    public String getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return  operador;
    }   
}
