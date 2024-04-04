package ejerciciosClase.unidad6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ejercicio7 {

	static Scanner scan = new Scanner(System.in);
	static Map<String, String> paisesCapitales = new HashMap<String, String>();
	public static void main(String[] args) {
		
		
		
		
		final String SALIR = "fin";
		boolean salir = false;
		paisesCapitales.put("España", "Madrid");
		paisesCapitales.put("Portugal", "Lisboa");
		paisesCapitales.put("Francia", "Paris");
		
		do {
			System.out.println("Escribe el nombre de un pais y te dire su capital");
			String pais = scan.nextLine();
			String capital = buscarPais(pais);
			
			if (StringUtils.isEmpty(capital)) {
				//Si no existe la guardamos en este momento
				System.out.println("No conozco la respuesta. ¿Cual es la capital de: " + pais + "?");
				capital = scan.nextLine();
				InsertarPais(pais, capital);
			}else {
				//Si existe, devuelve el par de pais-capital
				System.out.println("La capital de " + pais + "es: " + capital);
			}
		} while (!salir);
			System.out.println("");
			
			
		}
	
	/**
	 * Devuleve la capital del país que s epasa como parametro
	 * Devolverá una cadena vacia si no se encuentra la capital
	 * @param pais
	 * @return
	 */
	
	public static String buscarPais (String pais) {
		
		String capital = "";
		
		if (paisesCapitales.containsKey(capital)) {
			capital = paisesCapitales.get(pais);
		} else {
			for (String itemPais : paisesCapitales.keySet()) {
				if (StringUtils.equalsIgnoreCase(pais, itemPais)) {
					capital = paisesCapitales.get(itemPais);
				}
			}
		}
		
		return capital;
	}
	
	/**
	 * Guarda un nuevo par de pais-capital en el map de paisesCapitales
	 * @param pais
	 * @param capital
	 */
	
	public static void InsertarPais(String pais, String capital) {

		paisesCapitales.put(pais, capital);
		
	}

}
