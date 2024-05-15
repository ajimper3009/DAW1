package ejerciciosClase.unidad7;

import java.io.File;
import java.io.IOException;

public class OpcionesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("ficheros/entrada.txt");
			String path = file.getAbsolutePath();
			System.out.println("Ruta: " + path);
			String canonicalPath = file.getCanonicalPath();
			System.out.println("Ruta canonica: " + canonicalPath);
			String name = file.getName();
			System.out.println("Nombre: " + name);
			String parent =file.getParent();
			System.out.println("" + parent);
			file.getTotalSpace();
			file.getFreeSpace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
