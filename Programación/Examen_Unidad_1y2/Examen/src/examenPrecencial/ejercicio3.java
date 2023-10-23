package examenPrecencial;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce tu sueldo");
		
		int sueldo = scan.nextInt();
		
		if (sueldo <= 9000) {
				System.out.println("tu sueldo es: " + sueldo * 20);
				
		}
		
		if (sueldo >= 9001) {
			System.out.println("tu sueldo es: " + sueldo * 10);
		}
		
		if (sueldo >= 15001) {
			System.out.println("tu sueldo es: " + sueldo * 5);
		}
		
		if (sueldo >= 20000)
			System.out.println("tu sueldo es: " + sueldo * 1);
		
		scan.close();
	}

}
