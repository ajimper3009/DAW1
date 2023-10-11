/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class bucleDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean correcto = false;
		int num1, num2, opcion;
		do {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Elije una opción:\n"
				+ "1.Sumar\n"
				+ "2.Restar\n"
				+ "3.Multiplicar\n"
				+ "4.Dividir");
		int opcion1 = scan.nextInt();
			System.out.println("Introduce el priver valor");
		int num1 = scan.nextInt();	
			System.out.println("Introduce el segundo valor");
		int num2 = scan.nextInt();
			
		if (opcion1 == 1 || opcion1 == 2 || opcion1 == 3 || opcion1 == 4) {
			correcto = true;
		}
			
		} while(!correcto);
		
		switch (opcion) {
		case 1: 
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
		
		
		
		
			
		
		
		
		
		
		
		
	}

}
