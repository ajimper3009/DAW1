package examenes.examen1;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

public class EjercicioPropuestoColecciones {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (String nombre : obtenerNombreOrdenados()) {
			System.out.println(nombre);
		}
		
		
	}
	
	public static Set<String> obtenerNombreOrdenados	() {
		Set<String> nombres = new TreeSet<String>();
		final String FIN = "fin";
		boolean fin = false;
		while (!fin) {
			String nombre = scan.nextLine();
			if (!StringUtils.equals(FIN, nombre)) {
				nombres.add(nombre);
			} else {
				fin = true;
			}
			
		}
		return nombres;
	}

}

