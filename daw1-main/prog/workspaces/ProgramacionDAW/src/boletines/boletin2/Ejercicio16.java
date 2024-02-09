package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * 16. Escribe un programa que muestre en tres columnas: el propio número, el
	 * cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se 
	 * introduce por teclado.
	 */
	public static void main(String[] args) {
		System.out.print("Introduzca un número: ");
		Scanner scan = new Scanner(System.in);
		int numeroIntroducido = scan.nextInt();
		scan.close();
		for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
			System.out.println(i + "\t" + i * i + "\t" + i * i * i);
		}
	}

}
