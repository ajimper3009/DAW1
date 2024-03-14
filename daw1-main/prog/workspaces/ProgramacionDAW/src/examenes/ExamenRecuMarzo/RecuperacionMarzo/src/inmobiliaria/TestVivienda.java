package inmobiliaria;

public class TestVivienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creacion de propietario");
		Propietario Juan = new Propietario("Alejandro Jiménez\n", "12345678H");
		System.out.println("Datos del propietario:\n" + Juan.devolverInfoString());
		System.out.println("---------------------------------\n");
		
		System.out.println("Creacion de casa1");
		Casa casa1 = new Casa("Calle Maria", 40, null, false, false);
		System.out.println("Datos de la casa1:\n" + casa1.devolverInfoString());
		System.out.println("---------------------------------\n");
		
		System.out.println("Creacion de apartamento1");
		Apartamento apartamento1 = new Apartamento("Calle Gorroba", 28, null, 4, 'C');
		System.out.println("Datos del apartamento 1:\n" + apartamento1.devolverInfoString());
		System.out.println("---------------------------------\n");
		
		System.out.println("Calcular la cuota de casa1 sin jardin ni piscina");
		System.out.println("Cueta de casa1: " + casa1.calcularCuota());
		System.out.println("---------------------------------\n");
		
		System.out.println("Calcular la cuota de apartamento1");
		System.out.println("Cueta de apartamento1: " + apartamento1.calcularCuota());
		System.out.println("---------------------------------\n");
		
		System.out.println("Calcular la cuota de casa con jardin y piscina");
		Casa casaPiscinaJardin = new Casa("Calle Maria", 40, null, true, true);
		System.out.println("Cueta de casa con Piscina y jardin: " + casaPiscinaJardin.calcularCuota());
		System.out.println("---------------------------------\n");
		
		System.out.println("Calcular la cuota de casa con jardin");
		Casa casaJardin = new Casa("Calle Maria", 40, null, false, true);
		System.out.println("Cueta de casa con jardin: " + casaJardin.calcularCuota());
		
		
	}

}
