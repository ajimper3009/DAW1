package Recuperacion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		boolean salir = false;
		int intentos = 3;
		int combinacionCaja = 1234;
		do {
			System.out.println("Introduce la combinación para desbloquear la caja fuerte");
			int combinacion = scan.nextInt();
			if(combinacion == combinacionCaja) {
				System.out.println("La caja fuerte se ha abierto correctamente");
				salir = true;
			} else if (combinacion != combinacionCaja) {
				int intentosCaja = intentos--;
				System.out.println("Combinacion incorrecta te quedan: " + intentosCaja + " intentos");
				if (intentos == -1) {
					System.out.println("La caja fuerte se ha bloqueado, se debe desbloquear con la llave");
					salir = true;
				}
			}
			
			
			
			
			
			
				
			
			
		} while (!salir);
		scan.close();
	}

}

