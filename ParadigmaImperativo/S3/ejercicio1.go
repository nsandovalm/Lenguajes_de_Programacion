/*
Elaborado por: Noelia Sandoval Marín
Enunciado: Amplie el funcionamiento del ejercicio de Productos visto en
           clase para que el programa ahora permita:
              a.	A partir de la lista de productos con mínimas existencias de inventario,
                    ampliar dicho inventario con la compra de más unidades de dicho producto hasta
                    que cumplan con el mínimo establecido de manera constante. Se sugiere crear una
                    función denominada “aumentarInventarioDeMinimos(listaMinimos)”
              b.	Crear una función que ordene la lista de productos usando como llave para el ordenamiento
                    cualquiera de los elementos de la estructura producto. La lista/slice debe quedar modificada
                    al finalizar el método. Se solicita investigar y hacer uso de alguna función predefinida de
                    alguna librería del lenguaje Go.
*/

package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

var lMinProductos listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	// modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
	// de elementos del producto y eventualmente el precio si es que es diferente
	var prod = l.buscarProducto(nombre)
	if prod != -1 {
		(*l)[prod].cantidad = (*l)[prod].cantidad + cantidad
		if (*l)[prod].precio != precio {
			(*l)[prod].precio = precio
		}
	} else {
		*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	}
}

func (l *listaProductos) buscarProducto(nombre string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}
	return result
}

func (l *listaProductos) venderProducto(nombre string, cant int) {
	var prod = l.buscarProducto(nombre)
	if prod != -1 && cant > 0 {
		if (*l)[prod].cantidad >= cant {
			(*l)[prod].cantidad = (*l)[prod].cantidad - cant
			fmt.Println("Producto vedido con exito")
		} else if (*l)[prod].cantidad == 0 {
			(*l) = append((*l)[:prod], (*l)[prod+1:]...)
			fmt.Println("Producto elimiado")
			/*var i int
			for i = 0; i < len(*l); i++ {
				if (*l)[i].nombre == nombre {
					(*l) = append((*l)[:i], (*l)[i+1:]...)
					fmt.Println("Producto elimiado")
				}
			}*/
		} else {
			fmt.Println("No se puede vender mayor cantidad de productos que los que hay en existencia")
		}
		//modificar para que cuando no haya existencia de cantidad de productos, el producto se elimine de "la lista"
	}

	/*if (*l)[prod].cantidad == 0 {
		(*l) = append((*l)[:prod], (*l)[prod+1:]...)
	}*/
}

func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 12, 4500)
}

func (listaMinimos *listaProductos) aumentarInventarioDeMinimos() listaProductos {
	for prod := range *listaMinimos {
		(*listaMinimos)[prod].cantidad = (((*listaMinimos)[prod].cantidad) + existenciaMinima) - ((*listaMinimos)[prod].cantidad)
	}
	return *listaMinimos
}

func (l *listaProductos) ordenarLista() listaProductos {
	sort.SliceStable(*l, func(i, j int) bool {
		return (*l)[i].cantidad < (*l)[j].cantidad
	})
	return (*l)
}

// DEVOLVER UNA LISTA NUEVA
func (l *listaProductos) listarProductosMínimos() listaProductos {
	// debe retornar una nueva lista con productos con existencia mínima
	var listMinimos []producto
	for prod := range *l {
		if (*l)[prod].cantidad <= existenciaMinima {
			listMinimos = append(listMinimos, (*l)[prod])
		}
	}
	return listMinimos
}

func main() {
	fmt.Println("*********************************************************")
	fmt.Println("Llenar la lista:")
	llenarDatos()
	fmt.Println(lProductos)
	fmt.Println("*********************************************************")
	fmt.Println("")

	fmt.Println("Función agregar Producto: ")
	lProductos.agregarProducto("arroz", 5, 2200)
	fmt.Println(lProductos)
	fmt.Println("*********************************************************")
	fmt.Println("")

	fmt.Println("Vender productos: ")
	lProductos.venderProducto("arroz", 4)
	fmt.Println("----------------------------------------------------------")
	lProductos.venderProducto("arroz", 16)
	fmt.Println("----------------------------------------------------------")
	lProductos.venderProducto("arroz", 3)
	fmt.Println("----------------------------------------------------------")
	fmt.Println(lProductos)
	fmt.Println("")

	fmt.Println("*********************************************************")
	fmt.Println("Lista productos minimos:")
	lMinProductos = lProductos.listarProductosMínimos()
	fmt.Println(lMinProductos)
	fmt.Println("")

	fmt.Println("*********************************************************")
	fmt.Println("Aumentar la lista productos minimos")
	fmt.Println(lMinProductos.aumentarInventarioDeMinimos())
	fmt.Println("")

	fmt.Println("*********************************************************")
	fmt.Println("Ordenar la lista mediante cantidad: ")
	fmt.Println(lProductos.ordenarLista())

}

/*
	RESULTADOS

*********************************************************
Llenar la lista:
[{arroz 15 2500} {frijoles 4 2000} {leche 8 1200} {café 12 4500}]
*********************************************************

Función agregar Producto:
[{arroz 20 2200} {frijoles 4 2000} {leche 8 1200} {café 12 4500}]
*********************************************************

Vender productos:
Producto vedido con exito
----------------------------------------------------------
Producto vedido con exito
----------------------------------------------------------
Producto elimiado
----------------------------------------------------------
[{frijoles 4 2000} {leche 8 1200} {café 12 4500}]

*********************************************************
Lista productos minimos:
[{frijoles 4 2000} {leche 8 1200}]

*********************************************************
Aumentar la lista productos minimos
[{frijoles 10 2000} {leche 10 1200}]

*********************************************************
Ordenar la lista mediante cantidad:
[{frijoles 4 2000} {leche 8 1200} {café 12 4500}]

Process finished with the exit code 0

*/
