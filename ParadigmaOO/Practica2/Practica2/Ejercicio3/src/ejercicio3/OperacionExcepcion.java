/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author nsandoval
 */
import static java.lang.System.in;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OperacionExcepcion {
    static ArrayList<Numero> listaNumeros;
    static ArrayList<Operador> listaOperadores;
    
    public OperacionExcepcion(){
        listaNumeros = new ArrayList<Numero>();
        listaOperadores = new ArrayList<Operador>();
    }

    public void pedirExpresionOperar() {
        try {
            String expresion;
            Scanner leer = new Scanner(System.in);
            System.out.print("Escriba la expresion: ");
            ArrayList<String> data2 = new ArrayList<String>();
            expresion = leer.nextLine();
            String[] comprobar = expresion.split(" ");
            for (int i = 0; i < comprobar.length; i++) {
                if( i != (comprobar.length)-1 && comprobar[i].matches("[0-9]+") && comprobar[i+1].matches("[0-9]+")){
                    throw new ExcepcionValida("Error, Formato expresion infija invalido");
                }
            }
            String[] data = expresion.split("(?=[-+*/])|(?<=[-+*/])"); 
            for (String elem : data) {
                if (!(elem.matches(" "))){
                    data2.add(elem.replaceAll("\\s", "")); 
                } 
                         
            }
            descomponer(data2);

        } catch (ExcepcionValida e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    private void descomponer(ArrayList<String> exp) {

        try {

            for (int i = 0; i < exp.size(); i++) {
                String val = exp.get(i);
                if ( i%2 != 0 && val.matches("[0-9]+") || i%2 == 0 && val.matches("[/*+-]")) {
                    throw new ExcepcionValida("Error, Formato expresion infija invalido");

                } else {
                    if (val.matches("[a-z]")) {
                        throw new CaracterExcepcion("Caracter invalido");
                    } else if (val.matches("[0-9]+")) {

                        Numero temp = new Numero(val);
                        listaNumeros.add(temp);
                    } else if (val.matches("[/*+-]")) {

                        Operador temp = new Operador(val);
                        listaOperadores.add(temp);
                    } else {
                        throw new CaracterExcepcion("Caracter invalido");
                    }
                }
            }
            realizarOP();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        

    }

    private void realizarOP() {

        try {

            if (listaNumeros.size() < listaOperadores.size()) {
                throw new ExcepcionValida("Formato de expresion regular invalido");

            } else {

                while (listaNumeros.size() > 1) {
                    int temp1 = listaNumeros.get(0).getNumero();
                    listaNumeros.remove(0);
                    String tempOperador = listaOperadores.get(0).getOperador();
                    listaOperadores.remove(0);
                    int temp2 = listaNumeros.get(0).getNumero();
                    listaNumeros.remove(0);

                    if (tempOperador.equals("+")) {
                        temp1 += temp2;

                    } else if (tempOperador.equals("-")) {
                        temp1 -= temp2;

                    } else if (tempOperador.equals("*")) {
                        temp1 *= temp2;

                    } else {
                        temp1 /= temp2;

                    }
                    Numero result = new Numero(String.valueOf(temp1));
                    listaNumeros.add(0, result);
                }
                System.out.print("El resultado es: ");
                System.out.println(listaNumeros.get(0));

            }

        } catch (ExcepcionValida e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }
}
