package com.AlejandroJimenez.tarea2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UtilidadesFechas {

	
	 public static int calcularEdad(String fechaNacimiento) {
	        // Convertir la fecha de nacimiento a un objeto LocalDate
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

	        // Obtener la fecha actual
	        LocalDate fechaActual = LocalDate.now();

	        // Calcular la diferencia en años entre la fecha actual y la fecha de nacimiento
	        Period periodo = Period.between(fechaNac, fechaActual);

	        return periodo.getYears();
	    }
	
	 public static boolean esFechaPasada(String fecha) {
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate fechaDada = LocalDate.parse(fecha, formatter);

     // Obtener la fecha actual
     LocalDate fechaActual = LocalDate.now();

     // Comparar la fecha dada con la fecha actual
     return fechaDada.isBefore(fechaActual);
 }
	 
	 public static String sumarDias(String fecha, int dias) {
	        // Convertir la fecha dada a un objeto LocalDate
	        LocalDate fechaDada = LocalDate.parse(fecha);

	        // Sumar el número de días especificado
	        LocalDate nuevaFecha = fechaDada.plusDays(dias);

	        // Formatear la nueva fecha como una cadena
	        return nuevaFecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	    }
	 
	 public static boolean esFechaValida(String fecha) {
	        try {
	            // Convertir la fecha proporcionada a un objeto LocalDate
	            LocalDate fechaValida = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	            return true;
	        } catch (DateTimeException e) {
	            // Capturar excepciones de fechas no válidas
	            return false;
	        }
	 }
	 
}
