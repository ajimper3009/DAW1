package programacionObjetos;

import java.util.Scanner;

public class programa3Funciones {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		imprimePositivo(0);
		
		
	}

	private static void imprimePositivo(int p) throws Exception {
		if (p <= 0) {
			throw new Exception("Error. El número debe ser positivo");
			
		}
		
	}

}
