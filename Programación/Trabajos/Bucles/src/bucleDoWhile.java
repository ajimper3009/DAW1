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

		Scanner scan = new Scanner (System.in);
		boolean correcto = false;
		int num1, num2, opcion;
		do {
		
		
		System.out.println("Elije una opción:\n"
				+ "1.Sumar\n"
				+ "2.Restar\n"
				+ "3.Multiplicar\n"
				+ "4.Dividir");
		
		opcion = scan.nextInt();	
		if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
			correcto = true;
		} else {
			System.out.println("Valores incorrectos. Elige una opción correcta");
		}

			
		} while(!correcto);
		
		System.out.println("Introduce el priver valor");
		num1 = scan.nextInt();	
		System.out.println("Introduce el segundo valor");
		num2 = scan.nextInt();
		scan.close();
		
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
