package REPASO;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa el tamaño de la array");
		int tamaño = scan.nextInt();
		int [] numeros = new int [tamaño];
		
		
		for (int i = 0; i < tamaño; i++) {
			System.out.println("Ingresa el numero" + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		
		}
		 System.out.print("Números en orden inverso: ");
	        for (int i = numeros.length - 1; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }
	      scan.close();
	}

}
