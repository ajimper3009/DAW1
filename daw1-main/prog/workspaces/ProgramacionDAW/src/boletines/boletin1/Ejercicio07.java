package boletines.boletin1;

import java.util.Scanner;

/**
 * 7. Realiza un conversor de euros a dólares. Busca la equivalencia de moneda
 * para el día de hoy. La cantidad en euros que se quiere convertir deberá estar
 * almacenada en una variable. Muestra un mensaje de la siguiente forma:
 * Conversor: 120 € son 117,9 $.
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		/* Opción A. Creando variables internas
		double equiv = 1.06;
		double euros = 235;
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		*/
		
		// Opción B. Introduciendo los valores por teclado
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de euros (€): ");
		double euros = scanner.nextDouble();
		System.out.println("Introduce el cambio actual de euros (€) a dólares ($): ");
		double equiv = scanner.nextDouble();
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		scanner.close();
	}

}
