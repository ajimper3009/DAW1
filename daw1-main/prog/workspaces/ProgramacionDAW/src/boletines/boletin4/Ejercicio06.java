package boletines.boletin4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	// 6. Realiza un programa que pida la temperatura media que ha hecho en cada mes
	// de un determinado año y que muestre a continuación un diagrama de barras
	// horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
	// de asteriscos o cualquier otro carácter.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce las temperaturas de todos los meses del año que desees.");
		System.out.println("Introduce el año.");
		Integer anio = scan.nextInt();
		// 1. Declaramos un array con espacio para la media de cada mes del año
		float[] temperaturas = new float[12];
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
		        "Octubre", "Noviembre", "Diciembre" };
		// 2. Un bucle que pida 12 temperaturas medias y las guarde en el array
		for (int i = 0; i < meses.length; i++) {
			boolean correcto = false;
			while (!correcto) {
				try {
					System.out.printf("Introduce el valor de la temperatura media para el mes de %s de %d\n", meses[i],
					        anio);
					temperaturas[i] = scan.nextFloat();
					correcto = true;
				} catch (InputMismatchException e) {
					// no hago nada y vuelve a ejecutar el while
					scan.next();
					System.out.println("El número introducido no es una temperatura correcta");
				}
			}
		}
		scan.close();
		for (int m = 0; m < meses.length; m++) {
			// Accediendo a temperaturas con el indice "m", accederemos a la temperatura
			// media del mes en dicha posición en el array de meses
			for (int t = 0; t < temperaturas[m]; t++) {
				System.out.print("*");
			}
			System.out.println("\t" + meses[m] + "\t" + temperaturas[m]);
		}

	}

}
