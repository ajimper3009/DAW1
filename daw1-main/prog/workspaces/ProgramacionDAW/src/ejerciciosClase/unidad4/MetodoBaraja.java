package ejerciciosClase.unidad4;

import java.util.Random;

import ejerciciosClase.unidad5.Baraja;
import ejerciciosClase.unidad5.Carta;

public class MetodoBaraja {
	/*
	 * El "método de la baraja" no es un término comúnmente asociado con un
	 * algoritmo de ordenación específico en el ámbito de la informática y la
	 * programación. Sin embargo, podría estar haciendo referencia a una variante
	 * del algoritmo de ordenación llamado "Shuffle Sort" o "Fisher-Yates Shuffle",
	 * que se utiliza para mezclar aleatoriamente un conjunto de elementos, como en
	 * el caso de barajar una baraja de cartas.
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Array original:");
		UtilidadesArray.mostrarArray(array);

		barajarArray(array);

		System.out.println("\nArray barajado:");
		UtilidadesArray.mostrarArray(array);
	}

	// Implementación del algoritmo de Fisher-Yates Shuffle
	public static void barajarArray(int[] array) {
		Random rand = new Random();

		for (int i = array.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);

			// Intercambiar array[i] y array[j]
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}