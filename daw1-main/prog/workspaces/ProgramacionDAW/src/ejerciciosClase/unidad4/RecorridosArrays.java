package ejerciciosClase.unidad4;

public class RecorridosArrays {

	public static void main(String[] args) throws Exception {
		
		//int [][] arrayNum = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//Crear una array de 4x4 con numeros aleatorios del 1 al 99
		int [][] arrayNum = new int [4][4];
		final int filas = 4;
		final int columnas = 4;
		final int limiteInf = 120;
		final int limiteSup = 999;
		
		
	
		
		//Tenemos que multiplicar el random por el limite superior +1 - limite inferior 
		//y despues, sumar el limite inferior y hacer casting a entero  
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int aleatorio2 = (int) (Math.random()* (limiteSup + 1 - limiteInf) + limiteInf);
				arrayNum[i][j] = aleatorio2;
			}
		} 
		
		mostrarArray(arrayNum);
		mostrarArrayPorFilasColumna(arrayNum);
		mostrarArrayPorFilasColumna2(arrayNum);
		mostrarArrayPorFilasColumnas3(arrayNum);
		leerArrayAlReves(arrayNum);
		mostrarArrayPorFilasColumnas4(arrayNum);
		mostrarElBordeDelArray(arrayNum);
		
		
	}
	
	private static void mostrarArray(int [][] arrayNum) {
		int filas = arrayNum.length;
		int columnas = arrayNum[0].length;
		for (int i = 0; i < filas; i++) {
			System.out.println("\n");
			for (int j = 0; j < columnas; j++) {
				System.out.println(arrayNum[i] [j] + "\t");
				
			}
		}
	}
	
	private static void mostrarArrayPorFilasColumna(int [] [] arrayNum) {
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(arrayNum[i] [i] + "\t");
		}
	}
	
	private static void mostrarArrayPorFilasColumna2(int [] [] arrayNum) {
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(arrayNum[i][arrayNum.length - 1 - i] + "\t");
		}
	}
	
	private static void mostrarArrayPorFilasColumnas3(int [] [] arrayNum) {
		int filas = arrayNum.length;
		int columnas = arrayNum[0].length;
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				System.out.println(arrayNum[j][i] + "\t");
			}
		}
		
	}
	
	private static void leerArrayAlReves(int [] [] arrayNum) {
		int filas = arrayNum.length;
		int columnas = arrayNum[0].length;
		for (int i = filas - 1; i >= 0; i--) {
			for (int j = columnas - 1; j >= 0; j--) {
				System.out.println(arrayNum[i] [j] + "\t");
			}
		}
		
	}
	
	private static void mostrarArrayPorFilasColumnas4(int [] [] arrayNum) {
		int filas = arrayNum.length;
		int columnas = arrayNum[0].length;
		for (int i = filas - 1; i >= 0; i--) {
			for (int j = columnas - 1; j >= 0; j--) {
				System.out.println(arrayNum[j][i] + "\t");
			}
		}
		
	}
	
	private static void mostrarElBordeDelArray (int [] [] arrayNum) {
		int filas = arrayNum.length;
		int columnas = arrayNum[0].length;
		for (int i = 0; i < filas; i++) {
			for (int j = columnas; j >= 0; j--) {
				System.out.println(arrayNum[j][i] + "\t");
			}
		}
	}
	
}
