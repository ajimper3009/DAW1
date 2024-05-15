package ejerciciosClase.unidad7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import ejerciciosClase.unidad3.NumeroPrimo;

public class Ejercicio6 {

	static final String FILE_IN = "ficheros/primos.dat";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ficherosPrimo = new File(FILE_IN);
		try {
			System.out.println("Introduce el que quieres escribir");
			int num = scan.nextInt();
			BufferedReader br = new BufferedReader(new FileReader(ficherosPrimo));
			int cont = 0;
			int i = 0;
			while (i < num) {
				System.out.println(br.readLine());
				i++;
				cont++;

			}
			if (cont < num) {
				System.out.println("Se han imprimido: " + cont + "números");
				System.out.println("Se han Solicitado: " + num + "números");
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
