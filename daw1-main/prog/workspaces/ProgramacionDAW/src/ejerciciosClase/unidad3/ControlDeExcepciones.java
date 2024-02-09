package ejerciciosClase.unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlDeExcepciones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número");
		int i = 0;
		try {
			i = scan.nextInt();
			System.out.println(i);
		} catch (InputMismatchException e) {
			System.out.println("No has introducido un número.");
		} finally {
			//Esto se ejecuta siempre
		}
		System.out.println("FIN DEL PROGRAMA");

	}
	

	public static String muestraCadena(String s) throws NumberFormatException {
		if (s.equals("0")) {
			throw new NumberFormatException();
		}
		return "";
		
	}
}
