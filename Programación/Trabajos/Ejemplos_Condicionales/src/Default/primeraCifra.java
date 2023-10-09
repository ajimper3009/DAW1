/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class primeraCifra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce un número de 5 cifras como maximo");
		int numero = scan.nextInt();
		
		int primeraCifra = numero % 10;
		
		if (numero <= 99999) {
			System.out.println(primeraCifra);
		}else {
			System.out.println("El número que has introducido no es correcto");
		}
		
			
			scan.close();
		}
		
	}


