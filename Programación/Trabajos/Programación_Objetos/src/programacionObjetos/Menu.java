package programacionObjetos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saltosDeLinea();
		int opcion = 0;
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1: 
				System.out.println("Has elegido la opcion \"Añdir\"");
				break;
				
			case 2: 
				System.out.println("Has elegido la opcion \"Borrar\"");
				break;
				
			case 3: 
				System.out.println("Has elegido la opcion \"Modificar\"");
				break;
				
			case 4: 
				System.out.println("Has elegido la opcion \"Mostrar por pantalla\"");
				break;
				
			case 5:
				saltosDeLinea(5);
				System.out.println("Has elegido la opcion \"Finalizar\"");
				break;
			
			default:
				saltosDeLinea(10);
				System.out.println("Has introducido un valor erroneo");
			}
			
		} while (opcion != 5);
		
	}

	private static void saltosDeLinea() {
		// TODO Auto-generated method stub
		int saltos = 0;
		String saltoString = "";
		for (int i = 0; i <= saltos; i++) {
			saltoString += "\n";
		}
		System.out.println(saltoString);
		
	}

	private static int mostrarMenu() {
		int opcionSeleccionada = 0;
		System.out.println("1.- Añadir \n2.- Borrar \n3.- Modificar \n4.- Mostrar por pantalla \n5.- Finalizar");
		Scanner scan = new Scanner(System.in);
		opcionSeleccionada = scan.nextInt();
		return opcionSeleccionada;
		// TODO Auto-generated method stub
		
	}

}
