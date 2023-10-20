package ejerciciosBoletin1;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double conversion = 0.95;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce el número de dolares: ");
		int dolares = scan.nextInt();

		double conversor = dolares - conversion;
		
		scan.close();
		
		System.out.println("Conversor: " + dolares + " $ " + " son " + conversor + " € ");
		
		
	}

}
