package ejerciciosClase.unidad5.interfaces;

public class CalculadoraMain {

	public static void main(String[] args) throws Exception {
		Calculadora calc = new CalculadoraImpl();
		System.out.println(calc.suma(9, 10));

	}

}
