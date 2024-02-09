package ejerciciosClase.unidad3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Fechas {

	public static void main(String[] args) {
		LocalDate ahora = LocalDate.now();
		System.out.println("Fecha con LocalDate: " + ahora);
		DateTimeFormatter formatLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha con LocalDate formateada: " + ahora.format(formatLocalDate));
		
		LocalDate ayer = LocalDate.parse("30/10/2023", formatLocalDate);
		System.out.println("ayer fue: " + ayer.format(formatLocalDate));

		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora con LocalTime: " + horaActual);
		DateTimeFormatter formatLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora con LocalTime formateada: " + horaActual.format(formatLocalTime));

		Date hoy = new Date();
		System.out.println("Fecha con Date: " + hoy);
		SimpleDateFormat formatDate = new SimpleDateFormat("'Son las' HH 'horas y' mm 'minutos del día' dd 'de' MMMM 'de' yyyy");
		SimpleDateFormat formatDateMinutos = new SimpleDateFormat("mm");
		String minutos = formatDateMinutos.format(hoy);
		System.out.println(minutos);
		if ("00".equals(minutos)) {
			
		}
		System.out.println("Fecha con Date formateada: " + formatDate.format(hoy));
		
	}

}
