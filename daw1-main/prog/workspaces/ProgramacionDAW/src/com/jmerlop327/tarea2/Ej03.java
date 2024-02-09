package com.jmerlop327.tarea2;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variable lógica que controla la repetición del bucle
		boolean salir = false;
		do {
			// Se muestra el menú, al menos se ejecutará una vez. do-while
			System.out.println("\n~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~" + "\n1 - Suma                             |"
			        + "\n2 - Resta                            |" + "\n3 - Multiplicación                   |"
			        + "\n4 – División                         |" + "\n5 - Raíz cuadrada                    |"
			        + "\n6 – Potencia                         |" + "\n0 - Salir del programa               |"
			        + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			// Se solicita una opción de menú al usuario
			System.out.println("\nIntroduce una opción con los números indicados en el menú");
			int opcion = scan.nextInt();
			double num1, num2;
			switch (opcion) {
			case 0:
				System.out.println("Pulsa cualquier tecla para salir");
				String cualquiera = "";
				// reseteamos el buffer del Scanner
				scan.nextLine();
				cualquiera = scan.nextLine();
				// también podemos poner (null != cualquiera && !cualquiera.isBlank() && !cualquiera.isEmpty())
				if (!"".equals(cualquiera)) {
					salir = true;
				}
				System.out.println("Hasta Luego! Gracias por usar la calculadora.");
				break;
			case 1:
				System.out.println("Has elegido la suma. Introduce dos operandos");
				System.out.println("Operando 1:");
				num1 = scan.nextDouble();
				System.out.println("Operando 2:");
				num2 = scan.nextDouble();
				System.out.println("El resultado de la suma " + num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.println("Has elegido la raíz cuadrada. Introduce un operando");
				System.out.println("Operando:");
				num1 = scan.nextDouble();
				System.out.println("El resultado de la raíz cuadrada de " + num1 + " es " + Math.sqrt(num1));
				break;
			case 6:

				break;

			default:
				System.out.println("ERROR! Elige una de las opciones del menú");
				break;
			}
		} while (!salir);
		// Cerramos el Scanner cuando no lo vamos a usar más
		scan.close();
	}

}
