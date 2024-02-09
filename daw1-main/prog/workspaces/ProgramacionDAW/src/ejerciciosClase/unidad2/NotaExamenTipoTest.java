package ejerciciosClase.unidad2;

import java.util.Scanner;

public class NotaExamenTipoTest {

	public static void main(String[] args) {
//		Realiza un programa que cálcule la nota de un examen de tipo test.
// 		Para calcular la nota final tienes que tener en cuenta que cada error restará
// 		la mitad de un acierto,
// 		y que obviamente las preguntas sin contestar ni restarán ni sumarán.
// 		La nota final se calculará de 0 a 10 con la fórmula indicada.
//
//		Después de realizar el paso anterior haz que el programa muestre la calificación no numérica de dicho examen:
//
//		Si la nota es menor de 5, la calificación será "INSUFICIENTE".
//		Si la nota es mayor o igual a 5 y menor que 7, la calificación será "SUFICIENTE".
//		Si la nota es mayor o igual a 7 y menor que 9, entonces la calificación será "NOTABLE".
//		Si la nota es mayor o igual a 9 y menor o igual a 10, entonces la califación será de "SOBRESALIENTE".
//		Para realizar este ejercicio deberás combinar las estructuras condicionales aprendidas en este apartado.

		// Declaración e inicialización de variables
		// Iniciación de las variables para los datos de entrada del usuario
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de preguntas del examen: ");
		int preg = scan.nextInt();
		System.out.println("Introduce el número de preguntas correctas: ");
		int aciertos = scan.nextInt();
		System.out.println("Introduce el número de preguntas erróneas: ");
		int errores = scan.nextInt();
		scan.close();
		// EXTRA: Controlamos que los datos sean coherentes. Si son correctos se ejecuta
		// el resto del programa, si no, mostramos un mensaje de error.
		if (preg < aciertos + errores) {
			System.out.println("Los datos introducidos no son correctos");
		} else {
			// Inicialización de las variables para los cálculos
			float nota = 0f;
			int notaEntera = 0;
			String calificacion = "";

			/*
			 * Calculo de la nota con decimales.
			 * Nota: "2f" es un literal de número flotante (float), al introducirlo,
			 * el conjunto de las operaciones se realizan con decimales por conversión
			 * automática.
			 */
			nota = ((aciertos - (errores / 2f)) * 10f) / preg;

			/*
			 * Convertimos la nota con decimales a entero.
			 * Para esta conversión, usamos el método round de la clase Math, que devuelve
			 * long
			 * redondeando el valor, al guardarlo a un entero, convertimos dicho long a int.
			 * La conversión se realiza automáticamente. Sería igual que hacer
			 * notaEntera = (int) Math.round(nota);
			 */
			notaEntera = Math.round(nota);

			/*
			 * Calculamos cual sería su calificación no numérica.
			 * Recuerda los valores válidos para la expresión del switch.
			 */

			switch (notaEntera) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				calificacion = "INSUFICIENTE";
				break;
			case 5:
			case 6:
				calificacion = "SUFICIENTE";
				break;
			case 7:
			case 8:
				calificacion = "NOTABLE";
				break;
			case 9:
			case 10:
				calificacion = "SOBRESALIENTE";
				break;
			default:
				System.out.println("Se ha introducido una nota errónea");
				calificacion = "CALIFICACIÓN FUERA DE RANGO";
			}

			/*
			 * Mostramos la calificación obtenida y su equivalente no numérico.
			 */
			System.out.println("La nota obtenida es: " + nota);
			System.out.println("Y la calificación obtenida es: " + calificacion);
		}
	}
}
