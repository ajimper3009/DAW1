package boletines.boletin4.bidimensional;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Tamaño del tablero
		int filas = 6;
		int columnas = 7;

		// Inicializar el tablero
		char[][] tablero = new char[filas][columnas];
		inicializarTablero(tablero);

		// Jugadores
		char jugadorActual = 'A';

		// Bucle principal del juego
		boolean gameOver = false;
		while (!gameOver) {
			// Mostrar el estado actual del tablero
			mostrarTablero(tablero);

			// Pedir al jugador actual que haga su movimiento
			int columna = obtenerColumna(tablero, jugadorActual);

			// Realizar el movimiento en el tablero
			hacerMovimiento(tablero, jugadorActual, columna);

			// Verificar si hay un ganador
			if (hayGanador(tablero, jugadorActual)) {
				mostrarTablero(tablero);
				System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
				gameOver = true;
			}

			// Verificar si el tablero está lleno (empate)
			if (tableroLleno(tablero) && !gameOver) {
				mostrarTablero(tablero);
				System.out.println("¡Empate!");
				gameOver = true;
			}

			// Cambiar al siguiente jugador
			jugadorActual = (jugadorActual == 'A') ? 'B' : 'A';
		}
	}

	// Inicializar el tablero con espacios en blanco
	private static void inicializarTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '0';
			}
		}
	}

	// Mostrar el tablero
	private static void mostrarTablero(char[][] tablero) {
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
	}

	// Obtener la columna válida del jugador
	private static int obtenerColumna(char[][] tablero, char jugador) {
		Scanner scanner = new Scanner(System.in);
		int columna = -1;
		boolean correcto = false;
		while (!correcto) {
			System.out.print("Jugador " + jugador + ", elige una columna (0-" + (tablero[0].length - 1) + "): ");
			columna = scanner.nextInt();
			if (columna >= 0 && columna < tablero[0].length && tablero[0][columna] == '0') {
				correcto = true;
			} else {
				System.out.println("Movimiento no válido. Intenta de nuevo.");
			}
		}
		return columna;
	}

	// Realizar el movimiento en el tablero
	private static void hacerMovimiento(char[][] tablero, char jugador, int columna) {
		boolean libre = false;
		int i = tablero.length - 1;
		while (!libre && i >= 0) {
			if (tablero[i][columna] == '0') {
				tablero[i][columna] = jugador;
				libre = true;
			}
			i--;
		}
	}

	// Verificar si hay un ganador
	private static boolean hayGanador(char[][] tablero, char jugador) {
		boolean gameOver = false;
		// Verificar horizontalmente
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j <= tablero[i].length - 4; j++) {
				if (tablero[i][j] == jugador && tablero[i][j + 1] == jugador && tablero[i][j + 2] == jugador
				        && tablero[i][j + 3] == jugador) {
					gameOver = true;
				}
			}
		}

		// Verificar verticalmente
		for (int i = 0; i <= tablero.length - 4; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == jugador && tablero[i + 1][j] == jugador && tablero[i + 2][j] == jugador
				        && tablero[i + 3][j] == jugador) {
					gameOver = true;
				}
			}
		}

		// Verificar en diagonal (\)
		for (int i = 0; i <= tablero.length - 4; i++) {
			for (int j = 0; j <= tablero[i].length - 4; j++) {
				if (tablero[i][j] == jugador && tablero[i + 1][j + 1] == jugador && tablero[i + 2][j + 2] == jugador
				        && tablero[i + 3][j + 3] == jugador) {
					gameOver = true;
				}
			}
		}

		// Verificar en diagonal (/)
		for (int i = 0; i <= tablero.length - 4; i++) {
			for (int j = 3; j < tablero[i].length; j++) {
				if (tablero[i][j] == jugador && tablero[i + 1][j - 1] == jugador && tablero[i + 2][j - 2] == jugador
				        && tablero[i + 3][j - 3] == jugador) {
					gameOver = true;
				}
			}
		}

		return gameOver;
	}

	// Verificar si el tablero está lleno (empate)
	private static boolean tableroLleno(char[][] tablero) {
		for (int i = 0; i < tablero[0].length; i++) {
			if (tablero[0][i] == '0') {
				return false;
			}
		}
		return true;
	}
}
