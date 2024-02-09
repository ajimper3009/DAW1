package com.jmerlop327.tarea2;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		// Contraseña guardada en el sistema
		final String password = "007%B0ndJam3s_b0nd";
		int intentos = 3;
		boolean acertado = false;
		// Creación del objeto Scanner
		Scanner scan = new Scanner(System.in);
		do {
			//Ejecutamos al menos una vez la solicitud de datos al usuario, en caso de no acertar repetimos el bucle
			System.out.println("Introduce la contraseña, tienes " + intentos + " intentos");
			System.out.printf("Introduce la contraseña, tienes " + intentos + " intentos");			
			if (password.equals(scan.nextLine())) {
				// Si la contraseña coincide, asignamos true a la vble acertado
				acertado = true;
			} else {
				// Si no acertamos restamos un intento
				intentos--;
			}

		} while (intentos > 0 && !acertado);
		// Cerramos el Scanner cuando no lo vamos a usar más
		scan.close();
		// En función del valor de acertado mostramos el mensaje final
		if (acertado) {
			System.out.println("Contraseña válida");
		} else {
			System.out.println("Has agotado todos tus intentos. Usuario bloqueado");
		}

	}

}
