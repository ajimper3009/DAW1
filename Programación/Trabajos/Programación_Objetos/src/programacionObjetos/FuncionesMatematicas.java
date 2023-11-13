package programacionObjetos;

import java.util.Scanner;

public class FuncionesMatematicas {
	
	public static boolean esCapicua(long numero) {
		boolean esCapicua = numero == voltea(numero);
		return esCapicua;
	}

	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
	 * en caso contrario.
	 * 
	 * @param i
	 * @return esPrimo
	 */
	public static boolean esPrimo(long i) {
		boolean esPrimo = true;
		int index = 2;
		while (index < (i / 2 + 1) && esPrimo) {
			if (i % index == 0) {
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
	}

	/**
	 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param inicio
	 * @return
	 */
	public static long siguientePrimo(long inicio) {
		boolean esPrimo = false;
		long incremento = 1l;
		while (!esPrimo) {
			esPrimo = esPrimo(inicio + incremento);
			incremento++;
		}
		return inicio + incremento - 1;
	}

	/**
	 * Dada una base y un exponente devuelve la potencia
	 * 
	 * @param base
	 * @param exp
	 * @return result
	 */
	public static long potencia(int base, int exp) {
		/*
		 * Otra opción, usando la clase Math
		 * Math.pow(base, exp);
		 */

		long result = 1;
		if (exp < 0) {
			for (int i = 0; i > exp; i--) {
				result *= base;
			}
			result = 1 / result;
		} else {
			for (int i = 0; i < exp; i++) {
				result *= base;
			}
		}
		return result;
	}

	/**
	 * Cuenta el número de dígitos de un número entero.
	 * 
	 * @param numero
	 * @return numDigitos
	 */
	public static int digitos(long numero) {
		int numDigitos = 0;
		long aux = numero;
		if (numero < 0) {
			aux = -numero;
		}
		while (aux > 0) {
			aux = aux / 10;
			numDigitos++;
		}
		return numDigitos;
	}

	public static long voltea(long numero) {
		long result = 0l;
		long aux = numero;
		while (aux != 0) {
			result = (result * 10) + (aux % 10);
			aux = aux / 10;
		}
		return result;
	}
	
	public static long digitoN(long numero) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero");
		long numero1 = scan.nextLong();
		long numeroN = numero1 - (numero1 * 2);

		scan.close();
		return numeroN;

	}
	
	
}

