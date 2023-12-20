package boletinArrays;

import java.util.Scanner;

public class ajedrez {

	public static void main(String[] args) {
		System.out.println("Introduce la posición del alfil, con el formato LETRANUMERO. Ejemplo: \"d5\"");
		Scanner scan = new Scanner(System.in);
		String posicionAlfil = scan.nextLine();
		scan.close();
		char letra = posicionAlfil.charAt(0);
		char numero = posicionAlfil.charAt(1);
		// Se pinta el tablero marcando el alfil con una X
		for (char fila = '8'; fila >= '1'; fila--) {
			for (char columna = 'a'; columna <= 'h'; columna++) {
				if (letra == columna && numero == fila) {
					System.out.print("X\t");
				} else {
					System.out.print(columna + "" + fila + "\t");
				}
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");

		/*
		 * OPCIÓN 1. GUARDAR LOS MOV EN STRING
		 * ""+FILA+COL
		 * OPCIÓN 2. GUARDAR LOS MOV EN CHAR
		 * Crearemos un array para guardar las filas
		 * que corresponderá con la columna correspondiente
		 * en el mismo índice en el array de columnas
		 */
		char[] arrayFilas = new char[15];
		char[] arrayColumnas = new char[15];
		int indexArraysSolucion = 0;
		// Calculo la diagonal arriba-derecha
		char fila = numero;
		char columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna++;
			fila++;
		}
		System.out.print("\n");
		// Calculo la diagonal abajo-derecha
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna++;
			fila--;
		}
		System.out.print("\n");
		// Calculo la diagonal abajo-izquierda
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna--;
			fila--;
		}
		System.out.print("\n");
		// Calculo la diagonal arriba-izquierda
		// matriz
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna--;
			fila++;
		}
		System.out.print("\n\n");
		
		// TODO: EXTRA. Una vez calculados los movimientos, pintarlos en rojo en la
		// Se pinta el tablero marcando el alfil con una X
		// y los movimientos disponibles en rojo
		final String RESET = "\u001B[0m";
		final String ROJO = "\u001B[31m";
		for (char filaColor = '8'; filaColor >= '1'; filaColor--) {
			for (char columnaColor = 'a'; columnaColor <= 'h'; columnaColor++) {
				if (letra == columnaColor && numero == filaColor) {
					System.out.print("X\t");
				} else {
					//Lógica para pintar los datos de color
					System.out.print(columnaColor + "" + filaColor + "\t");
				}
			}
			System.out.print("\n");
			
			
		}
		
	}
		
	
}


