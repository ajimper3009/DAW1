package boletinArrays;

import java.util.Random;

public class MetodoBaraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	// Implementación del algoritmo de Fisher-Yates Shuffle
	public static void mezclarBaraja(Baraja mazo) {
		Random rand = new Random();
		Carta[] array = mazo.getBaraja();
		for (int i = array.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			
			// Intercambiar array[i] y array[j]
			Carta temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
		
	

}
