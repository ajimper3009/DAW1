package Examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu estatura");
		double Estatura = scan.nextDouble();
		
		System.out.println("Introduce tu peso");
		double peso = scan.nextDouble();
		
		double IMC = peso / Math.pow(Estatura, 2);
		
		if (IMC <= 18.5) {
			System.out.println("Tu Indice de Masa Corporal es: Infrapeso");
		
		}
		if (IMC > 18.5) {
			System.out.println("Tu Indice de Masa Corporal es: Ideal");
		}
		
		if (IMC > 25) {
			System.out.println("Tu Indice de Masa Corporal es: Sobrepeso");
		}
		
		if (IMC > 30.00) {
			System.out.println("Tu Indice de Masa Corporal es: Obeso");
		}
	scan.close();
	
	}

}
