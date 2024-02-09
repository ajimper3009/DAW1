package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
	 * =
	 * 0).
	 * Ejemplo 1:
	 * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
	 * Por favor, introduzca el valor de a: 2
	 * Ahora introduzca el valor de b: 1
	 * x = -0.5
	 * Ejemplo 2:
	 * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
	 * Por favor, introduzca el valor de a: 0
	 * Ahora introduzca el valor de b: 7
	 * Esa ecuación no tiene solución real.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a resolver una ecuación de primer grado ax + b = 0");
		System.out.println("Introduce el parámetro a: ");
		int a = scan.nextInt();
		if (0 == a) {
			System.out.println("Esa ecuación no tiene solución real.");
		} else {			
			System.out.println("Introduce el parámetro b: ");
			int b = scan.nextInt();
			System.out.println("La ecuación a resolver es: " + a + "x + " + b + " = 0");
			double x = - (double) b / (double) a;
			System.out.println("La solución es x = " + x + ".");
		}
		
		scan.close();
	}

}
