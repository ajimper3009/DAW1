package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio03 {
//	Ejercicio 3
//	Escribe un programa que pida 10 números por teclado y que luego muestre los
//	números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//	máximo y del mínimo respectivamente.
	public static void main(String[] args) {
		System.out
		        .println("Este programa pide " + 10 + " enteros y los muestra indicando el máximo y el mínimo");
		int[] numeros = FuncionesMatematicas.getNumerosEnteros(10);
		int[] minMax = getMinMax(numeros);
		for (int index = 0; index < numeros.length; index++) {
			if (minMax[0] == minMax[1]) {
				System.out.println(numeros[index] + "\tMÁXIMO y MÍNIMO");
			} else {
				if (numeros[index] == minMax[1]) {
					System.out.println(numeros[index] + "\tMÁXIMO");
				}
				if (numeros[index] == minMax[0]) {
					System.out.println(numeros[index] + "\tMÍNIMO");
				}
				if (numeros[index] != minMax[0] && numeros[index] != minMax[1]) {
					System.out.println(numeros[index]);
				}
			}
		}

	}

	/*
	 * Primera solución. Habría que dar dos vueltas al array, una
	 * para calcular el máximo y otra para calcular el mínimo.
	 */
//	private static int indiceMaximo(int[] array) {
//		int indiceMax = Integer.MIN_VALUE;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > indiceMax) {
//				indiceMax = i;
//			}
//		}
//		return indiceMax;
//	}
//	private static int indiceMinimo(int[] array) {
//		int indiceMin = Integer.MAX_VALUE;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] < indiceMin) {
//				indiceMin = i;
//			}
//		}
//		return indiceMin;
//	}

	// Más eficiente. En una sola vuelta calculamos tanto máximo
	// como mínimo
	private static int[] getMinMax(int[] array) {
		int[] minMax = new int[2];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minMax[0] = min;
			}
			if (array[i] > max) {
				max = array[i];
				minMax[1] = max;
			}
		}
		return minMax;
	}

}
