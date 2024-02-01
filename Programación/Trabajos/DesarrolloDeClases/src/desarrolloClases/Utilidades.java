package desarrolloClases;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
	static Scanner scan = new Scanner(System.in);

		
	

	private static int dameEntero() {
		boolean correcto = false;
		int result = 0;
		while (!correcto) {
		try {
			System.out.println("Introduce un número");
			result = scan.nextInt();
			correcto = true;
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un número");
			
			}
		}
		return result;
		
	}
	private static int damechar() {
		boolean correcto = false;
		char result = 'a';
		while (!correcto) {
		try {
			System.out.println("Introduce un carácter");
			result = scan.next().charAt(1);
			correcto = true;
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un carácter");
			
			}
		}
		return result;
		
	}
	private static boolean dameSiNo() {
		boolean correcto = false;
		boolean result = false;
		while (!correcto) {
		try {
			System.out.println("Introduce Si o No");
			result = scan.hasNextBoolean();
			correcto = true;
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir Si o No");
			
			}
		}
		return result;
		
	}
	private static String dameCadena() {
		boolean correcto = false;
		String result = "";
		while (!correcto) {
		try {
			System.out.println("Introduce una cadena de texto");
			result = scan.next();
			correcto = true;
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir Si o No");
			
			}
		}
		return result;
		
	}
	
}


