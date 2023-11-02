package programacionObjetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a hacer la operación A/B, introduce a contunuación 2 numeros enteros");
		float f = (float) 7 / (float) 0;
		try {
			int a = scan.nextInt();
			System.out.println("Introduce el segundo número");
			int b = scan.nextInt();
			if (b == 0) {
				throw new ArithmeticException();
			}
			float resul = (float) a / (float) b;
			System.out.printf("El resultado es:\n %d / %d = %f", a, b, resul);
		} catch (InputMismatchException ime) {
			System.out.println("anto A como B tienen que ser números enteros");
		} catch (ArithmeticException ae) {
			System.out.println("El número B no puede ser 0, por que no es posible la división");
		}

		scan.close();

	}

}
