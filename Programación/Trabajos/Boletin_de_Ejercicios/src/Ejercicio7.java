/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int euro = 1;
		double dolar = 1.06;
		double conversion = dolar + euro;
	
		System.out.println("120 € son: " + (120 + conversion) + "$");
		*/
		
		// Opcion B: Introduciendo los valores por teclado



		Scanner scanner= new Scanner(System.in);
		System.out.println("Introduce el número de euros: (€)");
		double euros = scanner.nextDouble();
		System.out.println("Introduce el cambio actual de dólares ($) a euros");
		double equiv = scanner.nextDouble();
		double conversion = euros + equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		scanner.close(); 
	
	
	}
	

}
