package boletin2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el valor de h:");
		double h = scan.nextDouble();
		
		double resultado = Math.sqrt((2 + h)/9.81);
		
		System.out.println("El resultado de el problemas es: " + resultado);
		
		scan.close();
		
	}

}
