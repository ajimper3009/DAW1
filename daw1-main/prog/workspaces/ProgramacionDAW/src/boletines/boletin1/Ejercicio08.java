package boletines.boletin1;

import java.util.Scanner;

/**
 * Ahora realiza el conversor en sentido contrario
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de dólares ($): ");
		// refactor rename
		double dolares = scanner.nextDouble();
		System.out.println("Introduce el cambio actual de euros (€) a dólares ($): ");
		double equiv = scanner.nextDouble();
		double conversion = dolares * equiv;
		System.out.println(dolares + "$ equivalen a " + conversion + "€");
		scanner.close();

	}

}
