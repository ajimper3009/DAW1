package boletinArrays;

public class CartaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear la baraja completa de cartas y guardarlas en un array
		Baraja b = new Baraja("española");
		
		for (Carta carta : b.getBaraja()) {
			System.out.println(carta);
		}
		System.out.println("*******************MEZCLANDO**********************");
		MetodoBaraja.mezclarBaraja(b);
		for (Carta carta : b.getBaraja()) {
			System.out.println(carta);
		}
	}
		
	

}
