package com.AlejandroJimenez.tarea2;

public class UtilidadesCadenasTexto {

	
	 public static int contarVocales(String cadena) {
	        int conteo = 0;

	        // Convertir la cadena a minúsculas para simplificar la comparación
	        cadena = cadena.toLowerCase();

	        // Iterar sobre cada carácter de la cadena
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);

	            // Verificar si el carácter es una vocal
	            if (esVocal(c)) {
	                conteo++;
	            }
	        }

	        return conteo;
	    }

	    private static boolean esVocal(char c) {
	        // Verificar si el carácter es una vocal, incluyendo las vocales acentuadas en español
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	               c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú';
	    }
	
	    public static boolean esPalindromo(String cadena) {
	        // Eliminar espacios y convertir a minúsculas para simplificar la comparación
	        cadena = cadena.replaceAll("\\s", "").toLowerCase();

	        // Obtener la longitud de la cadena
	        int longitud = cadena.length();

	        // Verificar si la cadena es un palíndromo
	        for (int i = 0; i < longitud / 2; i++) {
	            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
	                return false;
	            }
	        }

	        return true;
	    }  
	    
	    
	    public static String invertirCadena(String cadena) {
	        // Convertir la cadena a un arreglo de caracteres
	        char[] caracteres = cadena.toCharArray();

	        // Invertir el orden de los caracteres en el arreglo
	        for (int i = 0; i < caracteres.length / 2; i++) {
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[caracteres.length - 1 - i];
	            caracteres[caracteres.length - 1 - i] = temp;
	        }

	        // Crear una nueva cadena a partir del arreglo invertido
	        return new String(caracteres);
	    }
	   
	    
	    public static String eliminarEspacios(String cadena) {
	        // Utilizar el método replaceAll para eliminar todos los espacios en blanco
	        return cadena.replaceAll("\\s", "");
	    }
	    
	    
}
