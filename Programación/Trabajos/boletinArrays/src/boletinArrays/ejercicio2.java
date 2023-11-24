package boletinArrays;

public class ejercicio2 {

	public static void main(String[] args) {
		
		// Reutilizamos el método de obetener enteros por consola
		int filas = 4;
		int columnas = 5;
		int numerosTotales = filas * columnas;
		int [] array = UtilidadesUnidad4.obtieneEnteros(20);
		int [][] tabla = new int [filas] [columnas];
		int [] sumaColumnas = new int [columnas];
		int indexNum = 0;
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				tabla[fila][columna] = array[indexNum++];
				
			}
			
			
		}
	
		int sumaTotal  = 0;
		for (int fila = 0; fila < filas; fila++) {
			int sumaFila = 0;
		
			for (int columna = 0; columna < columnas; columna++) {
				System.out.println(tabla[fila][columna] + "\t");
				sumaFila += tabla[fila][columna];
				sumaColumnas [columnas] += tabla[fila][columnas];
			}	
			System.out.println(sumaFila);
			int sumaCol = 0;
		}
		for (int i : sumaColumnas) {
			System.out.println(i + "\t");
			 sumaTotal  += i;
		}

	}
		
}
