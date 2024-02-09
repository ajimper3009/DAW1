package examenes.examenRecupTrim1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		final String formatoFecha = "dd/MM/yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(formatoFecha);
		Date fechaDate = new Date();
		System.out.println("Introduce una fecha en formato dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		String fechaSt = scanner.nextLine();
		try {
			fechaDate = formatter.parse(fechaSt);
			System.out.println("Introduce un número de días");
			long numDias = scanner.nextLong();
			long NumDiasMilis = numDias * 24 * 60 * 60 * 1000;
			long anios = numDias / 365;
			long meses = (numDias % 365) / 30;
			long dias = (numDias % 365) % 30;
			Date fechaFinal = new Date(fechaDate.getTime() + NumDiasMilis);
			// TODO: Se puede comprobar los datos para escribir el mensaje en singular o
			// plural. Por simplicidad se resuelve en esta solución con el mensaje el plural
			// para todas las variables
			System.out.printf("Han pasado %d años, %d meses y %d días\n", anios, meses, dias);
			System.out.printf("En ese momento será: %s\n", formatter.format(fechaFinal));
		} catch (ParseException e) {
			System.out.println("Debe introducir una fecha correcta en formato " + formatoFecha);
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un número correcto de días");
		}
		scanner.close();
	}

}
