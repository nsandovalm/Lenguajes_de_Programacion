/*
Elaborado por: Noelia Sandoval
Enunciado: Escriba una función que permita rotar una secuencia de elementos N posiciones a la izquierda
o a la derecha según sea el caso en función al parámetro que se reciba. Los parámetros deben ser un
puntero a un arreglo previamente creado, la cantidad de movimiento de rotación y la dirección
(0 = izq y 1 = der). A partir de esta función, escriba un programa que haga varias rotaciones
cualesquiera de una secuencia de elementos previamente creada que sea inmutable. Al final debe
imprimirse el resultado de cada rotación además de la secuencia original.
*/
package main

import "fmt"

var arrRotado [8]int

func RotarSecuencia(arrO [8]int, d int, cantR int) {

	if d == 1 {
		for x := 0; x < 8; x++ {
			if x+cantR >= 8 {
				arrRotado[(x+cantR)-8] = arrO[x]
			} else {
				arrRotado[x+cantR] = arrO[x]
			}
		}
	} else {
		for x := 7; x >= 0; x-- {
			if x-cantR < 0 {
				arrRotado[(x-cantR)+8] = arrO[x]
			} else {
				arrRotado[x-cantR] = arrO[x]
			}
		}
	}
}

func main() {
	arrOriginal := [8]int{1, 2, 3, 4, 5, 6, 7, 8}
	cantRotaciones := 3
	direccion := "izq"
	fmt.Println("------------------------------ Ejercicio 3 -------------------------------")
	fmt.Println("Arreglo Original: ", arrOriginal)
	fmt.Println("Cantidad de rotaciones: ", cantRotaciones)
	fmt.Println("Direccion: ", direccion)
	if direccion == "izq" {
		RotarSecuencia(arrOriginal, 0, cantRotaciones)
	} else {
		RotarSecuencia(arrOriginal, 1, cantRotaciones)
	}
	fmt.Println("Arreglo Rotado: ", arrRotado)
	fmt.Println("*************************************************************************")

	fmt.Println("Cambiando la variable direccion--------------------------")
	direccion = "der"
	fmt.Println("Arreglo Original: ", arrOriginal)
	fmt.Println("Cantidad de rotaciones: ", cantRotaciones)
	fmt.Println("Direccion: ", direccion)
	if direccion == "izq" {
		RotarSecuencia(arrOriginal, 0, cantRotaciones)
	} else {
		RotarSecuencia(arrOriginal, 1, cantRotaciones)
	}
	fmt.Println("Arreglo Rotado: ", arrRotado)

}

/*
	Resultados obtenidos:

GOROOT=C:\Program Files\Go #gosetup
GOPATH=C:\Users\0\go #gosetup
"C:\Program Files\Go\bin\go.exe" build -o C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio3_go.exe "C:\Users\0\Desktop\TEC\II Semestre 2022\Lenguajes\S2\practicaRepositorio\paradigmaImperativo\S2\Ejercicio3\ejercicio3.go" #gosetup
C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio3_go.exe
------------------------------ Ejercicio 3 -------------------------------
Arreglo Original:  [1 2 3 4 5 6 7 8]
Cantidad de rotaciones:  3
Direccion:  izq
Arreglo Rotado:  [4 5 6 7 8 1 2 3]
*************************************************************************
Cambiando la variable direccion--------------------------
Arreglo Original:  [1 2 3 4 5 6 7 8]
Cantidad de rotaciones:  3
Direccion:  der
Arreglo Rotado:  [6 7 8 1 2 3 4 5]

Process finished with the exit code 0


*/
