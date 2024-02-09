package boletines.boletin4.bidimensional;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio04 {
	// Ejercicio 4 Realiza ajustes al programa previo de modo que las sumas
	// parciales y la suma total se visualicen en la pantalla con un ligero retardo,
	// creando la sensación de que la computadora está "pensando" antes de mostrar
	// los números.
	public static void main(String[] args) throws InterruptedException {
		int filas = 4;
		int columnas = 5;
		final String RESET = "\u001B[0m";
		final String ROJO = "\u001B[31m";
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

		System.out.print("\n\n\n");
		Thread.sleep(500);
		int sumaTotal = 0;
		for (int fila = 0; fila < filas; fila++) {
			int sumaFila = 0;
			for (int columna = 0; columna < columnas; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
				sumaFila += tabla[fila][columna];
				sumaColumnas[columna] += tabla[fila][columna];
			}
			sumaTotal += sumaFila;
			Thread.sleep(500);
			System.out.println(ROJO + sumaFila + RESET);
			Thread.sleep(500);
		}

		for (int i : sumaColumnas) {
			Thread.sleep(500);
			System.out.print(ROJO + i + "\t");
			Thread.sleep(500);
			sumaTotal += i;
		}
		Thread.sleep(1500);
		System.out.print(ROJO + sumaTotal + RESET);

	}

}
