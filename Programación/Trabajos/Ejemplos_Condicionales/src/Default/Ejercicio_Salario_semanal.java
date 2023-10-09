/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio_Salario_semanal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el número de horas trabajadas ");
		double horas = scan.nextDouble();
		
		
		double horasOrdinarias = 12;
		double horasExtras = 16;
		scan.close();
				
		if(horas <= 40) {
			horas = horas * horasOrdinarias;
		} else {
			horas = 40 * horasOrdinarias + (horas - 40) * horasExtras; 		
		}
		System.out.println("El salario semanal es de " + horas + " euros");
		
	}

}
