package boletines.boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		float resul = 0f;
		System.out.println("Vamos a hacer la operación A/B.\nTendrás que introducir dos números enteros.\nIntroduce A");

		try {
			a = scan.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Tanto A como B deben ser números enteros");
		}
		try {
			System.out.println("Introduce B");
			b = scan.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Tanto A como B deben ser números enteros");
		}
		try {
			if (b == 0) {
				throw new ArithmeticException();
			}
			resul = (float) a / (float) b;
		} catch (ArithmeticException ae) {
			System.out.println("El número B no puede ser 0, pues no es posible hacer la división");
		}
		System.out.printf("El resultado es:\n%d / %d = %f", a, b, resul);

		scan.close();

	}

}
