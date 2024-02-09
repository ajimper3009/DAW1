package boletines.boletin1;

/**
 * 6. Dada la variable cadena tipo String, haz que vaya mostrando por pantalla
 * la secuencia siguiente: 
 * La casa de 
 * La casa de Juan es 
 * La casa de Juan es el número 
 * La casa de Juan es el número 25
 * 
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		/* 
		 * Solución A. Utilizando el operador combinado +=
		String msg = "La casa de";
		System.out.println(msg);
		msg += " Juan es";
		System.out.println(msg);
		msg += " el número";
		System.out.println(msg);
		msg += " " + 25;
		System.out.println(msg);
		*/
		
		// Solución B. Utilizando el método substring de String
		String msg = "La casa de Juan es el número 25";
		System.out.println(msg.substring(0, 10));
		System.out.println(msg.substring(0, 18));
		System.out.println(msg.substring(0, 28));
		System.out.println(msg);
		
	}

}
