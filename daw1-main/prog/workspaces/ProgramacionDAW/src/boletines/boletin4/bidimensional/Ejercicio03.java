package boletines.boletin4.bidimensional;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio03 {
	// Ejercicio 3 Haz modificaciones al programa previo de manera que los números
	// introducidos en el array sean generados de manera aleatoria, con valores
	// comprendidos entre 100 y 999.
	public static void main(String[] args) {
		int filas = 4;
		int columnas = 5;
		// Reutilizamos el método de obtener enteros por entrada estándar
		int numerosTotales = filas * columnas;
		int[] numeros = FuncionesMatematicas.getNumerosAleatorios(numerosTotales, 100, 999);
		int[][] tabla = new int[filas][columnas];
		int[] sumaColumnas = new int[columnas];
		int indexNum = 0;
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				tabla[fila][columna] = numeros[indexNum++];
			}
		}

		int sumaTotal = 0;
		for (int fila = 0; fila < filas; fila++) {
			int sumaFila = 0;
			for (int columna = 0; columna < columnas; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
				sumaFila += tabla[fila][columna];
				sumaColumnas[columna] += tabla[fila][columna];
			}
			sumaTotal += sumaFila;
			System.out.println(sumaFila);
		}
		for (int i : sumaColumnas) {
			System.out.print(i + "\t");
			sumaTotal += i;
		}
		System.out.print(sumaTotal);

	}

}
