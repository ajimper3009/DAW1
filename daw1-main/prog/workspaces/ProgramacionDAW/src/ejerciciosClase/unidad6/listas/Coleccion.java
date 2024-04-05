package ejerciciosClase.unidad6.listas;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

	public List<Producto> lista = new ArrayList<Producto>();

	// Devuelve el tamaño de la lista
	public int tamanio() {

		return lista.size();
	}

	// Añade un elemento tipo Producto en la lista
	public void adicionar(Producto e) {

		lista.add(e);
	}

	// Borra un elemento indicando la posición
	public void eliminar(int pos) {

		lista.remove(pos);

	}

	// Devuelve el elemento de una posición
	public Producto obtener(int pos) {

		return lista.get(pos);

	}

	// Recorre la lista y busca si el código del producto
	// si coincide con cod devuelve el producto
	// y si no está el la lista devuelve null
	public Producto buscar(int cod) {

		for (Producto producto : lista) {
			if (producto.ver_codigo() == cod) {
				return producto;
			}

		}
		return null;

	}

//Más tarde se añadirán los métodos 

	public void mostrar_todo() {

		System.out.println("Contenido de la lista:");
		for (Producto producto : lista) {
			System.out.println(producto.toString());
		}

	}

	public void aumentoPrecio() {
		for (Producto producto : lista) {
			producto.modificar_precio(producto.ver_precio() * 1.1);
		}
	}

}
