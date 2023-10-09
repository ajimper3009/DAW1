/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio_gravedad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el valor de h: ");
		
		double h = scan.nextDouble();
		
		double g = 9.81;
		
		double resultado = ((2 + h) / g);
				Math.sqrt(resultado);
		
		System.out.println(resultado);
		
		scan.close();
	}

}
