package examen;


public class Ejercicio1 {

	static int [] numeros = new int [15];
	static int [][] carton = new int [3][9];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		while (contador < 15) {
			int numero = (int) (Math.random()*90 + 1); 
			if (!repetido(numero)) {
				numeros[contador++] = numero;
			}
		}
		//int [] colocados = new int [15];
		int fila1 = 0;
		int fila2 = 0;
		int fila3 = 0;
		for (int num : numeros) {
			int columna = num / 10;
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if (carton[i][columna] == 0) {
						carton[i][columna] = num;
							
					}	
				}
			}
		}
		for (int i : numeros) {
			System.out.println(i + ",");
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(carton[i][j] + "\t");
				
			}
		}
		
		
		
	}
	
	private static boolean tresDecans(int numero) {
		boolean triplicado = false;
		int index = 0;
		int repeticiones = 0;
		int decena = numero/10 % 10;
		while (repeticiones < 3 && index < numeros.length) {
			if (numeros[index]/10 == decena) {
				repeticiones++;
			}
			if (repeticiones > 3) {
				triplicado = true;
			}
		}
		index++;
		return false;
	}
	

	private static boolean repetido(int numero) {
		// TODO Auto-generated method stub
		boolean encontrado = false;
		int index = 0;
		while (!encontrado && index < numeros.length) {
			if (numeros[index]++ == numero) {
				encontrado = true;
			}
		}
		return false;
	}

}
