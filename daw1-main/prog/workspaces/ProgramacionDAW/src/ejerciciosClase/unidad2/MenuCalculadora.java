package ejerciciosClase.unidad2;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correcto = false;
		int num1, num2, opcion;
		do {
			System.out.println("Introduce la operación que desees realizar:"
					+ "\n1. Sumar"
					+ "\n2. Restar"
					+ "\n3. Multiplicar"
					+ "\n4. Dividir");
			opcion = scan.nextInt();
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
				correcto = true;
			} else {
				System.out.println("Valores incorrectos. Elige una opción correcta");				
			}
	
		}while(!correcto);
		
		System.out.println("Introduce el primer operando:");
		num1 = scan.nextInt();
		System.out.println("Introduce el segundo operando:");
		num2 = scan.nextInt();
		scan.close();
		
		switch (opcion) {
		case 1:
			// Comprueba qué pasa si no pones los paréntesis en (num1+num2)
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			
			break;
		case 3:
			System.out.println(num1 + " - " + num2 + " = " + (num1*num2));
			
			break;
		case 4:
			// Comprueba qué pasa si dividimos así: (num1/num2)
			System.out.println(num1 + " - " + num2 + " = " + (num1/num2));
			
			break;

		default:
			break;
		}
		
	}

}
