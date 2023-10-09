/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class numerosOrdenados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el primer número");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo número");
		int b = scan.nextInt();
		System.out.println("Introduce el tercer y ultimo número");
		int c = scan.nextInt();
		
		if (a >= b) {
			System.out.println(a);
			}if (a >= c) {
				System.out.println(a);
				}if (b >= c) {
					System.out.println(b);
						}else {
				
		}

		
		
		
		
		
		
		scan.close();
	}

}
