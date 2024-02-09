package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Escribe un programa que diga cuál es la primera cifra de un número entero
		// introducido por teclado. Se permiten números de hasta 5 cifras
		// Creación del objeto Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = scan.nextInt();
		scan.close();
		int primeraCifra = 0;
		// TODO:EXTRA incluye los números negativos
		// Comprobamos si el número es de 1, 2, 3, 4 o 5 cifras
		if (num > 9999 && num <= 99999) {
			// num de 5 cifras
			primeraCifra = num / 10000;
		} else if (num > 999 && num <= 9999) {
			// num de 4 cifras
			primeraCifra = num / 1000;
		} else if (num > 99 && num <= 999) {
			// num de 3 cifras
			primeraCifra = num / 100;
		} else if (num > 9 && num <= 99) {
			// num de 2 cifras
			primeraCifra = num / 10;
		} else if (num >= 0 && num <= 9) {
			// num de 1 cifras
			primeraCifra = num;
		} else {
			System.out.println("El número debe tener entre 1 y 5 cifras");
		}
		if (primeraCifra != 0) {			
			System.out.println("La primera cifra del número " + num + " es " + primeraCifra);
		}

	}

}
