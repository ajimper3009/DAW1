package examenes.examen2.main;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import examenes.examen2.util.UtilidadesExamen;

public class MenuFechas {

	public static void main(String[] args) {
		int option = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------------| MENÚ FECHAS |-------------\r\n"
			        + "| 1 – Qué hora es?                     	     |\r\n"
			        + "| 2 – Qué día de la semana es? 		     |\r\n" + "| 3 – Qué día del mes es? 		     |\r\n"
			        + "| 4 – Cuántos días quedan para Nochevieja?   |\r\n" + "| 0 – Cerrar el programa 		     |\r\n"
			        + "----------------------------------------------\r\n");
			System.out.println("Introduce la opción deseada: ");
			try {
				
				option = scanner.nextInt();
				Date now = new Date();
				switch (option) {
				case 1:
					//obtenerHoraActual
					System.out.println(UtilidadesExamen.obtenerHoraActual(now));
					break;
				case 2:
					//obtenerDiaSemana
					System.out.println(UtilidadesExamen.obtenerDiaSemana(now));
					break;
				case 3:
					//ObtenerDiaMes
					System.out.println(UtilidadesExamen.obtenerDiaMes(now));
					break;
				case 4:
					//ObtenerDiasNochevieja
					System.out.println(UtilidadesExamen.obtenerDiasNochevieja(now));
					break;
				case 0:
					System.out.println("Hasta pronto! muchas gracias.");
					break;
				}
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Introduzca una opción válida");
			}
		} while(option !=0);

	}

}
