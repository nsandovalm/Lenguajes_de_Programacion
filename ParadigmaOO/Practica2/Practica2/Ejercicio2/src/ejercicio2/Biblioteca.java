/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author nsandoval
 */
public class Biblioteca {
    ArrayList<Socio> sociosLista = new ArrayList<Socio>();
    ArrayList<Libro> librosLista = new ArrayList<Libro>();
    ArrayList<Prestamo> prestamosLibros = new ArrayList<Prestamo>();

    public void agregarSocio(int numero_socio, String nombre, String direccion) {
        Socio tempS = new Socio(numero_socio, nombre, direccion);
        sociosLista.add(tempS);
    }

    /**
     * @return the sociosLista
     */
    public ArrayList<Socio> getSociosLista() {
        return sociosLista;
    }

    /**
     * @return the librosLista
     */
    public ArrayList<Libro> getLibrosLista() {
        return librosLista;
    }
    
    public void agregarLibro(int codigo, String titulo, String autor, boolean disponibilidad) {
        Libro libroTemp = new Libro(codigo, titulo, autor, disponibilidad);
        librosLista.add(libroTemp);
    }

    public boolean reservarLibro(int codeLib, int socioP) {

        for (int i = 0; i < librosLista.size(); i++) {
            if (librosLista.get(i).getCodigo() == codeLib && librosLista.get(i).isDisponibilidad() == true) {
                librosLista.get(i).setDisponibilidad(false);
                librosLista.get(i).setSocio_prestado(socioP);
                return true;
            }

        }
        return false;
    }

    public Socio buscarSocio(int numSocio) {
        for (int i = 0; i < sociosLista.size(); i++) {
            if (sociosLista.get(i).getNumeroSocio() == numSocio) {
                return sociosLista.get(i);

            }
        }
        return null;
    }

    public Libro buscarLibro(int codeLib) {
        for (int i = 0; i < librosLista.size(); i++) {
            if (librosLista.get(i).getCodigo() == codeLib) {
                return librosLista.get(i);
            }
        }
        return null;

    }

    public void prestarLibro(int codeLib, int numeroSocio, String fecha) {

        if (buscarSocio(numeroSocio) != null && buscarLibro(codeLib) != null) {
            boolean check = reservarLibro(codeLib, numeroSocio);
            if (check) {
                Libro libroP = buscarLibro(codeLib);
                Socio socioP = buscarSocio(numeroSocio);
                ArrayList<Libro> listaLSocio = socioP.getLibros_prestados();
                listaLSocio.add(libroP);
                socioP.setLibros_prestados(listaLSocio);
                Prestamo nuevoPrestamo = new Prestamo(codeLib, numeroSocio, fecha);
                prestamosLibros.add(nuevoPrestamo);
                reservarLibro(codeLib, numeroSocio);
                System.out.println("Libro prestado correctamente al socio " + socioP.getNombre());
            } else {

                System.out.println("El libro solicitado ya se encuentra reservado");

            }

        } else {

            System.out.println("El libro ingresado no existe. \nPor favor intente de nuveo");
        }

    }

    public List<Socio> sociosMasPrestados() {

        List<Socio> masPrestado = sociosLista.stream()
                .filter(socio -> socio.getLibros_prestados().size() >= 3)
                .collect(Collectors.toList());

        return masPrestado;
    }    
}
