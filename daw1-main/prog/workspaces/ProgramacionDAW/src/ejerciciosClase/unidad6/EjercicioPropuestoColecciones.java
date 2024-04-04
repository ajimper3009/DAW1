package ejerciciosClase.unidad6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class EjercicioPropuestoColecciones {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Set<String> nombres1 = obtenerNombre();
		Set<String> nombres2 = obtenerNombre();
		Set<String> nombres3 = obtenerNombreComunes(nombres1, nombres2);
		for (String nombre : nombres3) {
			System.out.println(nombre);
		}

	}

	// Una opcion seria resolver analogamente al obtenerNombresComunes pero
	// quedándonos con los elementos diferentes
	public static Set<String> obtenerNombresDiferentes(Set<String> nombres1, Set<String> nombres2) {

		Set<String> result = new HashSet<String>();

		if (nombres1.size() >= nombres2.size()) {
			for (String nombre : nombres2) {
				if (nombres1.contains(nombres2)) {
					result = new HashSet<String>(nombres1);
					result.removeAll(nombres2);
				}
			}
		} else {
			Iterator<String> iter = nombres1.iterator();
			while (iter.hasNext()) {
				String nombre = iter.next();
				if (nombres2.contains(nombre)) {
					result = new HashSet<String>(nombres2);
					result.removeAll(nombres1);
				}
			}
		}

		return result;

	}

	public static Set<String> obtenerNombreComunes(Set<String> nombres1, Set<String> nombres2) {

		Set<String> result = new HashSet<String>();

		if (nombres1.size() >= nombres2.size()) {
			for (String nombre : nombres2) {
				if (nombres1.contains(nombres2)) {
					result.add(nombre);
				}
			}
		} else {
			Iterator<String> iter = nombres1.iterator();
			while (iter.hasNext()) {
				String nombre = iter.next();
				if (nombres2.contains(nombre)) {
					result.add(nombre);
				}
			}
		}

		return result;
	}

	public static Set<String> obtenerNombre() {
		Set<String> nombres = new HashSet<String>();
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
