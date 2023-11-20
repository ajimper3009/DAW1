import java.util.Iterator;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = UtilidadesUnidad4.obtieneEnteros(15);
		
		
	}
	private static void rotaDcha(int[] array) {
		int aux;
		for (int index = 0; index < array.length; index++) {
			aux = array[index + 1];
			array[index + 1] = array[index]; 
		}
	}
}
