package ejerciciosClase.unidad7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File programaComentado = new File (args [0]);
		File programaSinComentarios = new File (args [1]);
		
		try {
			FileReader fr = new FileReader(programaComentado);
			BufferedReader bfr = new BufferedReader (fr);
			String linea = bfr.readLine();
			while (null != linea) {
				System.out.println(linea);
				linea = bfr.readLine();
				if (linea.equals("//")) {
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
