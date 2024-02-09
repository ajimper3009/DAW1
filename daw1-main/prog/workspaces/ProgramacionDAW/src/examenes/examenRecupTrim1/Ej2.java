package examenes.examenRecupTrim1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		System.out.println("Introduce el dígito a buscar");
		int digito = scan.nextInt();
		scan.close();

		int aux = numero;
		int repeticiones = 0;
		while (aux > 0) {
			if (aux % 10 == digito) {
				repeticiones++;
			}
			aux = aux / 10;
		}

		// Calcular número en letras
		String numLetras = "";
		boolean plural = repeticiones == 1 ? false : true;
		switch (digito) {
		case 0:
			numLetras = plural ? "ceros" : "cero";
			break;
		case 1:
			numLetras = plural ? "unos" : "uno";
			break;
		case 2:
			numLetras = plural ? "doses" : "dos";
			break;
		case 3:
			numLetras = plural ? "treses" : "tres";
			break;
		case 4:
			numLetras = plural ? "cuatros" : "cuatro";
			break;
		case 5:
			numLetras = plural ? "cincos" : "cinco";
			break;
		case 6:
			numLetras = plural ? "seises" : "seis";
			break;
		case 7:
			numLetras = plural ? "sietes" : "siete";
			break;
		case 8:
			numLetras = plural ? "ochos" : "ocho";
			break;
		case 9:
			numLetras = plural ? "nueves" : "nueve";
			break;
		default:
			System.out.println("Se debe introducir un número de una sola cifra");
			break;
		}
		// Mostrar el resultado
		System.out.printf("Hay %d %s en el número %d", repeticiones, numLetras, numero);
	}
}
