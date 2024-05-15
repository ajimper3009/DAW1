package ejerciciosClase.unidad7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	static final String FILE_IN = "ficheros/entrada";
	static final String FILE_OUT = "ficheros/salida";
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea una aplicación que copie un fichero binario a otra localización. En lugar de
		//leer y escribir byte a byte, crea un array de bytes con el tamaño del fichero de
		//origen (utiliza el método available()), copia el contenido del fichero a este array
		//y escribe a partir de este array.
		//Recuerda que debes controlar las excepciones que puedan aparecer. En caso
		//de error, mostrar el error
		
		System.out.println("Introduce el nombre del fichero");
		String fileA = scan.nextLine();
		String rutaA = "ficheros/" + fileA;
		System.out.println("Introduce el nombre del segundo fichero");
		String fileB = scan.nextLine();
		String rutaB = "ficheros/" + fileB;
		try {
			FileInputStream fis = new FileInputStream(rutaA);
			FileOutputStream fos = new FileOutputStream(rutaB);
			byte[] byteA = new byte[fis.available()];
			fis.read(byteA);
			fos.write(byteA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
	}

}
