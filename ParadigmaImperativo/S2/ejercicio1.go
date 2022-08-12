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


/*
	Resultados obtenidos:
GOROOT=C:\Program Files\Go #gosetup
GOPATH=C:\Users\0\go #gosetup
"C:\Program Files\Go\bin\go.exe" build -o C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio1_go.exe "C:\Users\0\Desktop\TEC\II Semestre 2022\Lenguajes\S2\practicaRepositorio\paradigmaImperativo\S2\Ejercicio1\ejercicio1.go" #gosetup
C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio1_go.exe
------------------------------ Ejercicio 1 -------------------------------------------------
Yo tengo una gallina pinta,
piririnca, piriranca, rubia y titiblanca,
esta gallina tiene unos pollitos pintos,
piririncos, pirirancos, rubios y titiblancos,
si esta gallina no fuera pinta,
piririnca, piriranca, rubia y titiblanca,
no tendría los pollitos pintos,
piririncos, pirirancos, rubios y
titiblancos
-------------------------------------------------------------------------------
Cantidad de caracteres: R/ 308
Cantidad de palabras: R/ 42
Cantidad de lineas: R/ 8

Process finished with the exit code 0



*/

