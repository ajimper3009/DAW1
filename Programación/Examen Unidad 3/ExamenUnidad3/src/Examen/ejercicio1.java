package Examen;

import java.util.Calendar;
import java.util.Scanner;

import examen2.util.UtilidadesExamen;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int horaActual = Calendar.HOUR_OF_DAY;
		int dia = Calendar.DAY_OF_WEEK;
		int diaMes1 = Calendar.DAY_OF_MONTH;
		
		System.out.println("---------------| MENÚ FECHAS |---------------");
		System.out.println("| 1 - Qué hora es?                          |\n"
				+ "| 2 - Qué día de la semana es?              |\n"
				+ "| 3 - Qué día del mes es?                   |\n"
				+ "| 4 - Cuántos días quedan para Nochevieja?  |\n"
				+ "| 0 - Cerrar el programa                    |\n"
				+ "---------------------------------------------");
		
		System.out.println("Selecciona un número del 0 al 4");
		int opcion = scan.nextInt();
		
		switch (opcion) {
		
		case 0:
			
			System.out.println("Cerrando el programa...");
			break;
		
		case 1:
			
			System.out.println(UtilidadesExamen.obtenerHoraActual(horaActual));
			
			break;
		case 2:
			
			System.out.println(UtilidadesExamen.obtenerDiaSemana(dia));
			
			break;
		case 3:
			System.out.println(UtilidadesExamen.obtenerDiaMes(diaMes1));
			break;
			
		case 4:
			break;
		

		default:
			
			System.out.println("Has introducido un valor erroneo");
			break;
		}
		
		scan.close();
	}

}
