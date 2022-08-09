/*
Elaborado por: Noelia Sandoval
Enunciado: Haga un programa que cuente e indique el número de caracteres, el número de palabras y
el número de líneas de un texto cualquiera (obtenido de cualquier forma que considere). Considere
hacer el cálculo de las tres variables en el mismo proceso.
*/

package main

import (
	"fmt"
	"strings"
)

// strings.Fields() divide una cadena alrededor de uno o más
// espacios en blanco consecutivos. El número de campos es el número real de palabras
func ContarPalabras(t string) int {
	return len(strings.Fields(t))
}

func CantidadLineas(s string, r rune) int {
	count := 0
	for _, c := range s {
		if c == r {
			count++
		}
	}
	return count
}

func main() {
	var texto string

	fmt.Println("------------------------------ Ejercicio 1 -------------------------------------------------")
	texto = "Yo tengo una gallina pinta,\npiririnca, piriranca, rubia y titiblanca,\nesta gallina tiene unos pollitos pintos,\npiririncos, pirirancos, rubios y titiblancos,\nsi esta gallina no fuera pinta,\npiririnca, piriranca, rubia y titiblanca,\nno tendría los pollitos pintos,\npiririncos, pirirancos, rubios y\ntitiblancos"

	fmt.Println(texto)
	fmt.Println("-------------------------------------------------------------------------------")
	fmt.Println("Cantidad de caracteres: R/", len(texto))
	fmt.Println("Cantidad de palabras: R/", ContarPalabras(texto))
	fmt.Println("Cantidad de lineas: R/", CantidadLineas(texto, '\n'))
}
