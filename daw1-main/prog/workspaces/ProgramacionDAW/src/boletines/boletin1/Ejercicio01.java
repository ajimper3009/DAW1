/**
 * 
 */
package boletines.boletin1;

/**
 * Dada la variable d1 tipo double inicializada a 10 y la variable d2 también
 * tipo double inicializada a 20, realiza las siguientes operaciones aritméticas
 * y muestra el resultado por pantalla En este ejercicio es importante que
 * intentes minimizar el uso de paréntesis, usándolos solo cuando sean
 * necesarios.
 * 
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d1 = 10;
		double d2 = 20;
		// 1.
		/*
		 * Usamos una variable por cada respuesta para no sobrescribir el valor del
		 * resultado de cada apartado
		 */
		double resul1 = -4 + d1 * 2;
		System.out.println("1. Restamos 4 al doble de d1: " + resul1);
		// 2.
		double resul2 = (-4 + d1) * 2;
		System.out.println("2. Restamos 4 a d1 y calculamos el doble: " + resul2);
		// 3.
		double resul3 = (2 + d1) / 12 + d2;
		System.out.println("3. Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2: " + resul3);
		// 4.
		double resul4 = d2 / d1 / 2;
		/*
		 * Aplicando la precedencia de operadores es correcto, pero nunca está de más
		 * utilizar paréntesis para dejar el código más claro y evitar errores (d2 / d1)
		 * / 2
		 */
		System.out.println("4. Dividimos d2 entre d1, y todo ello dividido entre 2: " + resul4);

		// 5.
		double resul5 = d2 / (d1 / 2);
		System.out.println("5. Dividimos d2 entre la mitad de d1: " + resul5);

		// 6.
		double resul6 = d2 - d1 / 4;
		System.out.println("6. Restamos a d2 un cuarto de d1: " + resul6);

		// 7.
		double resul7 = (d2 - d1) / 4;
		System.out.println("7. Restamos d1 a d2, y todo ello lo dividimos entre 4: " + resul7);

		// 8.
		double resul8 = d2 / d1 * 2;
		// Ídem con el uso de paréntesis (d2 / d1) *2
		System.out.println("8. Dividimos d2 entre d1, y todo ello lo multiplicamos por 2: " + resul8);

		// 9.
		double resul9 = d2 / (d1 * 2);
		System.out.println("9. Dividimos d2 entre el doble de d1: " + resul9);

		// 10.
		double resul10 = d2 * 2 - d1 / 4;
		System.out.println("10. Restamos al doble de d2 un cuarto de d1: " + resul10);

		// 11. Multiplicamos d2 por 100 menos d1.
		double resul11 = d2 * (100 - d1);
		System.out.println("11. Multiplicamos d2 por 100 menos d1: " + resul11);

		// 12.
		double resul12 = d2 * (50 + d1) / 10;
		System.out.println("12. Multiplicamos d2 por 50 mas d1, y todo ello lo dividimos por 10: " + resul12);

	}

}
