package ejerciciosClase.unidad6;

public class CajaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja<Integer> cajaEntero = new Caja<>();
		cajaEntero.ponerContenido(42);
		System.out.println(cajaEntero.obtenerContenido()); // Imprime 42
		
		Caja<String> cajaTexto = new Caja<>();
		cajaTexto.ponerContenido("Hola, mundo");
		System.out.println(cajaTexto.obtenerContenido()); // Imprime Hola, mundo
		
	}
	
	

}
