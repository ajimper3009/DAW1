package boletinArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilidadesUnidad4 {
	/**
	 * @return
	 */
	public static int[] obtieneEnteros(int numEnteros) {
		Scanner scan = new Scanner(System.in);
		// 1. Declaramos un array con espacio para numEnteros elementos de tipo int
		int[] numeros = new int[numEnteros];
		// 2. Un bucle que pida numEnteros enteros al usuario y lo guardamos en el array
		System.out.println("Este programa pide " + numEnteros + " enteros y los muestra indicando el máximo y el mínimo");
		for (int i = 0; i < numeros.length; i++) {
			boolean correcto = false;
			while (!correcto) {
				try {
					System.out.printf("Introduce un entero. Quendan %d números por introducir.\n", numEnteros - i);
					numeros[i] = scan.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					// no hago nada y vuelve a ejecutar el while
					scan.next();
					System.out.println("El número introducido no es un entero");
				}
			}
		}
		scan.close();
		return numeros;
	}
}
