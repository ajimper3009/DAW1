package ejerciciosBoletin1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double conversion = 1.05;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el número de euros: ");
		int euros = scan.nextInt();

		double conversor = euros - conversion;
		
		scan.close();
		
		System.out.println("Conversor: " + euros + " € " + " son " + conversor + " $ ");
		
		
		
	}

}
