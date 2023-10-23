package examenPrecencial;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("~~~~~~~~~~~~| MENÚ PRINCIPAL | ~~~~~~~~~~~\n"
				+ "| 1 - Módulo de Programación             |\n"
				+ "| 2 - Modulo de Lenguaje de Marcas       |\n"
				+ "| 0 - Resumen y salida del programa      |\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
		System.out.println("Introduce una opción");
		int opcion = scan.nextInt();
		
		System.out.println("Introduce el numero decimal");
		double nota = scan.nextDouble();
		
		
		if (opcion == 1 || opcion == 2 || opcion == 0) {
		
				
		}
		
		switch (opcion) {
			
		case 0: 
			if (opcion == 0) {
				System.out.println("Introduce la nota de Programación");
				double notaPro = scan.nextDouble();
				System.out.println("Introduce la nota de Leguaje de Marcas");
				double notaLen = scan.nextDouble();
				System.out.println("Calificaciones DAW\n"
						+ "Modulo de Programación: " + notaPro + "\n"
						+ "Modulo de Lenguaje de marcas: " + notaLen);
				System.out.println("Saliendo del programa");
			}	break;
		
		case 1: 
			
			if (opcion == 1) {
				System.out.println("Tu nota es del modulo de Programación: " + nota);
				break;
			}
			
		case 2: 
			
			if (opcion == 2) {
				System.out.println("Tu nota es del modulo de Lenguaje de Marcas: " + nota);
				break;
			}
		
		default: 
			System.out.println("la opción que has introducido no es valida, vuelve a intentarlo");	
		}
		scan.close();
		
	}

}
