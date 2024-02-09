package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
		// Con Math.abs calculamos el valor absoluto de un número, así podemos calcular
		// el número de cifras para valores enteros positivos y negativos
		int num = Math.abs(scan.nextInt());
		scan.close();
		if (num < 10) {
			System.out.println("El número introducido tiene 1 dígito.");
		} else if ((num >= 10) && (num < 100)) {
			System.out.println("El número introducido tiene 2 dígitos.");
		} else if ((num >= 100) && (num < 1000)) {
			System.out.println("El número introducido tiene 3 dígitos.");
		} else if ((num >= 1000) && (num < 10000)) {
			System.out.println("El número introducido tiene 4 dígitos.");
		} else if (num >= 10000 && num <= 99999) {
			System.out.println("El número introducido tiene 5 dígitos.");
		} else {
			System.out.println("ERROR! El número introducido tiene más de 5 dígitos.");
		}
	}
}