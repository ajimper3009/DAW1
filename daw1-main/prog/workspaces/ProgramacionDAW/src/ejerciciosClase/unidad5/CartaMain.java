package ejerciciosClase.unidad5;

public class CartaMain {

	public static void main(String[] args) {

		// Crear la baraja completa de cartas y guardarlas en un array
		Baraja b = new Baraja("española");
		
		System.out.println(b);
		
		System.out.println("*******************MEZCLANDO**********************");
		b.mezclar();
		
		System.out.println("*******************REPARTIENDO**********************");
		Baraja[] manos = b.repartoMentiroso(5);
		for (Baraja baraja : manos) {
			
			System.out.println("*******************INICIO**********************");
			System.out.println(baraja);
			System.out.println("*******************FIN**********************");
		}
		
		
	}
}
