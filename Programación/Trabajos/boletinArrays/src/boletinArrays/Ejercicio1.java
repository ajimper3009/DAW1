package boletinArrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Creamos una array bidimensional
		
		int[][] num = new int [3][6];
		
		num [0][0] = 0;
		num [0][1] = 30;
		num [0][2] = 2;
		num [0][5] = 2;
		num [1][0] = 2;
		num [1][4] = 2;
		num [2][2] = 2;
		num [2][3] = 2;
		num [2][5] = 2;
		
		for (int fila = 0; fila <=2; fila++) {
			for (int columna = 0; columna <=5; columna++) {
				if (null != num [fila] [columna]) {
					System.out.println(num [fila] [columna] + " \t");
			 
				}else {
					System.out.println("\n");
			 }
			
			
		 	
		 
		 }
		
		}
		
	}

}
