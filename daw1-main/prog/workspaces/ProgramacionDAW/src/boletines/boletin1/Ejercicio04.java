package boletines.boletin1;

/**
 * 4. Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la división y la
 * multiplicación.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		int x, y;
		x = 144;
		y = 999;
		System.out.println(
				"La variable x vale: " + x + ".\n" + 
				"La variable y vale: " + y + ".\n" + 
				"x + y = " + (x + y) + ".\n" + 
				"x - y = " + (x - y) + ".\n" + 
				"x * y = " + (x * y) + ".\n" + 
				"x / y = " + ((double) x / (double) y));

	}

}
