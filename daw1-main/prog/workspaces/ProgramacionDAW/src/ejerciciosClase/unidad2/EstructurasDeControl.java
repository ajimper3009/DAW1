package ejerciciosClase.unidad2;

import java.util.Scanner;

public class EstructurasDeControl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// EJEMPLO IF-ELSE. Comprobar si un número es par
		System.out.println("Introduce un número entero: ");
		int num = scan.nextInt();
		if (num % 2 == 0) {			
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es impar.");			
		}
		// FIN EJEMPLO IF-ELSE.

		// EJEMPLO IF. Pasar las horas a formato 12 horas
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();
		System.out.println("Introduce el minuto: ");
		int min = scan.nextInt();
		System.out.println("Introduce el segundo: ");
		int seg = scan.nextInt();
		String amPm = "a.m.";
		
		if (hora > 12) {
			hora -= 12;
			amPm = "p.m.";
		}
		System.out.println("Son las " + hora + ":" + min + ":" + seg + " " + amPm);
		// FIN EJEMPLO IF.

		// EJEMPLO SWITCH-CASE. Convertir número de mes a su nombre
		System.out.println("Introduce el número del mes: ");
		int mesNum = scan.nextInt();
		switch (mesNum) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("No existe ningún mes para ese número");
		}
		// FIN EJEMPLO SWITCH-CASE.
		
		// INICIO EJEMPLO SWITCH CON TIPO ENUM
		enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
		Dia diaActual = Dia.VIERNES;
		switch (diaActual) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Es un día entre semana.");
			
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Es fin de semana.");
			
			break;

		default:
			System.out.println("Error en el día.");
			break;
		}
		// FIN EJEMPLO SWITCH CON TIPO ENUM
		scan.close();
	}

}
