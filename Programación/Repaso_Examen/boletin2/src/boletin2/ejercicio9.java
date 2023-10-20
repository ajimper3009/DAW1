package boletin2;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce una letra o un caracter como: *, +, €, $");		
		String caracter = scan.next();
		
		System.out.println("Introduce un vertice mediante un numero:\n"
				+ "1.- Hacia arriba\n"
				+ "2.- Hacia la derecha\n"
				+ "3.- Hacia abajo\n"
				+ "4.- Hacia la izquierda");
		
		int opcion = scan.nextInt();
		
		switch (opcion) {
		
		case 1:
			
			System.out.println("     " + caracter);
			System.out.println("    " + caracter + caracter + caracter);
			System.out.println("   " + caracter + caracter + caracter + caracter + caracter);
			System.out.println("  " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			
			break;
			
		case 2:
			
			System.out.println(caracter);
			System.out.println(caracter + caracter);
			System.out.println(caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter);
			System.out.println(caracter + caracter);
			System.out.println(caracter);
		
			break;
			
		case 3:
			
			System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter); 
			System.out.println("  " + caracter + caracter + caracter + caracter + caracter);
			System.out.println("   " + caracter + caracter + caracter);
			System.out.println("    " + caracter);
		
			break;
			
		case 4:
			
			
		System.out.println("                                            " + caracter);
		System.out.println("                                 " + caracter + caracter);
		System.out.println("                      " + caracter + caracter + caracter);
		System.out.println("           " + caracter + caracter + caracter + caracter);
		System.out.println("" + caracter + caracter + caracter + caracter + caracter);
		System.out.println("           " + caracter + caracter + caracter + caracter);
		System.out.println("                      " + caracter + caracter + caracter);
		System.out.println("                                 " + caracter + caracter);
		System.out.println("                                            " + caracter);
		
		break;
		
		}
		
		scan.close();
		
	}

}
