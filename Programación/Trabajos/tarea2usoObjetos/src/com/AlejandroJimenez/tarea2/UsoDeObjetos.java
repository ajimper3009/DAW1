package com.AlejandroJimenez.tarea2;

public class UsoDeObjetos {

	public static void main(String[] args) {
		
		   //Cadena contar vocales
		  String cadena = "Tarea de Programación";
	        int conteo = UtilidadesCadenasTexto.contarVocales(cadena);
	        System.out.println("Número de vocales: " + conteo);
	    
	        //Cadena esPalindromo
	        String cadena1 = "anita lava la tina";
	        boolean esPalindromo = UtilidadesCadenasTexto.esPalindromo(cadena1);
	        
	        if (esPalindromo) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	        
	        //Cadena Invertida  
	        String cadena2 = "Hola, mundo!";
	        String cadenaInvertida = UtilidadesCadenasTexto.invertirCadena(cadena2);
	     
	        System.out.println("Cadena invertida: " + cadenaInvertida);

	        //Cadena sin espapcios
	        
	        String cadena3 = "Ca de na con es pa ci os";
	        String cadenaSinEspacios = UtilidadesCadenasTexto.eliminarEspacios(cadena3);
	       
	        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);
		
	        
	        // Calcular edad
	        String fechaNacimiento = "2002-10-30";
	        int edad = UtilidadesFechas.calcularEdad(fechaNacimiento);
	        
	        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
	        System.out.println("Edad actual: " + edad + " años");
	        
	        
	        // Ver si es una fecha pasada
	        String fechaDada = "2022-01-01";
	        boolean esPasada = UtilidadesFechas.esFechaPasada(fechaDada);
	        
	        System.out.println("Fecha dada: " + fechaDada);
	        if (esPasada) {
	            System.out.println("La fecha ya ha pasado.");
	        } else {
	            System.out.println("La fecha aún no ha pasado.");
	        }
	        
	        // Sumar fechas
	        String fechaDada1 = "2023-11-20";
	        int diasASumar = 5;
	        String nuevaFecha = UtilidadesFechas.sumarDias(fechaDada1, diasASumar);
	        
	        System.out.println("Fecha dada: " + fechaDada1);
	        System.out.println("Días a sumar: " + diasASumar);
	        System.out.println("Nueva fecha: " + nuevaFecha);
	      
	     // Fecha valida
	        String fechaProporcionada = "202366666-02-29"; // Formato: "yyyy-MM-dd"
	        boolean esValida = UtilidadesFechas.esFechaValida(fechaProporcionada);
	        
	        System.out.println("Fecha proporcionada: " + fechaProporcionada);
	        if (esValida) {
	            System.out.println("La fecha es válida.");
	        } else {
	            System.out.println("La fecha no es válida.");
	        }
	        
	        
	}

	

	
	
}
