import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

//		Ejercicio 1
//		Escribe un programa que lea 10 números por teclado y que luego los muestre
//		en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//		y viceversa.
		Scanner scan = new Scanner(System.in);
		// 1. Declaramos un array con espacio para 10 elementos de tipo int
		int[] numeros = new int[10];
		// 2. Un bucle que pida 10 enteros al usuario y lo guardamos en el array en el
		// orden contrario al que se insertan
		System.out.println("Este programa pide 10 enteros y los muestra en orden inverso al que se han introducido");
		for (int i = 9; i >= 0; i--) {
			boolean correcto = false;
			while (!correcto) {
				try {
					System.out.printf("Introduce un entero. Quendan %d números por introducir.\n", i + 1);
					numeros[i] = scan.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					// no hago nada y vuelve a ejecutar el while
					scan.next();
				}
			}
		}
		scan.close();
		// 3. Recorremos el array en orden ascendente y mostramos los elementos
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}