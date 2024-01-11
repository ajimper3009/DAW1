package desarrolloClases;

public class BombillaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla bomAcme = new Bombilla("ACME", 50d, 3d);
		Bombilla bomAcme2 = new Bombilla("ACME", 50d, 3d);
		bomAcme.encender();
		bomAcme2.encender();
		System.out.println("Marca: " + bomAcme.getMarca());
		System.out.println("Potencia: " + bomAcme.getPotencia());
		System.out.println("Precio: " + bomAcme.getPrecio());
		System.out.println("Está encendida: " + bomAcme.getEncendida());
		System.out.println("to String de bombilla: " + bomAcme.toString());
		System.out.println(bomAcme);
		System.out.println(bomAcme.equals(bomAcme2));
		
		
		
	}

}
