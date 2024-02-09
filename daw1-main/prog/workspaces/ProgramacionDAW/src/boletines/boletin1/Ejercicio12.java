package boletines.boletin1;

/**
 * 12. Escribe un programa que declare 5 variables de tipo char. A continuación,
 * crea otra variable como cadena de caracteres y asígnale como valor la
 * concatenación de las anteriores 5 variables. Por último, muestra la cadena de
 * caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has
 * solucionado?
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';
		char c4 = 'D';
		char c5 = 'E';
		String cadena = "" + c1 + c2 + c3 + c4 + c5;

		System.out.println(cadena);
	}

}
