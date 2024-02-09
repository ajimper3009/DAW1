package boletines.boletin2;

import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
	 * Nacimiento
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el día que naciste: ");
		int dia = scan.nextInt();
		System.out.println("Introduce el mes que naciste en número del 1 al 12: ");
		int mes = scan.nextInt();
		boolean error = true;
		String horoscopo = "";
		scan.close();
		// switch para comprobar si los datos son correctos
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 31) {
				// El dato para dia es correcto
				// Calculo que horóscopo corresponde a ese día
				// dar valor a la variable correcto
				error = false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30) {
				// El dato para dia es correcto
				// Calculo que horóscopo corresponde a ese día
				// dar valor a la variable correcto
				error = false;
			}
			break;
		case 2:
			if (dia >= 1 && dia <= 29) {
				// El dato para dia es correcto
				// Calculo que horóscopo corresponde a ese día
				// dar valor a la variable correcto
				error = false;
			}
			break;
		default:
			System.out.println("El mes introducido no es correcto, debe estar entre 1 y 12.");
		}

		if (!error) {
			// switch para calcular el horóscopo, se ejecuta si los datos son correctos
			switch (mes) {
			case 1:
				if (dia < 21) {
					horoscopo = "Capricornio";
				} else {
					horoscopo = "Acuario";
				}
				break;
			case 2:
				if (dia < 20) {
					horoscopo = "Acuario";
				} else {
					horoscopo = "Piscis";
				}

				break;
			case 3:
				if (dia < 21) {
					horoscopo = "Piscis";
				} else {
					horoscopo = "Aries";
				}

				break;
			case 4:
				if (dia < 21) {
					horoscopo = "Aries";
				} else {
					horoscopo = "Tauro";
				}

				break;
			case 5:
				if (dia < 20) {
					horoscopo = "Tauro";
				} else {
					horoscopo = "Géminis";
				}

				break;
			case 6:
				if (dia < 22) {
					horoscopo = "Géminis";
				} else {
					horoscopo = "Cáncer";
				}

				break;
			case 7:
				if (dia < 22) {
					horoscopo = "Cáncer";
				} else {
					horoscopo = "Leo";
				}

				break;
			case 8:
				if (dia < 24) {
					horoscopo = "Leo";
				} else {
					horoscopo = "Virgo";
				}

				break;
			case 9:
				if (dia < 23) {
					horoscopo = "Virgo";
				} else {
					horoscopo = "Libra";
				}

				break;
			case 10:
				if (dia < 23) {
					horoscopo = "Libra";
				} else {
					horoscopo = "Escorpio";
				}

				break;
			case 11:
				if (dia < 23) {
					horoscopo = "Escorpio";
				} else {
					horoscopo = "Sagitario";
				}

				break;
			case 12:
				if (dia < 21) {
					horoscopo = "Sagitario";
				} else {
					horoscopo = "Capricornio";
				}

				break;
			default:
				break;
			}
			System.out.println("Tu signo del zodiaco es " + horoscopo);
		} else {
			System.out.println("El día introducido para el mes introducido no es correcto.");
		}

	}

}
