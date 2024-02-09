package examenes.examen3;

public class Matrices {

	public static void main(String[] args) {
		int[][] matrizA = { { 2, 1 }, { 3, 4 } };
		int[][] matrizB = { { 1, 2 }, { 2, 1 } };
		mostrarMatriz(matrizA);
		mostrarMatriz(matrizB);
		int[][] suma = sumaMatrices(matrizA, matrizB);
		mostrarMatriz(suma);
		int[][] producto = multiplicaMatrices(matrizA, matrizB);
		mostrarMatriz(producto);

	}

	/**
	 * Suma 2 matrices de enteros
	 * 
	 * @param matriz1
	 * @param matriz2
	 * @return suma
	 */
	public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
		int filasM1 = matriz1.length;
		int columnasM1 = matriz1[0].length;
		int filasM2 = matriz2.length;
		int columnasM2 = matriz2[0].length;
		int[][] suma = new int[filasM1][columnasM1];
		if (filasM1 != filasM2 || columnasM1 != columnasM2) {
			System.out.println("Las matrices de distinta dimensión no se pueden sumar");
		} else {
			for (int i = 0; i < filasM1; i++) {
				for (int j = 0; j < columnasM1; j++) {
					suma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
		}
		return suma;
	}

	/**
	 * Multiplica dos matrices de enteros
	 * @param matriz1
	 * @param matriz2
	 * @return producto
	 */
	public static int[][] multiplicaMatrices(int[][] matriz1, int[][] matriz2) {
		int filasM1 = matriz1.length;
		int columnasM1 = matriz1[0].length;
		int filasM2 = matriz2.length;
		int columnasM2 = matriz2[0].length;
		int[][] producto = new int[filasM1][columnasM2];
		if (columnasM1 != filasM2) {
			System.out.println("Las matrices no se pueden multiplicar");
		} else {
			for (int i = 0; i < producto.length; i++) {
				for (int j = 0; j < producto[i].length; j++) {
					// aquí calculo el elemento producto[i][j]
					producto[i][j] = calcularElementoProducto(matriz1, matriz2, i, j);
				}
			}
		}
		return producto;
	}

	/**
	 * Calcula el elemento en la posicion indicada
	 * @param matriz1
	 * @param matriz2
	 * @param i
	 * @param j
	 * @return elemento
	 */
	private static int calcularElementoProducto(int[][] matriz1, int[][] matriz2, int i, int j) {
		int elemento = 0;
		for (int k = 0; k < matriz2.length; k++) {
			elemento = elemento + matriz1[i][k] * matriz2[k][j];
		}
		return elemento;
	}

	/**
	 * Muestra la matriz
	 * @param matriz
	 */
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("________");
	}

}
