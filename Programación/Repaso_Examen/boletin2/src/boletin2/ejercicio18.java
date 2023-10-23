package boletin2;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce un número para saber si es primo o no");
		
		int numero = scan.nextInt();
		
		scan.close();
		boolean esPrimo = true;
		for (int i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
		
				esPrimo = false;
			}
				
			
		}
		
		if (esPrimo) {
			System.out.println("Este número es primo");
			
		}else {
			System.out.println("Este número no es primo");
		}
		
		
		
	}

}
