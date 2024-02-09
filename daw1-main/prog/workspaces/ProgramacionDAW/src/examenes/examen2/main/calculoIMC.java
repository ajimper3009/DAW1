package examenes.examen2.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Introduce tu peso: ");
			float peso = scanner.nextFloat();
			System.out.println("Introduce tu estatura: ");
			float estatura = scanner.nextFloat();
			scanner.close();
			double imc = calcularIMC(peso, estatura);
			System.out.println("Su IMC es: " + imc);
			if (imc < 18.5) {
				System.out.println("Su imc está en el rango de infrapeso");
			} else if (imc >= 18.5 && imc < 25) {
				System.out.println("Su imc está en el rango de ideal");

			} else if (imc >= 25 && imc < 30) {
				System.out.println("Su imc está en el rango de sobrepeso");

			} else if (imc >= 30) {
				System.out.println("Su imc está en el rango de obesidad");

			}
			double pesoMin = calcularPeso(18.5f, estatura);
			double pesoMax = calcularPeso(25f, estatura);
			System.out.printf("Su rango de peso ideal está entre %f y %f kilogramos\n", pesoMin, pesoMax);
		} catch (InputMismatchException e) {
			scanner.next();
			System.out.println("Introduzca una opción válida");
		} catch (ArithmeticException e) {
			System.out.println("Introduzca valores correctos, el peso y la altura deben ser números mayores que 0");
		}

	}

	/**
	 * Método que calcula el IMC a partir del peso y la estatura
	 * 
	 * @param peso
	 * @param estatura
	 * @return imc
	 * @throws ArithmeticException
	 */
	private static double calcularIMC(float peso, float estatura) throws ArithmeticException {
		double imc = peso / Math.pow(estatura, 2);
		return imc;
	}

	private static double calcularPeso(float imc, float estatura) throws ArithmeticException {
		return imc * Math.pow(estatura, 2);
	}

}
