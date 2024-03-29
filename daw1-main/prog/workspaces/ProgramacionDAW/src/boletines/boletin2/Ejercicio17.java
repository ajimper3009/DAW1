package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio17 {
	/*
	 * 17. Escribe un programa que diga si un número introducido por teclado es o no
	 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
	 * unidad.
	 */
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero y le diré si es primo: ");
		Scanner scan = new Scanner(System.in);
		int numeroIntroducido = scan.nextInt();
		scan.close();
		boolean esPrimo = true;
		for (int i = 2; i < numeroIntroducido; i++) {
			if ((numeroIntroducido % i) == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("El número introducido es primo.");
		} else {
			System.out.println("El número introducido no es primo.");
		}

	}

}
