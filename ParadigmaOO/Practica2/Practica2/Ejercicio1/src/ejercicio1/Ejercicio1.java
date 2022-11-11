/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidades.Circulo;
import Entidades.Cuadrado;
import Entidades.EditorGrafico;
import Entidades.Grupo;
import Entidades.Texto;

/**
 *
 * @author nsandoval
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracio de instancias
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado", 40,80,20);
        Circulo circulo1 = new Circulo("Circulo", 50, 80, 100, 40);
        Texto texto1 = new Texto("Ejercicios 1");
        Grupo grupo1 = new Grupo("FEITEC");
        EditorGrafico editorGrafico1 = new EditorGrafico("Registro de Datos");
        
        grupo1.addFigura(cuadrado1);
        grupo1.addFigura(circulo1);


        editorGrafico1.addFigura(cuadrado1);
        editorGrafico1.addFigura(circulo1);
        editorGrafico1.addGrupo(grupo1);
        editorGrafico1.addTexto(texto1);

        System.out.println("Registro:" + editorGrafico1.toString());
    }
}

/*
RESULTADOS OBTENIDOS
run:
Registro:EditorGrafico {
nombre=Registro de Datos',
 figuras=[Figura{  nombre='Cuadrado', area=40, largo=80', lado=20}, Figura{  nombre='Circulo', area=50, largo=80'Circulo{  nombre='Circulo', circunferencia=100, diametro=40}],
 textos=[Texto{texto='Ejercicios 1'}],
 grupos=[Grupo{nombre='FEITEC', figuras=[Figura{  nombre='Cuadrado', area=40, largo=80', lado=20}, Figura{  nombre='Circulo', area=50, largo=80'Circulo{  nombre='Circulo', circunferencia=100, diametro=40}]}]
}
BUILD SUCCESSFUL (total time: 1 second)
*/