package programacionObjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio05_Date {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date hoy = new Date();
		Date cumple = new Date();
		boolean fechaCorrecta = false;
		while (!fechaCorrecta) {
			System.out.print("Introduce tu fecha de cumpleaños con formato (dd/MM/yyyy): ");
			String fechaCumpleaniosStr = scan.nextLine();
			try {
				cumple = obtenerFechaProxCumpleanios(fechaCumpleaniosStr);
				fechaCorrecta = true;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		scan.close();
		// Se calcula la diferencia entre el cumpleaños y hoy
		long diferencia = cumple.getTime() - hoy.getTime();
		long meses = diferencia / (1000 * 60 * 60 * 24 * 30);
		long semanas = (diferencia - meses * (1000 * 60 * 60 * 24 * 30)) / (1000 * 60 * 60 * 24 * 7);
		long dias = (diferencia - meses * (1000 * 60 * 60 * 24 * 30) - semanas * (1000 * 60 * 60 * 24 * 7))
		        / (1000 * 60 * 60 * 24);

		System.out.printf("Faltan %d meses, %d semanas y %d días para tu cumpleaños", meses, semanas, dias);
	}

	public static Date obtenerFechaProxCumpleanios(String fechaStr) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaProxCumpleanios = null;
		Date hoy = new Date();
		try {
			fechaProxCumpleanios = dateFormat.parse(fechaStr);
		} catch (ParseException e) {
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(hoy);
		// Para obtener el año de una fecha se opera así
		int anioHoy = cal.get(Calendar.YEAR);
		System.out.println("año hoy:" + anioHoy);
		return fechaProxCumpleanios;

	}

}