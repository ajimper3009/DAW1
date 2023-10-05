/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class examen_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce el número de preguntas ");
		int preg = scan.nextInt();
		System.out.println("Introduce el número de aciertos ");
		int aciertos = scan.nextInt();
		System.out.println("Introduce el número de errores ");
		int errores = scan.nextInt();
		
		float nota = ((aciertos - (errores / 2f)) * 10f) / preg;
		System.out.println("Tu nota final es: " + nota);
	
		switch (Math.round(nota)) {
		
		case 0:
		case 1:	
		case 2:
		case 3:
		case 4:
			System.out.println("Tu nota es insuficiente");
			break;
		case 5:
		case 6:
			System.out.println("Tu nota es suficiente");
			break;
		case 7:
		case 8:
			System.out.println("Tu nota es notable");
			break;
		case 9:
		case 10:
			System.out.println("Tu nota es sobresaliente");
			break;
		default:
			System.out.println("Se a introducido una nota errónea");
		}
		scan.close();
		
		

	}

}
