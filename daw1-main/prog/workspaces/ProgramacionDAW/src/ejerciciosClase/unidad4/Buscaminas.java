package ejerciciosClase.unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Buscaminas {

	public static void main(String[] args) throws IlegalArgumentExeption {
		// TODO Auto-generated method stub

		// Se pueden formar 2 tableros
		// Facil: tablero 9x9 con 10 minas
		// Dificil: Tablero 16 x 16 con 40 minas

		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		boolean opcionCoreccta = false;
		int opcion = 0;
		while (!opcionCoreccta) {
			mostrarMenu();

			try {
				opcion = scan.nextInt();
				if (opcion == 0 && opcion == 1 && opcion == 2) {
					opcionCoreccta = true;

				} else {
					System.out.println("El nivel seleccionado es erroneo, introduce una opción valida");

				}

			} catch (InputMismatchException e) {
				scan.next();
			}

		}
		switch (opcion) {
		case 1:
			System.out.println("Has elegido un tablero facil de buscaminas");
			crearTablero(9);
			break;
		case 2:
			System.out.println("Has elegido un tablero dificil de buscaminas");
			crearTablero(16);
			break;
		case 0:
			break;

		}

		System.out.println("Hasta Luego!");

	}

	private static void mostarTablero(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.println(tablero[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}

	private static int[][] crearTablero(int tamanio) throws IlegalArgumentExeption {
		int bombas = 0;

		switch (tamanio) {
		case 9:
			bombas = 10;
			break;

		case 16:
			bombas = 40;
			break;

		default:
			throw new IlegalArgumentExeption("El tamaño de tablero es incorrecto");
		}

		// Creamos el tablero
		int[][] tablero = new int[tamanio][tamanio];
		// Ubicamos las bombas
		while (bombas > 0) {
			int filas = calcularNumeroAleatorio(0, tamanio - 1);
			int columnas = calcularNumeroAleatorio(0, tamanio - 1);
			if (tablero[filas][columnas] == 0) {
				tablero[filas][columnas] = -1;
				bombas--;
			}
		}
		mostarTablero(tablero);
		// Calcular las bombas proximas
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				// esquina superior izquierda
				if (tablero[i][j] != -1) {
					int cuentaBombas = 0;
					if (i == 0 && j == 0) {
						for (int x = i; x < i + 1; x++) {
							for (int z = j; z < j + 1; z++) {
								if (tablero [x] [z] == -1) {
									cuentaBombas++;
								}
							}
						}
						tablero [i] [j] = cuentaBombas ;
					}

				}

			}
		}

		// Devolvemos tablero
		return tablero;

	}

	private static int calcularNumeroAleatorio(int limInf, int limSup) {

		return (int) (Math.random() * (limSup - limSup + 1) + limInf);

	}

	private static void mostrarMenu() {
		System.out.println("Elije un nivel para el buscaminas");
		System.out.println("1.- Facil");
		System.out.println("2.- Dificil");
		System.out.println("0.- Salir");
	}

}
