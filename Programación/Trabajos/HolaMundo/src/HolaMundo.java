/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class HolaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comentario de una sola linea
		
		/*
		 * Comentario de
		 * varias lineas
		 */
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Introduce tu nombre");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre);
		scanner.close();
		

	}

}
