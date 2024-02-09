package examenes.examen3;

/*
 * ENUNCIADO
 * Realizar un programa en java que genere un cartón válido del bingo aleatoriamente y lo muestre. Luego deberás mostrar la lista de números del cartón en orden ascendente.
 * Un cartón del bingo es de la siguiente forma:
 * a. Los números van del 1 al 90 y deben calcularse aleatoriamente
 * b. No pueden darse números repetidos dentro del mismo cartón
 * c. Las decenas se organizan cada una en una columna, excepto el 90 que entraría en la columna de los 80
 * d. Cada cartón tiene exactamente 3 filas
 * e. En cada fila deben aparecer 5 números y 4 huecos (puedes indicar los huecos con 0 o -1 por ejemplo)
 */

public class CartonBingo {
	static int[] NUMEROS = new int[15];
	static int[][] CARTON = new int[3][9];

	public static void main(String[] args) {
		int contador = 0;
		while (contador < 15) {
			boolean colocado = false;
			int i = 0;
			while (!colocado && i < 3) {
				int numero = (int) ((Math.random() * 90) + 1);
				int columna = numero / 10 == 9 ? 8 : numero / 10;
				if (!repetido(numero) && !tresDecena(numero)) {
					if (CARTON[i][columna] == 0 && recuentoLinea(i) < 5) {
						CARTON[i][columna] = numero;
						NUMEROS[contador++] = numero;
						colocado = true;
					}
					i++;
				}

			}
		}

		mostrarCarton();
		ordenarNumeros();
		mostrarNumeros();
	}

	private static void mostrarNumeros() {
		System.out.println("__________________________________________________\nLista de números");
		for (int i = 0; i < NUMEROS.length; i++) {
			if (i < NUMEROS.length - 2) {
				System.out.print(NUMEROS[i] + ", ");
			} else if (i == NUMEROS.length - 2) {
				System.out.print(NUMEROS[i]);
			} else {
				System.out.print(" y " + NUMEROS[i] + ".");
			}
		}
	}

	private static int recuentoLinea(int i) {
		int numeros = 0;
		for (int j = 0; j < CARTON[i].length; j++) {
			if (CARTON[i][j] != 0) {
				numeros++;
			}
		}
		return numeros;
	}

	/**
	 * 
	 */
	private static void mostrarCarton() {
		System.out.println("\nCartón de Bingo:\n__________________________________________________");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(CARTON[i][j] + "\t");

			}
			System.out.print("\n");
		}
	}

	/**
	 * Ordenacion del array usando el método de la burbuja
	 */
	private static void ordenarNumeros() {
		boolean desordenado;
		do {
			desordenado = false;
			for (int i = 0; i < NUMEROS.length - 1; i++) {
				if (NUMEROS[i] > NUMEROS[i + 1]) {
					int aux = NUMEROS[i];
					NUMEROS[i] = NUMEROS[i + 1];
					NUMEROS[i + 1] = aux;
					desordenado = true;
				}
			}
		} while (desordenado);

	}

	private static boolean tresDecena(int numero) {
		boolean triplicado = false;
		int index = 0;
		int repeticiones = 0;
		int decena = numero / 10;
		while (repeticiones < 3 && index < NUMEROS.length && NUMEROS[index] != 0) {
			if (NUMEROS[index] / 10 == decena) {
				repeticiones++;
			}
			if (repeticiones == 3) {
				triplicado = true;
			}
			index++;
		}
		return triplicado;
	}

	private static boolean repetido(int numero) {
		boolean encontrado = false;
		int index = 0;
		while (!encontrado && index < NUMEROS.length) {
			if (NUMEROS[index++] == numero) {
				encontrado = true;
			}
		}
		return encontrado;
	}

}
