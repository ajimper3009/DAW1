package ejerciciosClase.unidad7.Gesticimal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AlmacenMain {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articulo art1 = new Articulo("6515039", "Articulo", 15, 20, 50);
		Articulo art2 = new Articulo("6515038", "Articulo", 5, 2, 50);
		Articulo art3 = new Articulo("6515037", "Articulo", 65, 80, 50);
		Almacen almacen = new Almacen();
		
		int opcion = 0;
		boolean salir = false;
		while (!salir) {
			System.out.println("Introduce una opción");
			System.out.println("1.- Listado");
			System.out.println("2.- Alta");
			System.out.println("3.- Baja");
			System.out.println("4.- Modificacion");
			System.out.println("5.- Entrada de mercancía por fichero");
			System.out.println("6.- Salir");
			opcion = scan.nextInt();
			
			switch (opcion) {
			case 1:
				//Mostraremos la lista de articulos
				almacen.getListadoArticulos();
				break;
			case 2:
				//Añadir un nuevo producto
				Articulo articulo = art1;
				almacen.altaArticulo(articulo);
				break;
			case 3:
				
				break;
			case 4:
				//Modificar un producto por su codigo
				System.out.println("Introduce el codigo que quieres modificar");
				String codigo = scan.nextLine();
				try {
					almacen.getArticuloPorCodigo(codigo);
				} catch (ArticuloNotFoundExeption e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 5:
				System.out.println("Introduce la ruta del fichero con los articulos");
				String ruta = scan.nextLine();
				try {
					cargarFichero(ruta, almacen);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fichero cargado con exito");
				break;
			case 6:
				System.out.println("Hasta luego!");
				salir = true;
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
			
		}
		
		
	}
	public static void cargarFichero(String ruta, Almacen almacen) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(ruta));
		String line = reader.readLine();
		if(null != reader.readLine()) {
			line = reader.readLine();
		}
		
		while (null != line) {
			Articulo art = new Articulo(line);
			
			line = reader.readLine();
		}
		reader.close();
	}

}
