package ejerciciosClase.unidad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

	static final String FILE_IN = "ficheros/entrada";
	static final String FILE_OUT = "ficheros/salida";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		File ficheroEntrada = new File(FILE_IN);
		FileReader fr = new FileReader(ficheroEntrada);
			
			int valor = fr.read();
			String line = "";
			while (valor != 1) {
				if (valor != 10 && valor != 13 && valor != -1) {
					line += (char)valor;
				} else {
					if (!"".equals(line)) {
						System.out.println(line);
						line = "";
					}
					
				}
				valor = fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("w");
			e.printStackTrace();
			
		}
		
		
	}

}
