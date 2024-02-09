package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("Este programa pide 8 números enteros y muestra cuáles son pares e impares");
		int[] numeros = FuncionesMatematicas.getNumerosEnteros(8);
		for (int i : numeros) {
			if (FuncionesMatematicas.esPar(i)) {
				System.out.printf("%d Par\n", i);
			} else {
				System.out.printf("%d Impar\n", i);
			}
		}

	}

}
