/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class bucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crea un programa que cree la tabla del 7 utilizando un bucle for


		System.out.println("A continuación verás la tabla del 7\n");
			for (int cont = 0; cont <= 10; cont++) {
				System.out.println("7 x " + cont + " = " + 7 * cont );	}
		
	
	
		//Imprimir 2 númeroa pon pantalla y que te de los multiplos de 7 con bucle for
	
		Scanner scan = new Scanner (System.in);
	
		System.out.println("Introduce dos números por pantalla");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		for (int cont = num; cont <= num1; cont++) {
			if (cont % 7 == 0) {
				System.out.println(cont);
			}
			
			
		}
		
		
		
		scan.close();
	
	
	
	}
	
	
	

}
