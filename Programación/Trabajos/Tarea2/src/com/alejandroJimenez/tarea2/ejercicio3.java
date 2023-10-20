package com.alejandroJimenez.tarea2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner (System.in);
		boolean correcto = false;
		int num1, num2, opcion;
		do {
		
		
			System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~\n"
					+ "1 - Sumar\n"
					+ "2 - Restar\n"
					+ "3 - Multiplicar\n"
					+ "4 - Dividir\n"
					+ "5 - Potencia\n"
					+ "0 - Salir del programa\n"
					+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			opcion = scan.nextInt();
			
			if (opcion == 0) {
				System.out.println("Saliendo de el programa...");
			}
			
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
				correcto = true;
		
			}
				
		} while (!correcto);
		
			System.out.println("Introduce el primer operando:");
			num1 = scan.nextInt();
			System.out.println("Introduce el segundo operando:");
			num2 = scan.nextInt();
			scan.close();
		
			switch(opcion) {
			
			case 1: 
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case 5:
				System.out.println("El resultado es:  " + Math.pow(num1, num1));
				break;
			default: 
					System.out.println("Los valores no son correcto vuelve a intentarlo");
			}
		
			
			
			
			
		
		 
		
		
		
	}

}
