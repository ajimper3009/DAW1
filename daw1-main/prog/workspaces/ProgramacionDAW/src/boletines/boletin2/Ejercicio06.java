package boletines.boletin2;

import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche.
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a calcular los segundos que quedan para la medianoche.");
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();
		System.out.println("Introduce el minuto: ");
		int min = scan.nextInt();
		scan.close();
		int seg = 0;
		if (hora >= 0 && hora < 24 && min >= 0 && min < 60) {
			seg = (23 - hora) * 3600 + (60 - min) * 60;
			System.out.println("Quedan " + seg + " segundos para la medianoche.");
		} else {
			System.out.println(
			        "Hay un error en la introducción de los datos. Debe proporcionar una hora entre las 00:00 y las 23:59");
		}

	}

}
