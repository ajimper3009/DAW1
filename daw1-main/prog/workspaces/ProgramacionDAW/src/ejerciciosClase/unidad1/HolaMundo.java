/**
 * 
 */
package ejerciciosClase.unidad1;

import java.util.Scanner;

/**
 * 
 */
public class HolaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Comentario de una sola línea

		/*
		 * Comentario de varias líneas
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor: ");
		// En caso de recibir un texto incorrecto con el nextline, limpiar el buffer
		// haciendo previamente otro scanner.nextLine() sin guardarlo en ningún sitio.
		String miNombre = scan.nextLine();
		scan.close();
		String saludo = devuelveSaludo(miNombre);
		System.out.println(saludo);
	}
	
	public static String devuelveSaludo (String nombre) {
		String salida = "Hola " + nombre + "!";
		return salida;
	}

}
