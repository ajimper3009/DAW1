package ejerciciosClase.unidad3;

import java.util.Scanner;

/*
 * Calcular si un numero introducido por teclado es primo o no
 */
public class NumeroPrimo {
	public static void main(String[] args) {
		System.out.println("Introduce un número para saber si es primo o no:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		if (NumeroPrimo.esPrimo(i)) {
			System.out.printf("El número %d es primo.\n", i);
		} else {
			System.out.printf("El número %d NO es primo.\n", i);			
		}
	}

	public static boolean esPrimo(int i) {
		boolean esPrimo = true;
		int index = 2;
		while (index < (i/2 + 1) && esPrimo) {
			if (i % index == 0) {
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
	}
}
