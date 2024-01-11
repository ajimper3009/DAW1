package boletinArrays;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Solo sé que no se nada";
		String codigo = "abc";

		// Devuelve false. Porque la cadena tiene más caracteres
		String patronEj1 = "Solo";
		System.out.println(
		        "Ejemplo 1: " + cadena + " - Patrón: " + patronEj1 + " Resultado: " + cadena.matches(patronEj1));

		// Devuelve true. Porque la cadena empieza por Solo y tiene más caracteres
		String patronEj2 = "Solo.*";
		System.out.println(
		        "Ejemplo 2: " + cadena + " - Patrón: " + patronEj2 + " Resultado: " + cadena.matches(patronEj2));

		// Devuelve false. Porque la cadena no tiene x, y o z
		String patronEj3 = ".*[xyz].*";
		System.out.println(
		        "Ejemplo 3: " + cadena + " - Patrón: " + patronEj3 + " Resultado: " + cadena.matches(patronEj3));

		// Devuelve true. Porque la cadena tiene q, n y d. Y valdría con que solo
		// estuviese una
		String patronEj4 = ".*[qnd].*";
		System.out.println(
		        "Ejemplo 4: " + cadena + " - Patrón: " + patronEj4 + " Resultado: " + cadena.matches(patronEj4));

		// Devuelve true. Porque la cadena no tiene x, y ni z
		String patronEj5 = ".*[^xyz].*";
		System.out.println(
		        "Ejemplo 5: " + cadena + " - Patrón: " + patronEj5 + " Resultado: " + cadena.matches(patronEj5));

		// Devuelve true. Porque la cadena contiene esos caracteres
		String patronEj6 = "Solo sé q?ue n?o se? na?da";
		System.out.println(
		        "Ejemplo 6: " + cadena + " - Patrón: " + patronEj6 + " Resultado: " + cadena.matches(patronEj6));

		// Devuelve false. Porque la cadena empieza por S
		String patronEj7 = "[a-z].*";
		System.out.println(
		        "Ejemplo 7: " + cadena + " - Patrón: " + patronEj7 + " Resultado: " + cadena.matches(patronEj7));

		// Devuelve true. Porque la cadena empieza por S que está dentro del rango [A-Z]
		String patronEj8 = "[A-Z].*";
		System.out.println(
		        "Ejemplo 8: " + cadena + " - Patrón: " + patronEj8 + " Resultado: " + cadena.matches(patronEj8));

		// Debe validar 3 letras y a continuación 4 números
		String patronEj9 = "[a-z]{3}\\d{4}";
		System.out.println(
		        "Ejemplo 9: " + codigo + " - Patrón: " + patronEj9 + " Resultado: " + codigo.matches(patronEj9));

		// Debe validar 3 letras y a continuación un número que se va incrementando
		String patronEj10 = "[a-z]{3}\\d+";
		System.out.println(
		        "Ejemplo 10: " + codigo + " - Patrón: " + patronEj10 + " Resultado: " + codigo.matches(patronEj10));

		// Debe validar 3 letras (3 may o 3 min) y a continuación un número que se va
		// incrementando
		String patronEj11 = "([a-z]{3}|[A-Z]{3})\\d+";
		System.out.println(
		        "Ejemplo 11: " + codigo + " - Patrón: " + patronEj11 + " Resultado: " + codigo.matches(patronEj11));
		// validación de un número entero
		String entero = "0";
		String patronEj12 = "^(-?|\\+?)\\d+$";
		System.out.println("Ejemplo núm entero: " + entero + " - Patrón: " + patronEj12 + " Resultado: "
		        + entero.matches(patronEj12));
		// validación de una IPv4
		String ipv4 = "192.168.255.0";
		String patronEj13 = "((\\d|[1-9]\\d|((1\\d\\d)|(2[0-4]\\d)|(25[0-5])))\\.){3}(\\d|[1-9]\\d|((1\\d\\d)|(2[0-4]\\d)|(25[0-5])))";
		System.out.println(
		        "Ejemplo ipv4: " + ipv4 + " - Patrón: " + patronEj13 + " Resultado: " + ipv4.matches(patronEj13));

		// validación de una matrícula de españa
		String matricula = "0567FHR";
		String patronEj14 = "^\\d{4}[B-DF-HJ-NPR-TV-Z]{3}$";
		System.out.println(
		        "Ejemplo matricula: " + matricula + " - Patrón: " + patronEj14 + " Resultado: " + matricula.matches(patronEj14));

		// validación de un número hexadecimal sin ceros a la izquierda
		String hexadecimal = "89A7FF";
		String patronEj15 = "^0|([1-9A-F][0-9A-F]*)$";
		System.out.println(
		        "Ejemplo hexadecimal: " + hexadecimal + " - Patrón: " + patronEj15 + " Resultado: " + hexadecimal.matches(patronEj15));

		// validación de un número real con punto para los miles y coma para los decimales
		// no puede haber ceros a la izquierda, ni ceros a la derecha después de la coma.
		String numReal = "+1.009.567,81";
		String patronEj16 = "^$";
		System.out.println(
				"Ejemplo número real: " + numReal + " - Patrón: " + patronEj16 + " Resultado: " + numReal.matches(patronEj16));
		
		// usuario de x empieza por @ y puede tener letras may/min _ y numeros y va de 4 a 15 caracteres
		String twtterUser = "@yo_mismo_1";
		String patronEj17 = "^@\\w{4,15}$";
		System.out.println(
				"Ejemplo número real: " + twtterUser + " - Patrón: " + patronEj17 + " Resultado: " + twtterUser.matches(patronEj17));
	
		String ISBN10 = "0-123-12345-7";
		String ISBN13 = "978 0 123 12345";
		String patronEj18 = "^((978|979)?\\d{10})|((978-|979-)?\\d-\\d{3}-\\d{5}-\\d)|((978 |979 )?\\d \\d{3} \\d{5} \\d)$";
		System.out.println("Ejemplo número real: " + ISBN10 + " - Patrón: " + patronEj18 + " Resultado: " + ISBN10.matches(patronEj18));
		System.out.println("Ejemplo número real: " + ISBN13 + " - Patrón: " + patronEj18 + " Resultado: " + ISBN13.matches(patronEj18));
		
		
			
	}

}
