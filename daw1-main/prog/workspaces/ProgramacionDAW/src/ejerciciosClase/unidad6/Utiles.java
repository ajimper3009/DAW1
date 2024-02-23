package ejerciciosClase.unidad6;

import java.util.List;

public class Utiles {

	//comparar arrays de enteros
	public static <T> T[] devolverMayorArray(T [] a, T [] b ) {
		T [] result = a.length > b.length ? a: b; 
		return result;
	}
	
	//Invertir arrays
	public static <T> T[] invertirArray (T [] a, T [] b ) {
		for (int i = 0; i < a.length; i++) {
			T temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		return a;
	}
	
	public void insertarElementoEnArray(String st, int index, String [] array) {
	
		if (null == array[index]) {
			array[index] = st;
			
		} else {
			boolean hayHueco = false;
			int i = index;
			while (!hayHueco && i < array.length) {
				if (null == array[i]) {
					hayHueco = true;
				}
			}
			if (hayHueco) {
				for (int j = i; j > index; j--) {
					array[j] = array[j - 1];
				}
				array[index] = st;
				
			} else {
				String [] arrayAux = new String [array.length + 1];
				for ( int j = 0; j < arrayAux.length - 1; j++) {
					if (j < index) {
						arrayAux [j] = array [j];
					} else {
						arrayAux [j + 1] = array [j];
					}
					array[index] = st;
				}
				array = arrayAux;
			}
		}
	}
	
	
	public static void insertarElementoEnList(String st, int index, List<String> lista) {
		
		lista.add(index,st);
		
	}
	
	
}
