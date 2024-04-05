package ejerciciosClase.unidad6.listas;

import java.util.Scanner;

public class Probar_lista {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = false;
		Coleccion coleccion = new Coleccion();
		do {
			System.out.println("Introduce un código");
			int codigo = scan.nextInt();
			if (codigo == 0) {
				salir = true;
			} else {
				System.out.println("Introduce un nombre");
				String nombre = scan.next();
				System.out.println("Introduce un tipo");
				String tipo = scan.next();
				System.out.println("Introduce un precio");
				double precio = scan.nextDouble();
				System.out.println("Introduce el stock");
				int existencias = scan.nextInt();
				Producto producto = new Producto(codigo, nombre, tipo, precio, existencias);
				coleccion.adicionar(producto);
			}

		} while (!salir);
		coleccion.mostrar_todo();
		coleccion.aumentoPrecio();
		coleccion.mostrar_todo();
		
	}

}
