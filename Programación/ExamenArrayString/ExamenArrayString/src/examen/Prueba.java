package examen;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean opcion = false;
		do {
			Scanner scan = new Scanner(System.in);
			String nombreApellido = " ";
			String DNI = " ";
			int usuarios = 5;
			System.out.println("Introduzca los nombres de usuario");
			for (int i = 0; i < usuarios; i++) {
				System.out.println("Introduce el Nombre y apellido: ");
				nombreApellido = scan.nextLine();
				System.out.println("Introduce el DNI: ");
				DNI = scan.nextLine();
				System.out.println("Usuario" + " " + (i + 1) + "\n"
						+ "Nombre: " + nombreApellido + "\n"
						+ "DNI: " + DNI);
				opcion = true;

			}
			
			scan.close();
			
		} while (!opcion);
		
	}

}
