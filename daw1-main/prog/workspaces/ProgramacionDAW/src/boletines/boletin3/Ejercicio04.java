package boletines.boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Introduce un número negativo");
				imprimeNegativo(scan.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("Solo se pueden introducir números enteros");
				scan.next();
			} catch (Exception e) {
				System.out.printf("ERROR. %s\n", e.getMessage());
			}

			try {
				System.out.println("Introduce un número positivo");
				imprimePositivo(scan.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("Solo se pueden introducir números enteros");
				scan.next();
			} catch (Exception e) {
				System.out.printf("ERROR. %s\n", e.getMessage());
			}
		}
	}

	private static void imprimePositivo(int p) throws Exception {
		if (p < 0) {
			throw new Exception("Error. El número debe ser positivo");
		} else {
			System.out.println(p);
		}
	}

	private static void imprimeNegativo(int n) throws Exception {
		if (n >= 0) {
			throw new Exception("Error. El número debe ser negativo");
		} else {
			System.out.println(n);
		}
	}

}
