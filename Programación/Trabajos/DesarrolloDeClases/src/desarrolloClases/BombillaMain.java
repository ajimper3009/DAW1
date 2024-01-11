package desarrolloClases;

public class BombillaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla bomAcme = new Bombilla("ACME", 50d, 3d);
		System.out.println("Marca: " + bomAcme.getMarca());
		System.out.println("Potencia: " + bomAcme.getPotencia());
		System.out.println("Precio: " + bomAcme.getPrecio());
		
		
	}

}
