package boletines.boletin1;

/**
 * El siguiente código generará un número aleatorio entre 0 y 99: //d contendrá
 * un número aleatorio entre 0 y 100. double d=Math.random()*100; Usando
 * exclusivamente el operador condicional, junto con operadores de relación,
 * lógicos y de asignación, escribe un código en Java que muestre por pantalla
 * si el número aleatorio generado está entre los rangos siguientes: d está
 * entre 0 y 20, 20 no incluido. d está entre 20 y 50, ambos incluidos. d está
 * entre 50 y 75, ninguno incluido. d está entre 75 y 100, ambos incluidos.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// Quitamos los decimales y lo convertimos a entero. Lo podemos hacer de dos
		// formas
		// OPCION A. Usando el casting
		// int num = (int) (Math.random() * 100);

		// OPCION B. Usando Math.round(). Hay que usar el tipo long porque es el tipo
		// que devuelve Math.round. Si queremos pasarlo a int, podríamos hacer un
		// casting. En este caso operamos con long.
		long num = Math.round(Math.random() * 100);
		System.out.println("El número es: " + num);
		String msg = (num >= 0 && num < 20) ? "El número está entre 0 y 20, 20 no incluido"
				: "El número NO está entre 0 y 20, 20 no incluido";
		System.out.println(msg);

		msg = (num >= 20 && num <= 50) ? "El número está entre 20 y 50, ambos incluidos"
				: "El número NO está entre 20 y 50, ambos incluidos";
		System.out.println(msg);
		
		msg = (num > 50 && num < 75) ? "El número está entre 50 y 75, ninguno incluido"
				: "El número NO está entre 50 y 75, ninguno incluido";
		System.out.println(msg);
		
		msg = (num >= 75 && num <= 100) ? "El número está entre 75 y 100, ambos incluidos"
				: "El número NO está entre 75 y 100, ambos incluidos";
		System.out.println(msg);

		// EXTRA: d está entre 0 y 25, ambos incluidos o entre 75 y 100, ambos
		// incluidos.
		msg = ((num >= 0 && num <= 25) || (num >= 75 && num <= 100))
				? "El número está entre 0 y 25, ambos incluidos o entre 75 y 100, ambos incluidos."
				: "El número NO está entre 0 y 25, ambos incluidos o entre 75 y 100, ambos incluidos.";
		System.out.println(msg);

	}

}
