package ejerciciosClase.unidad5;
public class BombillaMain {

	public static void main(String[] args) {
		Bombilla bombAcme = new Bombilla("ACME", 50d, 3d);
		Bombilla bombAcme2 = new Bombilla("ACME", 50d, 3d);
		bombAcme.encender();
		bombAcme2.encender();
		System.out.println("Marca: " + bombAcme.getMarca());
		System.out.println("Potencia: " + bombAcme.getPotencia());
		System.out.println("Precio: " + bombAcme.getPrecio());
		System.out.println("Está encendida: " + bombAcme.getEncendida());
		System.out.println("to String de Bombilla: " + bombAcme.toString());
		System.out.println(bombAcme.equals(bombAcme2));
		System.out.println(bombAcme.equals(bombAcme));
		bombAcme.setEncendida(false);
		System.out.println(bombAcme);
	}

}
