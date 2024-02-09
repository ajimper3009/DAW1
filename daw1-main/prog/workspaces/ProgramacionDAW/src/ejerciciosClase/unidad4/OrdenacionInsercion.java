package ejerciciosClase.unidad4;

public class OrdenacionInsercion {
	/*
	 * Este algoritmo construye una secuencia ordenada de elementos uno a la vez.
	 * Es eficiente para pequeños conjuntos de datos, y es estable y fácil de
	 * implementar.
	 * Caso Ideal: Cuando estás trabajando con una lista que está casi ordenada o
	 * cuando los elementos son ingresados uno por uno.
	 * Ejemplo: Mantener ordenada una lista de reproducción de música mientras se
	 * agregan nuevas canciones una a la vez.
	 */
	public static void main(String[] args) {
		int[] array = { 7, 4, 3, 10, 6 };

		System.out.println("Array original:");
		UtilidadesArray.mostrarArray(array);

		insercion(array);

		System.out.println("\nArray ordenado con el método de inserción:");
		UtilidadesArray.mostrarArray(array);
	}

	// Implementación del método de inserción
	static void insercion(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int clave = arr[i];
			int j = i - 1;

			// Mover los elementos mayores que la clave a la derecha
			while (j >= 0 && arr[j] > clave) {
				arr[j + 1] = arr[j];
				j--;
			}

			// Insertar la clave en la posición correcta
			arr[j + 1] = clave;
		}
	}
}