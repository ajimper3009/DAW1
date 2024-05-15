package ejerciciosClase.unidad7;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {

	static final String FILE_IN = "ficheros/entrada8";
	static final String FILE_OUT = "ficheros/salida8";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void escribirFichero(String entrada8, String salida8) {

		try {
			FileWriter ficheroParaEscribir = new FileWriter(entrada8);
			ficheroParaEscribir.write(salida8);
			ficheroParaEscribir.close();
		} catch (IOException e) {
			System.out.println("Problemas con el fichero E/S" + e);
			;
		}

	}

}
