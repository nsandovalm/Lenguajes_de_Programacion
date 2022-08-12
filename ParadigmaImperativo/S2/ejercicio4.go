/*
Elaborado por: Noelia Sandoval
Enunciado: Escriba un programa que utilice una estructura y un arreglo/slice para almacenar
en memoria un inventario de una tienda que vende zapatos. Cada zapato debe contar con la información
de su modelo (marca), su precio y la talla del mismo que debe ir únicamente del 34 al 44. La estructura
debe llamarse "calzado". El programa debe poder almacenar la información “quemada” para 10+ zapatos del
inventario y un stock de N cantidad de unidades de dicho zapato (quiere decir por ejemplo que puede existir
en inventario el zapato marca Nike, talla 42 y que cuesta 50000 colones, pero además que puede existir no solo
un par de esos, si no N pares del mismo zapato). Haga una función que venda zapatos
(eliminando del stock cada vez que haya venta e indicando que no se puede vender porque ya o hay stock)
y pruébela dentro del main haciendo las ventas que usted considere para demostrar su funcionamiento.
*/
package main

import "fmt"

type calzado struct {
	marca  string
	precio int
	talla  int
	stock  int
}
type listaCalzado []calzado

var lCalzado listaCalzado

func (l *listaCalzado) agregarCalzado(marca string, precio int, talla int, stock int) {

	var prod = l.buscarCalzado(marca)
	if prod != -1 {
		(*l)[prod].stock = (*l)[prod].stock + stock
		if (*l)[prod].precio != precio {
			(*l)[prod].precio = precio
		}
	} else {
		*l = append(*l, calzado{marca: marca, precio: precio, talla: talla, stock: stock})
	}
}

func (l *listaCalzado) buscarCalzado(marca string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].marca == marca {
			result = i
		}
	}
	return result
}

func (l *listaCalzado) venderCalzado(marca string, cant int) {
	var prod = l.buscarCalzado(marca)
	if prod != -1 && cant > 0 {
		if (*l)[prod].stock >= cant {
			(*l)[prod].stock = (*l)[prod].stock - cant
			fmt.Println("*************************************")
			fmt.Println("----Producto vedido con exito--------")
			fmt.Println("Caracteristicas del calzado vendido:")
			fmt.Println("Marca: ", (*l)[prod].marca)
			fmt.Println("Precio: ₡", (*l)[prod].precio)
			fmt.Println("Talla: ", (*l)[prod].talla)
		} else {
			fmt.Println("No hay la cantidad de calzado disponible que se solicita")
		}
		if (*l)[prod].stock == 0 {
			fmt.Println("*******************************************")
			fmt.Println("Ya no se encuentra disponible el calzado", (*l)[prod].marca)
			(*l) = append((*l)[:prod], (*l)[prod+1:]...)
			fmt.Println("*******************************************")
		}

	} else {
		fmt.Println("El calzado solicitado no se encuentra disponible en este momento")
	}
}

func llenarDatos() {
	lCalzado.agregarCalzado("Nike", 50000, 38, 10)
	lCalzado.agregarCalzado("Adidas", 65000, 40, 30)
	lCalzado.agregarCalzado("Prada", 500000, 35, 3)
	lCalzado.agregarCalzado("Dior", 350000, 41, 20)
	lCalzado.agregarCalzado("Gucci", 650000, 39, 12)
	lCalzado.agregarCalzado("Puma", 70000, 36, 16)
	lCalzado.agregarCalzado("Converse", 82000, 37, 30)
	lCalzado.agregarCalzado("Crocs", 75000, 39, 35)
	lCalzado.agregarCalzado("Giannico", 40000, 40, 6)
	lCalzado.agregarCalzado("Camper", 25000, 35, 9)
}

func (l *listaCalzado) ImprimirCalzado() {
	fmt.Println("***********************************************************")
	for list := range *l {
		fmt.Println("Marca: ", lCalzado[list].marca, ", Precio: ₡", lCalzado[list].precio, ", Talla: ", lCalzado[list].talla, ", Stock: ", lCalzado[list].stock)
	}

}

func main() {
	llenarDatos()
	fmt.Println("--------------------------Ejercicio 4------------------------------------------")
	lCalzado.ImprimirCalzado()
	lCalzado.venderCalzado("Giannico", 5)
	lCalzado.venderCalzado("Adidas", 8)
	lCalzado.venderCalzado("Giannico", 1)
	lCalzado.ImprimirCalzado()
}

/*
	Resultados obtenidos:

GOROOT=C:\Program Files\Go #gosetup
GOPATH=C:\Users\0\go #gosetup
"C:\Program Files\Go\bin\go.exe" build -o C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio4_go.exe "C:\Users\0\Desktop\TEC\II Semestre 2022\Lenguajes\S2\practicaRepositorio\paradigmaImperativo\S2\Ejercicio4\ejercicio4.go" #gosetup
C:\Users\0\AppData\Local\Temp\GoLand\___go_build_ejercicio4_go.exe
--------------------------Ejercicio 4------------------------------------------
***********************************************************
Marca:  Nike , Precio: ₡ 50000 , Talla:  38 , Stock:  10
Marca:  Adidas , Precio: ₡ 65000 , Talla:  40 , Stock:  30
Marca:  Prada , Precio: ₡ 500000 , Talla:  35 , Stock:  3
Marca:  Dior , Precio: ₡ 350000 , Talla:  41 , Stock:  20
Marca:  Gucci , Precio: ₡ 650000 , Talla:  39 , Stock:  12
Marca:  Puma , Precio: ₡ 70000 , Talla:  36 , Stock:  16
Marca:  Converse , Precio: ₡ 82000 , Talla:  37 , Stock:  30
Marca:  Crocs , Precio: ₡ 75000 , Talla:  39 , Stock:  35
Marca:  Giannico , Precio: ₡ 40000 , Talla:  40 , Stock:  6
Marca:  Camper , Precio: ₡ 25000 , Talla:  35 , Stock:  9
*************************************
----Producto vedido con exito--------
Caracteristicas del calzado vendido:
Marca:  Giannico
Precio: ₡ 40000
Talla:  40
*************************************
----Producto vedido con exito--------
Caracteristicas del calzado vendido:
Marca:  Adidas
Precio: ₡ 65000
Talla:  40
*************************************
----Producto vedido con exito--------
Caracteristicas del calzado vendido:
Marca:  Giannico
Precio: ₡ 40000
Talla:  40
*******************************************
Ya no se encuentra disponible el calzado Giannico
*******************************************
***********************************************************
Marca:  Nike , Precio: ₡ 50000 , Talla:  38 , Stock:  10
Marca:  Adidas , Precio: ₡ 65000 , Talla:  40 , Stock:  22
Marca:  Prada , Precio: ₡ 500000 , Talla:  35 , Stock:  3
Marca:  Dior , Precio: ₡ 350000 , Talla:  41 , Stock:  20
Marca:  Gucci , Precio: ₡ 650000 , Talla:  39 , Stock:  12
Marca:  Puma , Precio: ₡ 70000 , Talla:  36 , Stock:  16
Marca:  Converse , Precio: ₡ 82000 , Talla:  37 , Stock:  30
Marca:  Crocs , Precio: ₡ 75000 , Talla:  39 , Stock:  35
Marca:  Camper , Precio: ₡ 25000 , Talla:  35 , Stock:  9

Process finished with the exit code 0

*/
