/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author nsandoval
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca sistema = new Biblioteca();
        //LIBROS
        sistema.agregarLibro(1111, "Todo se desmorona", "Chinua Achebe", true);
        sistema.agregarLibro(2222, "Divina comedia", "Dante Alighieri", true);
        sistema.agregarLibro(3333, "Orgullo y prejuicio", "Jane Austen", true);
        sistema.agregarLibro(4444, "El extranjero", "Albert Camus", true);
        
        //SOCIOS
        sistema.agregarSocio(111,"Ana","Ciudad Quesada");
        sistema.agregarSocio(222,"Luz","Flrencia");
        
        //PRÉSTAMO DE LIBROS A LOS SOCIOS
        sistema.prestarLibro(1111, 222, "30/06/2022");
        sistema.prestarLibro(2222, 111, "14/09/2022");
        sistema.prestarLibro(3333, 111, "20/09/2022");
        
        ArrayList<Libro> librosAux; //= new ArrayList<Libro>();
        ArrayList<Socio> sociosAux; //= new ArrayList<Socio>();;
        System.out.println("");

        System.out.println("************LIBROS***********************");
        for (int x = 0; x < sistema.getLibrosLista().size(); x++){
            librosAux = sistema.getLibrosLista();
            System.out.println(librosAux.get(x).toString());
        }
        System.out.println("");
        System.out.println("************SOCIOS***********************");
        for (int x = 0; x < sistema.getSociosLista().size(); x++){
            sociosAux = sistema.getSociosLista();
            System.out.println(sociosAux.get(x).toString());
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("Resultados: ");
        System.out.println(sistema.sociosMasPrestados());
    }
    
}
/* RESULTADOS
run:
Libro prestado correctamente al socio Luz
Libro prestado correctamente al socio Ana
Libro prestado correctamente al socio Ana

************LIBROS***********************
Libro{codigo=1111, titulo=Todo se desmorona, autor=Chinua Achebe, disponibilidad=false, socioPrestado=222}
Libro{codigo=2222, titulo=Divina comedia, autor=Dante Alighieri, disponibilidad=false, socioPrestado=111}
Libro{codigo=3333, titulo=Orgullo y prejuicio, autor=Jane Austen, disponibilidad=false, socioPrestado=111}
Libro{codigo=4444, titulo=El extranjero, autor=Albert Camus, disponibilidad=true, socioPrestado=0}

************SOCIOS***********************
Socio{numeroSocio=111, nombre=Ana, direccion=Ciudad Quesada,
 librosPrestados=[Libro{codigo=2222, titulo=Divina comedia, autor=Dante Alighieri, disponibilidad=false, socioPrestado=111}, Libro{codigo=3333, titulo=Orgullo y prejuicio, autor=Jane Austen, disponibilidad=false, socioPrestado=111}]
}
Socio{numeroSocio=222, nombre=Luz, direccion=Flrencia,
 librosPrestados=[Libro{codigo=1111, titulo=Todo se desmorona, autor=Chinua Achebe, disponibilidad=false, socioPrestado=222}]
}


Resultados: 
[]
BUILD SUCCESSFUL (total time: 0 seconds)
*/