package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
	 * una altura h. Aplica la fórmula
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la altura desde la que cae el objeto: ");
		float h = scan.nextFloat();
		scan.close();
		final float G = 9.81f;
		double t = Math.sqrt((2 * h)/G);
		System.out.println("El objeto tardará en caer " + t + " segundos");
	}

}
