package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio08 {
	// 8. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
	// y que los almacene en un array. El programa debe ser capaz de pasar todos los
	// números pares a las primeras posiciones del array (del 0 en adelante) y todos
	// los números impares a las celdas restantes. Utiliza arrays auxiliares si es
	// necesario.
	public static void main(String[] args) {
		System.out.println("Este programa pide 20 números enteros y debe guardarlos en un array "
		        + "poniendo en las primeras posiciones del array los números impares y los pares en las últimas");
		long[] numeros = FuncionesMatematicas.getNumerosAleatorios(20, 0l, 100l);
		// Mostrar datos inciales
		System.out.print("INICIAL -->[");
		for (long num : numeros) {
			System.out.print(num + ", ");
		}
		System.out.println("]");

		// Opción A. Pedir todos los números usando el método getNumerosEnteros y luego
		// ordenarlos como se indica
//		int ejecucionesA = 0;
//		long[] numerosPares = new long[NUMEROS.length];
//		int indexPares = 0;
//		long[] numerosImpares = new long[NUMEROS.length];
//		int indexImpares = 0;
//		for (long num : NUMEROS) {
//			ejecucionesA++;
//			if (FuncionesMatematicas.esPar(num)) {
//				numerosPares[indexPares++] = num;
//			} else {
//				numerosImpares[indexImpares++] = num;
//			}
//		}
//		for (int i = 0; i < NUMEROS.length; i++) {
//			ejecucionesA++;
//			if (indexPares > i) {
//				NUMEROS[i] = numerosPares[i];
//			}
//
//		}
//		for (int i = 0; i < NUMEROS.length; i++) {
//			ejecucionesA++;
//			if (indexImpares > i) {
//				NUMEROS[i + indexPares] = numerosImpares[i];
//			}
//
//		}
		// Opción B. Buscar una solución más eficiente. Después de la investigación
		// llegamos a la conclusión que la solución más eficiente pasa por contar los
		// números pares a la vez que los introducimos en el array e ir guardando los
		// índices donde están los números impares para luego guardarlos según los
		// índices memorizados. El coste total de la solución sería entre 1x y 2x la
		// longitud del array
		int ejecucionesB = 0;
		long[] ordenado = new long[numeros.length];
		long[] numImpares = new long[numeros.length];
		int cuentaPares = 0;
		int cuentaImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			ejecucionesB++;
			long actual = numeros[i];
			if (FuncionesMatematicas.esPar(actual)) {
				ordenado[cuentaPares++] = actual;
			} else {
				numImpares[cuentaImpares++] = actual;
			}
		}
		for (int i = 0; i < cuentaImpares; i++) {
			ejecucionesB++;
			ordenado[i + cuentaPares] = numImpares[i];
		}
		// Mostrar datos finales
		System.out.print("FINAL -->[");
		for (long num : ordenado) {
			System.out.print(num + ", ");
		}
		System.out.println("]");
//		System.out.println("Pares: " + indexPares);
//		System.out.println("Impares: " + indexImpares);
//		System.out.println("ejecuciones de A: " + ejecucionesA);
		System.out.println("ejecuciones de B: " + ejecucionesB);

	}

}
