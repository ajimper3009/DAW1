package boletines.boletin1;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double iva = 21d;
		System.out.println("Introduce la base imponible de la factura: ");
		double baseImp = scanner.nextDouble();
		// Precedencia de operadores
		double precio = baseImp + baseImp * iva / 100;
		System.out.println("El precio final del producto es: " + precio);
		scanner.close();

	}

}
