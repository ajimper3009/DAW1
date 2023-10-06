/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class numeros_Ordenados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo número: ");
		int b = scan.nextInt();
	
		if (a >= b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
		
		
		
		
	
		
		scan.close();
	
	}

}
