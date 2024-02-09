package ejerciciosClase.unidad2;

import java.util.Scanner;

public class MultiplosDe7 {

	public static void main(String[] args) {
		// Mostrar por pantalla los múltiplos de 7
		// que existen entre 2 números dados
		// Comprueba los datos introducidos
		Scanner scan = new Scanner(System.in);
		System.out.println("Se mostrarán los múltiplos de 7 que existen entre 2 números dados.");
		System.out.println("Introduce el límite inferior");
		int limInf = scan.nextInt();
		System.out.println("Introduce el límite superior");
		int limSup = scan.nextInt();
		String result = "Los múltiplos de 7 entre " + limInf + " y " + limSup + " son:";
		boolean existen = false;
		scan.close();
		// Adaptar la lógica para mostrar un mensaje si no existen múltiplos de 7
		// en el rango
		if (limInf < 0 || limSup < 0 || limInf > limSup) {
			System.out.println(
			        "Los datos introducidos son erróneos. Los números deben ser enteros positivos y el límite inferior debe ser menor que el límite superior.");
		} else {
			for (int cont = limInf; cont <= limSup; cont++) {
				if (cont % 7 == 0) {
					result += "\n" + cont;
					existen = true;
				}
			}
			if (!existen) {
				result = "No existe ningún múltiplo de 7 entre " + limInf + " y " + limSup;
			}
			System.out.println(result);
		}

	}

}
