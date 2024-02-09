package boletines.boletin2;

import java.util.Scanner;

/*
 * Escribe un programa que ordene tres números enteros 
 * introducidos por teclado.
 */
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a ordenar 3 números introducidos por teclado.");
		System.out.println("Introduce el primer número: ");
		int a = scan.nextInt();
		System.out.println("Introduce el segundo número: ");
		int b = scan.nextInt();
		System.out.println("Introduce el tercer número: ");
		int c = scan.nextInt();
		int mayor, med, menor;
		scan.close();
		if (a >= b) {
			if (a >= c) {
				mayor = a;
				if (b >= c) {
					menor = c;
					med = b;
				} else {
					menor = b;
					med = c;
				}
			} else {
				mayor = c;
				med = a;
				menor = c;
			}
		} else {
			if (b >= c) {
				mayor = b;
				if (a >= c) {
					med = a;
					menor = c;
				} else {
					med = c;
					menor = a;
				}
			} else {
				mayor = c;
				med = b;
				menor = a;
			}
		}
		System.out.println("El orden de los números de menor a mayor es: " + menor + ", " + med + ", " + mayor);
	}

}
