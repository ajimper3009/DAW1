package boletin2;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
	 	int numero = scan.nextInt();
	 	
	 	for (int contador = numero; contador < numero + 5; contador++) {
	 		System.out.println(contador + "\t" + contador * contador + "\t" + contador * contador * contador);
	 		
	 		scan.close();
	 	}
		
	}

}
  