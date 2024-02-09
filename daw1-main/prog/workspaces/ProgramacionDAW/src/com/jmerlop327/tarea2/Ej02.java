package com.jmerlop327.tarea2;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		// Generamos un número aleatorio
		int aleatorio = (int) (100 * Math.random() + 1);
		int intentos = 5;
		boolean correcto = false;
		// Creación del objeto Scanner
		Scanner scan = new Scanner(System.in);
		do {
			// Se solicita un número al usuario, al menos se ejecutará una vez. do-while
			System.out.println("Introduce un número entre 1 y 100. Te quedan " + intentos + " intentos.");
			int num = scan.nextInt();
			if (aleatorio == num) {
				correcto = true;
			} else {
				// Según si el valor es mayor o menor se da una pista al usuario
				intentos--;
				// Controlamos si es el último intento
				// Para no mostrar el mensaje de más! / menos!
				if (intentos > 0) {
					if (aleatorio > num) {
						System.out.println("MÁS!");
					} else {
						System.out.println("MENOS!");
					}
				}
			}
		} while (!correcto && intentos > 0);
		// Cerramos el Scanner cuando no lo vamos a usar más
		scan.close();
		// En función del valor de correcto mostramos el mensaje final
		if (correcto) {
			System.out.println("Ganaste! El número era " + aleatorio);
		} else {
			System.out.println("Perdiste! Has agotado todos tus intentos.  El número era " + aleatorio);
		}

	}

}
