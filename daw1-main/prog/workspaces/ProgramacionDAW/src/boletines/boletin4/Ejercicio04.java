package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio04 {
	// 4. Escribe un programa que lea 15 números por teclado y que los almacene en
	// un array. Rota los elementos de ese array una posición a la derecha, es
	// decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a
	// la 2, etc. El número que se encuentra en la última posición debe pasar a la
	// posición 0. Finalmente, muestra el contenido del array.
	public static void main(String[] args) {
		// Utilizamos el método de la clase utilidad
		int[] array = FuncionesMatematicas.getNumerosEnteros(15);
		rotaDcha(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

	/**
	 * Rota los elementos del array que se pasa por parámetro una posición a la
	 * derecha
	 * 
	 * @param array
	 */
	private static void rotaDcha(int[] array) {
		int longitud = array.length;
		int ultimoNum = array[longitud - 1];
		for (int index = 0; index < longitud - 1; index++) {
			array[longitud - index - 1] = array[longitud - index - 2];
		}
		array[0] = ultimoNum;
	}
}
