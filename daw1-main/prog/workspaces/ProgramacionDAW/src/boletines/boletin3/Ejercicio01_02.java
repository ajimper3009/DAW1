package boletines.boletin3;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;


public class Ejercicio01_02 {

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				System.out.println("Has elegido la opción \"Añadir\"");
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				saltosDeLinea(10);
				System.out.println("Has elegido salir. Adiós!");
				break;

			default:
				saltosDeLinea(5);
				System.out.println("Opción no válida. Por favor elija otra");
				break;
			}
		} while (opcion  != 5);
	}

	private static int mostrarMenu() {
		Scanner scan = new Scanner(System.in);
		int opcionSeleccionada;
		System.out.println("1.- Añadir \n2.- Borrar \n3.- Modificar \n4.- Mostrar por pantalla \n5.- Finalizar \nElige una opción");
		opcionSeleccionada = scan.nextInt();
		return opcionSeleccionada;
	}
	
	private static void saltosDeLinea(int saltos) {
		String saltoString = StringUtils.EMPTY;
		for (int i = 1; i <= saltos; i++) {
			saltoString += "\n";
		}
		System.out.print(saltoString);
	}

}
