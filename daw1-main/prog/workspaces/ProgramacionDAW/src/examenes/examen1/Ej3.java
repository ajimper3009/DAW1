package examenes.examen1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		boolean salir = false;
		Scanner scan = new Scanner(System.in);
		final double tramo1 = 0.2;
		final double tramo2 = 0.1;
		final double tramo3 = 0.05;
		final double tramo4 = 0.01;
		do {
			double nuevoSueldo = 0d;
			System.out.println("Introduce el sueldo a actualizar: ");
			double sueldoActual = scan.nextDouble();
			double incremento = 0d;
			if (sueldoActual <= 0) {
				System.out.println("ERROR! El sueldo debe ser mayor a 0.");
			} else if (sueldoActual <= 9000) {
				incremento = sueldoActual * tramo1;
				nuevoSueldo = sueldoActual + incremento;
			} else if (sueldoActual <= 15000) {
				incremento = sueldoActual * tramo2;
				nuevoSueldo = sueldoActual + incremento;
			} else if (sueldoActual <= 20000) {
				incremento = sueldoActual * tramo3;
				nuevoSueldo = sueldoActual + incremento;
			} else {
				incremento = sueldoActual * tramo4;
				nuevoSueldo = sueldoActual + incremento;
			}
			if (sueldoActual > 0) {
				System.out.println("Sueldo actual: " + sueldoActual + "\r\n" + "Incremento: " + incremento + "\r\n"
				        + "Nuevo sueldo = " + nuevoSueldo+ "\r\n" + "¿Desea continuar S/N?\r\n" + "");
				//EXTRA +0.25
				if (!"s".equalsIgnoreCase(scan.next())) {
					salir = true;
				}
			}
		} while (!salir);
		scan.close();
		System.out.println("Hasta luego!");
	}

}
