package ejerciciosClase.unidad4;

public class OrdenacionFusion {
	/*
	 * Divide la lista en mitades, ordena cada mitad recursivamente y luego combina
	 * las mitades ordenadas.
	 * Es un algoritmo de divide y conquista y tiene una complejidad de tiempo de
	 * O(n log n) en todos los casos.
	 */
	public static void main(String[] args) {
		int[] array = { 5, 2, 8, 1, 6 };

		System.out.println("Array original:");
		UtilidadesArray.mostrarArray(array);

		mergeSort(array);

		System.out.println("\nArray ordenado con el método de fusión:");
		UtilidadesArray.mostrarArray(array);
	}

	// Implementación del método de fusión
	static void mergeSort(int[] arr) {
		int n = arr.length;

		if (n > 1) {
			int mitad = n / 2;

			// Dividir el array en dos mitades
			int[] izquierda = new int[mitad];
			int[] derecha = new int[n - mitad];

			System.arraycopy(arr, 0, izquierda, 0, mitad);
			System.arraycopy(arr, mitad, derecha, 0, n - mitad);

			// Llamadas recursivas para ordenar las dos mitades
			mergeSort(izquierda);
			mergeSort(derecha);

			// Combinar las dos mitades ordenadas
			merge(arr, izquierda, derecha);
		}
	}

	// Método auxiliar para combinar dos mitades ordenadas
	static void merge(int[] arr, int[] izquierda, int[] derecha) {
		int i = 0, j = 0, k = 0;

		while (i < izquierda.length && j < derecha.length) {
			if (izquierda[i] <= derecha[j]) {
				arr[k++] = izquierda[i++];
			} else {
				arr[k++] = derecha[j++];
			}
		}

		while (i < izquierda.length) {
			arr[k++] = izquierda[i++];
		}

		while (j < derecha.length) {
			arr[k++] = derecha[j++];
		}
	}
}