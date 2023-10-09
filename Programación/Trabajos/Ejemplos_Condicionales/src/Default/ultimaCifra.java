/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class ultimaCifra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce un número entero de 1 o mas cifras:");
		
		int numero = scan.nextInt();
		
		int ultimaCifra = numero % 10;
		
		System.out.println("La ultima cifra de " + numero + " es: " + ultimaCifra);
		
		scan.close();
		
		
		
	}

}
