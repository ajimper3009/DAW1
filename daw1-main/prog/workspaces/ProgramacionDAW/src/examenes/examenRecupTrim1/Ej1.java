package examenes.examenRecupTrim1;

import java.util.Scanner;

public class Ej1 {

	static final int COMBINACION = 1111;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean abierto = false;
		boolean bloqueado = false;
		int intentosRestantes = 4;

		System.out.println("Introduzca la combinación...");

		do {
			int intentoUsuario = scan.nextInt();
			// No controlamos la entrada errónea de datos por ser tema 1-2
			if (COMBINACION == intentoUsuario) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
				abierto = true;
			} else {
				intentosRestantes--;
				// Si se agotan los intentos se bloquea la caja fuerte
				if (intentosRestantes > 0) {
					System.out.printf("Lo siento , esa no es la combinación. Tiene %d intentos más.\n",
					        intentosRestantes);
				} else {
					bloqueado = true;
					System.out.println("La caja fuerte se ha bloqueado, se debe desbloquear con la llave.");
				}
			}

		} while (!abierto && !bloqueado);
		scan.close();
	}

}
