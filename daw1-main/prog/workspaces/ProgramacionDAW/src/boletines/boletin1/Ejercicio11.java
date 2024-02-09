package boletines.boletin1;

/**
 * 11. Escribe un programa que declare variables de tipo char y de tipo String.
 * Intenta mostrarlas por pantalla todas juntas en la misma línea y con una sola
 * sentencia de Java (con un solo println) ¿es posible? ¿por qué?
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		char a = 65;
		System.out.println("a: " + a);
		char y = 'y';
		String hola = "hola";
		String adios = "adios";
		System.out.println("" + a + y + hola + adios);
		System.out.println(hola + adios + a + y);
		
	}

}
