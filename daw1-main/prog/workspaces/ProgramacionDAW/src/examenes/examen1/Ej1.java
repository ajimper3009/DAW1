package examenes.examen1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double notaProg = -1d, notaLenMar= -1d;
		boolean salir = false;
		do {
			System.out.println("------------------| MENÚ PRINCIPAL |---------------\r\n"
					+ "| 1 – Módulo de Programación                      |\r\n"
					+ "| 2 – Módulo de Lenguajes de Marcas 		     |\r\n"
					+ "| 0 – Resumen y salida del programa 		     |\r\n"
					+ "---------------------------------------------------\r\n");
			System.out.println("Introduce la opción deseada: ");
			int opcion = scan.nextInt();
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.println("Introduce la nota de Programación: ");
				double auxP = scan.nextDouble();
				//EXTRA +0.25 Control de valor
				if (auxP >=0 && auxP <=10) {
					notaProg = auxP;
				} else {
					System.out.println("Nota incorrecta! Debe estar entre 0 y 10.");					
				}
				break;
			case 2:
				System.out.println("Introduce la nota de Lenguajes de Marcas: ");
				double auxL = scan.nextDouble();
				//EXTRA +0.25 Control de valor
				if (auxL >=0 && auxL <=10) {
					notaLenMar = auxL;
				} else {
					System.out.println("Nota incorrecta! Debe estar entre 0 y 10.");					
				}
				break;
			default:
				System.out.println("ERROR! Opción incorrecta.");				
				break;
			}

		} while (!salir);
		scan.close();
		
		System.out.println("Calificaciones DAW\r\n"
				+ "Módulo de Programación: " + (notaProg >=0 ? notaProg : "NOEV") + "\r\n"
				+ "Módulo de Lenguaje de Marcas: " + (notaLenMar >=0 ? notaLenMar : "NOEV") + "\r\n");

	}

}
