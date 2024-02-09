package com.jmerlop327.tarea2;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variables para guardar los números del programa
		// Se utiliza el tipo adecuado para cada variable
		int num, mayor = 0, menor = 0, numIntroducidos = 0;
		long suma = 0;
		double media = 0;
		String numeros = "\n";

		System.out.println("De los números que insertes, se mostrará lo siguiente:" + "\n- mayor número introducido"
		        + "\n- menor número introducido" + "\n- suma de todos los números"
		        + "\n- media aritmética de todos los números");
		do {
			// Se pide al menos un número al usuario. Se ejecutará una vez como mínimo.
			// do-while
			System.out.println("Introduce un número para continuar o -1 para terminar:");
			num = scan.nextInt();
			if (num != -1) {
				numIntroducidos++;
				if (numIntroducidos == 1) {
					mayor = num;
				} else if (mayor < num) {
					mayor = num;
				}
				if (numIntroducidos == 1) {
					menor = num;
				} else if (menor > num) {
					menor = num;
				}
				suma += num;
				media = (double) suma / (double) numIntroducidos;
				// EXTRA. Vamos guardando los números introducidos
				if (numIntroducidos == 1) {
					numeros += num;
				} else {
					numeros += ", " + num;
				}
			}
		} while (num != -1);
		// Cuando salimos del bucle mostramos el resultado final
		if (numIntroducidos == 0) {
			System.out.println("No se ha introducido ningún número");
		} else {
			System.out.println("Para los siguientes números introducidos:" + numeros
			        + "\n- mayor número introducido: " + mayor + "\n- menor número introducido: " + menor
			        + "\n- suma de todos los números: " + suma + "\n- media aritmética de todos los números: " + media);
		}
		// Cerramos el Scanner cuando no lo vamos a usar más
		scan.close();
	}

}
