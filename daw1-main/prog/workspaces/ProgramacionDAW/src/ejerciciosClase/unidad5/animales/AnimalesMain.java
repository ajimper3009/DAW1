package ejerciciosClase.unidad5.animales;

import java.util.Date;

public class AnimalesMain {

	public static void main(String[] args) {
		Gato felix = new Gato("Félix");
		matarAnimal(felix);
		amamantarAnimal(felix);
		Perro scottie = new Perro("Scottie");
		matarAnimal(scottie);
		amamantarAnimal(scottie);
		Lagarto juancho = new Lagarto("Juancho");
		matarAnimal(juancho);
		// No se puede porque no extiende/hereda de mamífero //amamantarAnimal(juancho);

	}
	
	private static void matarAnimal(Animal animal) {
		animal.setFechaDef(new Date());
	}
	private static void amamantarAnimal(Mamifero mamifero) {
		mamifero.come("leche");
	}
	

}
