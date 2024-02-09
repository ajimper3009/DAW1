package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio01 {

//		Ejercicio 1
//		Escribe un programa que lea 10 números por teclado y que luego los muestre
//		en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//		y viceversa.
	public static void main(String[] args) {
		int[] numeros = FuncionesMatematicas.getNumerosEnteros(10);
		// 3. Recorremos el array en orden ascendente y mostramos los elementos
		for (int i = numeros.length -1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
