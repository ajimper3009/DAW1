package boletines.boletin4.bidimensional;

public class EjercicioExtra01 {

	/**
	 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
	 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
	 * programa debe mostrar los números de la diagonal que va desde la esquina
	 * superior izquierda a la esquina inferior derecha, así como el máximo, el
	 * mínimo
	 * y la media de los números que hay en esa diagonal.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[][] n = new int[10][10];
		// genera el array y lo muestra
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				n[i][j] = (int) (Math.random() * 101) + 200;
				System.out.printf("%d \t", n[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nDiagonal desde la esquina superior izquierda a la esquina inferior derecha: ");
		int maximo = 200;
		int minimo = 300;
		int suma = 0;
		for (int i = 0; i < 10; i++) {
			int numero = n[i][i];
			System.out.print(numero + "\t");
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
			suma += numero;
		}
		System.out.println("\n");
		System.out.println("Máximo: " + maximo);
		System.out.println("Mínimo: " + minimo);
		System.out.println("Media: " + ((double) suma / 10));
	}

}
