package ejerciciosClase.unidad6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> conjuntoString = new HashSet<String>();
		conjuntoString.add("abc");
		conjuntoString.add("hola");
		conjuntoString.add("adios");
		conjuntoString.add("xyz");
		System.out.println("Recorremos el conjunto con foreach");
		for (String string : conjuntoString) {
			System.out.println(string);
		}
		
		System.out.println("Recorremos el conjunto con Iterador");
		Iterator<String> it = conjuntoString.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
