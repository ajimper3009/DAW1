package boletines.boletin4.bidimensional;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio02 {
	// 2. Desarrolla un programa que solicite la entrada de 20 números enteros.
	// Estos números deberán ser almacenados en un array de dimensiones 4 filas por
	// 5 columnas. El programa exhibirá las sumas parciales tanto por filas como por
	// columnas, simularizando la presentación de una hoja de cálculo. La suma total
	// se deberá mostrar en la esquina inferior derecha del array.
	public static void main(String[] args) {
		int filas = 4;
		int columnas = 5;
		// Reutilizamos el método de obtener enteros por entrada estándar
		int numerosTotales = filas * columnas;
		int[] numeros = FuncionesMatematicas.getNumerosEnteros(numerosTotales);
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
