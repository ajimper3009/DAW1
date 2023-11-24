package boletinArrays;

import java.util.Scanner;

public class ajedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.println("Introduce la posición del alfil, con el formato letranumero");
		
		String posicionAlfil = scann.nextLine();
		char letra = posicionAlfil.charAt(0);
		char numero = posicionAlfil.charAt(1);
		for (char fila = '8'; fila >= '1'; fila--){
			for (char columna = 'a'; columna <= 'h'; columna++) {
				if (letra == columna && numero == fila) {
					System.out.println("X\t");
				} else {
					System.out.println(columna + "" + fila + "\t");
				}
			}
			System.out.println("\n");
		}
		
		for (char fila = '8'; fila >= '1'; fila--)
			for (char columna = 'a'; columna <= 'h'; columna++) {
				
			}
		char columna = letra;
		int fila = '1';
		while (fila >= '8' && fila <= '1') {
			while (columna >= 'a' && columna <= 'h') {
				System.out.println("" + columna + fila);
				columna++;
			}
			fila ++;
			
			
			
			
		}
		
	}
		
	
}


