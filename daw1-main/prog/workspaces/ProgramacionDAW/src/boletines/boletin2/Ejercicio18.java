package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio18 {
	/*
	 * 18. Escribe un programa que calcule la media de un conjunto de números
	 * positivos introducidos por teclado. A priori, el programa no sabe cuántos
	 * números se introducirán. El usuario indicará que ha terminado de introducir
	 * los datos cuando meta un número negativo.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numeros = 0;
		double numeroIntroducido = 0;
		double suma = 0;
		System.out.println("Este programa calcula la media de los números positivos introducidos.");
		System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");
		while (numeroIntroducido >= 0) {
			numeroIntroducido = scan.nextDouble();
			numeros++;
			suma += numeroIntroducido;
		}
		scan.close();
		System.out.println(
		        "La media de los números positivos introducidos es " + (suma - numeroIntroducido) / (numeros - 1));

	}

}
