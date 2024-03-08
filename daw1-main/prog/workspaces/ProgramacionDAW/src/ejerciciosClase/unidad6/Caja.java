package ejerciciosClase.unidad6;

public class Caja<T> {
	
	 private T contenido;
	 public void ponerContenido(T contenido) {
	 this.contenido = contenido;
	 }
	 public T obtenerContenido() {
	 return contenido;
	 }

}
