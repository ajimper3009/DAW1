package boletines.boletin4.bidimensional;

public class EjercicioExtra02 {
	/**
	 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
	 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
	 * programa debe mostrar los números de la diagonal que va desde la esquina
	 * inferior izquierda a la esquina superior derecha, así como el máximo, el
	 * mínimo y la media de los números que hay en esa diagonal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] n = new int[9][9];
		// Genera el array y lo muestra
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				n[i][j] = (int) (Math.random() * 401) + 500;
				System.out.printf("%d \t", n[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nDiagonal desde la esquina inferior izquierda a la esquina superior derecha: ");
		int maximo = 500;
		int minimo = 900;
		int suma = 0;
		for (int i = 0; i < 9; i++) {
			int numero = n[8 - i][i];
			System.out.print(numero + "\t");
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
			suma += numero;
		}
		System.out.println("\nMáximo: " + maximo);
		System.out.println("Mínimo: " + minimo);
		System.out.println("Media: " + ((double) suma / 10));
	}
}