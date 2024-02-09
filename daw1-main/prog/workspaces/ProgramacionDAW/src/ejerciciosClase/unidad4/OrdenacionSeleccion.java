package ejerciciosClase.unidad4;

public class OrdenacionSeleccion {
	/*
	 * Busca el elemento más pequeño de la lista y lo intercambia con el primer
	 * elemento.
	 * Luego busca el segundo elemento más pequeño y lo intercambia con el segundo
	 * elemento, y así sucesivamente.
	 * Tiene una complejidad de tiempo de O(n^2) en el peor de los casos.
	 */
	public static void main(String[] args) {
		int[] array = { 5, 2, 8, 1, 6 };

		System.out.println("Array original:");
		UtilidadesArray.mostrarArray(array);

		seleccion(array);

		System.out.println("\nArray ordenado con el método de selección:");
		UtilidadesArray.mostrarArray(array);
	}

	// Implementación del método de selección
	static void seleccion(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int indiceMenor = i;

			// Buscar el índice del menor elemento en el resto del array
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[indiceMenor]) {
					indiceMenor = j;
				}
			}

			// Intercambiar el elemento actual con el menor encontrado
			int temp = arr[i];
			arr[i] = arr[indiceMenor];
			arr[indiceMenor] = temp;
		}
	}
}