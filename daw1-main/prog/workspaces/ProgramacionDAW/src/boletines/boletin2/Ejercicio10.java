package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribe un programa que diga cuál es la última cifra de un número entero
		// introducido por teclado
		// Creación del objeto Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = scan.nextInt();
		scan.close();
		// El módulo devuelve el resto de la división entera
		// Si dividimos por 10, el resto será la última cifra
		int ultimaCifra = num % 10;
		System.out.println("La última cifra del número " + num + " es " + ultimaCifra);

	}

}
