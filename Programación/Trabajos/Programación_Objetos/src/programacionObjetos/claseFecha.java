package programacionObjetos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class claseFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate ahora = LocalDate.now();
		System.out.println("Fecha con LocalDate: " + ahora);
		DateTimeFormatter formatLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha con LocalDate formateada: " + ahora.format(formatLocalDate));
		
		LocalTime horaActual = LocalTime.now();
		System.out.println("Fecha con LocalTime:  " + horaActual);
		DateTimeFormatter formatLocalTime = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println("Fecha con LocalTime formateada: " + horaActual.format(formatLocalTime));
		
		LocalDate ayer = LocalDate.parse("30/10/2023", formatLocalDate);
		System.out.println("Ayer fue: " + ayer.format(formatLocalTime));
		
		
		
		Date hoy = new Date();
		System.out.println("Fecha con Date: " + hoy);
		SimpleDateFormat formatDate = new SimpleDateFormat("'Son las' HH 'horas y' mm 'minutos' dd 'de' MMMM 'de' yyyy");
		System.out.println("Fecha con Date formateada: " + formatDate.format(hoy));
		
		
		
	}

}
