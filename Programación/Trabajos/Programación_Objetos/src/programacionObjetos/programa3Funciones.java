package programacionObjetos;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class programa3Funciones {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
		try {
		
		System.out.println("Introduce un número negativo");
		imprimeNegativo(scan.nextInt());
		} catch (ImputMismatchExeption e)
			// TODO: handle exception
		}
		System.out.println("Contenido de Scan despues de poner un entero" + scan.nextInt());
		System.out.println("Introduce un número positivo");
		imprimePositivo(scan.nextInt());
		
		}
	}

	private static void imprimeNegativo(int n) throws Exception {
		if (n <= 0) {
			throw new Exception("Error. El número debe ser negativo");
		
	}

	private static void imprimePositivo(int p) throws Exception {
		if (p <= 0) {
			throw new Exception("Error. El número debe ser positivo");
			
		}
		
	}

}
