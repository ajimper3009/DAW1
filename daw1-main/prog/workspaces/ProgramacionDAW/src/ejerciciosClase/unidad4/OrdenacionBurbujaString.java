package ejerciciosClase.unidad4;

public class OrdenacionBurbujaString {
	/*
	 * Es uno de los algoritmos de ordenación más sencillos.
	 * Compara repetidamente cada par de elementos adyacentes y los intercambia si
	 * están en el orden incorrecto.
	 * Caso Ideal: Cuando estás trabajando con un conjunto de datos pequeño y en
	 * gran parte ya está ordenado.
	 * Ejemplo: Ordenar una lista corta de tareas pendientes en la que
	 * frecuentemente se agregan nuevas tareas al final de la lista.
	 */
	public static void main(String[] args) {
		String[] array = { "hola", "adios", "sí", "no" };

		System.out.println("Array original:");
		UtilidadesArray.mostrarArray(array);

		burbuja(array);

		System.out.println("\nArray ordenado con el método de la burbuja:");
		UtilidadesArray.mostrarArray(array);
	}

	// Implementación del método de la burbuja
	static void burbuja(String[] arr) {
		int n = arr.length;
		boolean intercambio;

		do {
			intercambio = false;

			for (int i = 0; i < n - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					// Intercambiar arr[i] y arr[i+1]
					String temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					intercambio = true;
				}
			}

		} while (intercambio);
	}
}