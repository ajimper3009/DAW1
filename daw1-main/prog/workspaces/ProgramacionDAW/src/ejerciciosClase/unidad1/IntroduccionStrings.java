package ejerciciosClase.unidad1;

/**
 * Clase para conocer algunas operaciones con cadenas de texto
 */
public class IntroduccionStrings {

	public static void main(String[] args) {
		String s1 = "Me gusta programar";
		String s2 = "Nuestro código compila perfectamente";
		String puntoEspacio = ". ";
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		// Concatenamos las dos cadenas de dos formas distintas
		String a = s1 + ". " + s2;
		String b = s1.concat(puntoEspacio.concat(s2));
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// Comparamos si las cadenas a y b son iguales
		System.out.println((a == b) ? "Las cadenas a y b son iguales" : "Las cadenas a y b NO son iguales");
		System.out.println((a.equalsIgnoreCase(b)) ? "(Con equals)Las cadenas a y b son iguales"
		        : "(Con equals)Las cadenas a y b NO son iguales");

		// Devolvemos el caracter en una posición concreta
		char primeroS1 = s1.charAt(0);
		System.out.println("El primer carácter de s1 es: " + primeroS1);

		char primeroS2 = s2.charAt(0);
		System.out.println("El primer carácter de s2 es: " + primeroS2);

		// Calcular longitud y devolver último carácter
		int longitudS1 = s1.length();
		System.out.println("La cadena s1 tiene una longitud de " + longitudS1 + " caracteres.");

		char ultimoS1 = s1.charAt(longitudS1 - 1);
		System.out.println("El último carácter de s1 es: " + ultimoS1);

		char ultimoS2 = s2.charAt(s2.length() - 1);
		System.out.println("El último carácter de s2 es: " + ultimoS2);

		// Cambio de mayúsculas y minúsculas
		System.out.println("La cadena s1 en mayúsculas es: " + s1.toUpperCase());
		System.out.println("La cadena s2 con todo en minúsculas es: " + s2.toLowerCase());

		// cambiar las a de s1 por A
		System.out.println("s1 cambiando a por A: " + s1.replace('a', 'A'));

		// Limpiar la cadena de espacios al principio y final
		String cadenaConEspacios = "     Hola tengo espacios al inicio y al final           ";
		System.out.println(cadenaConEspacios);
		System.out.println(cadenaConEspacios.trim());

		// EXTRA: Concatenar las cadenas s1 y s2 separadas por un punto ". ". Luego
		// sustituir las s por $ y las e por €. Devolver el resultado en la misma cadena
		// b.
		System.out.println("Esta es la cadena antes de los cambios: " + b);
		b = b.replace('s', '$');
		b = b.replace('S', '$');
		b = b.replace('e', '€');
		b = b.replace('E', '€');
		System.out.println("Esta es la cadena después de los cambios: " + b);

	}

}
