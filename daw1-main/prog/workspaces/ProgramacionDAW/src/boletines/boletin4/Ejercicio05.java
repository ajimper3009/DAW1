package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio05 {
	// 5. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que
	// los muestre por pantalla separados por espacios. El programa pedirá entonces
	// por teclado dos valores y a continuación cambiará todas las ocurrencias del
	// primer valor por el segundo en la lista generada anteriormente. Los números
	// que se han cambiado deben aparecer entrecomillados.
	public static void main(String[] args) {
		long[] arrayAleatorios = FuncionesMatematicas.getNumerosAleatorios(100, 0l, 20l);
		for (long i : arrayAleatorios) {
			System.out.print(i + " ");
		}
		System.out.println("Introduce primero el valor a sustituir y luego el nuevo valor para reemplazarlo");
		int[] valoresCambio = FuncionesMatematicas.getNumerosEnteros(2);

		// Opción A: Modificando los números en el array, Sería lo mismo guardando los
		// números en un nuevo array
		int[] indicesCambiados = new int[100];
		int numCambiados = 0;
		for (int index = 0; index < arrayAleatorios.length; index++) {
			if (arrayAleatorios[index] == valoresCambio[0]) {
				arrayAleatorios[index] = valoresCambio[1];
				indicesCambiados[index] = 1;
				numCambiados++;
			}
		}
		for (int i = 0; i < arrayAleatorios.length; i++) {
			if (indicesCambiados[i] == 1) {
				System.out.print("\"" + arrayAleatorios[i] + "\" ");
			} else {
				System.out.print(arrayAleatorios[i] + " ");
			}
		}

		// Opción B: Modificando la lista mostrada
//		for (int i = 0; i < arrayAleatorios.length; i++) {
//			if (arrayAleatorios[i] == valoresCambio[0]) {
//				System.out.print("\"" + valoresCambio[1] + "\" ");
//			} else {
//				System.out.print(arrayAleatorios[i] + " ");
//			}
//		}
//		
		if (numCambiados == 0) {
			System.out.println("No se ha cambiado ningún número");
		} else if (numCambiados == 1) {
			System.out.println("Solo se ha cambiado un número");
		} else {
			System.out.println("Se han cambiado " + numCambiados + " números");
		}

	}

}
