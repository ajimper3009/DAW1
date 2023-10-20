package boletin2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int horasOrdinarias = 40;
		int horasExtras = 41;
		
		System.out.println("Introduce las horas trabajadas");
		int horasTrabajadas = scan.nextInt();
		
		if (horasOrdinarias <= 40) {
			System.out.println(horasTrabajadas * 12);
		}else {
			System.out.println((horasOrdinarias * 12) + (horasExtras * 16));
		}
		
		scan.close();
	}

}
