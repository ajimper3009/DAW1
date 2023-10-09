/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class horaDeterminada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce la hora: ");		
		int horas = scan.nextInt();
		System.out.println("Introduce los minutos: ");
		int minutos = scan.nextInt();
		
		int horasRestantes = 24 - horas;
		int minutosRestantes = 60 - minutos;
		int segundosRestantes = (23 - horas) * 3600 + (60 - minutos) * 60;
		
		System.out.println("Faltan " + horasRestantes + " horas para llegar a media noche");
		System.out.println("Faltan " + minutosRestantes + " minutos para llegar a media noche");
		System.out.println("Faltan " + segundosRestantes + " segundos para llegar a media noche");
		
		scan.close();
		
		if (horas < 23) {
			System.out.println("El valor indicado no es una hora ordinaria");
			}
		}
		
	}


