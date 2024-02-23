package ejerciciosClase.unidad6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EstructuraDeDatosIntroduccion {

	public static void main(String[] args) {
		//Estructuras de datos internas
		//Son elementos iterables pertenecientes a colecciones(Collections)
		
		//Listas
		//Similar a Arrays
		List<Integer> listaEnterosVacia = new ArrayList<Integer>();
		List<Integer> listaEnteros = new ArrayList<Integer>();
		List<Integer> listaEnteros1 = new LinkedList<Integer>();
		listaEnteros.add(1);
		listaEnteros.add(100);
		listaEnteros.add(7);
		listaEnteros.add(1);
		listaEnterosVacia.addAll(listaEnteros);
		for (Integer num : listaEnterosVacia) {
			System.out.println(num);
		}
		
		//Conjuntos
		//No hay elementos repetidos
		Set<Integer> conjuntoEntero = new HashSet<Integer>();
		conjuntoEntero.add(1);
		conjuntoEntero.add(100);
		conjuntoEntero.add(7);
		conjuntoEntero.add(1);
		for (Integer num : conjuntoEntero) {
			System.out.println(num);
		}
		
		//Funciones o diccionarios
		
		Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();
		
		public static List<Integer> getNumerosEnteros(int numEnteros) {
			
		}
		
	}

}
