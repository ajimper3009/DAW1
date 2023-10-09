/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class Ecuación {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner (System.in);
		System.out.println("Vamos a resolver una ecuación de primer grado ax + b = 0");
		System.out.println("Introduce el parametro a: ");
		int a = scan.nextInt();
		
		if (0 == a) {
		System.out.println("Esa ecuación no tiene solucion real.");
		} else {	
		System.out.println("Introduce el parametro b: ");
		int b = scan.nextInt();
		System.out.println("La ecuación a resolver es: " + a + "x + " + b + " = 0");
		
		double x = - (double) b / (double) a;
		
	System.out.println("la solución es x = " + x + ".");
		}
		scan.close();
	}

}
