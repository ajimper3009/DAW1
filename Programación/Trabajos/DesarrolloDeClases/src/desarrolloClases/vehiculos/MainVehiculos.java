package desarrolloClases.vehiculos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainVehiculos {

	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta bici = new Bicicleta();
		bici.andar(8.9);
		Coche coche = new Coche(1800);
		int opcion=0;
		do {
			System.out.println("1. Anda con la bicicleta\r\n"
					+ "2. Haz el caballito con la bicicleta\r\n"
					+ "3. Anda con el coche\r\n"
					+ "4. Quema rueda con el coche\r\n"
					+ "5. Ver kilometraje de la bicicleta\r\n"
					+ "6. Ver kilometraje del coche\r\n"
					+ "7. Ver kilometraje total\r\n"
					+ "8. Salir\r\n"
					+ "Elige una opción (1-8):\r\n");
			opcion = getInterger();
			switch (opcion) {
			case 1:
				bici.andar(getInterger());
				break;
			case 2:
				bici.HacerCaballito(getInterger());
				break;
			case 3:
				coche.andar(getInterger());
				break;
			case 4:
				coche.quemarRueda(getInterger());
				break;
			case 5:
				System.out.println(bici.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(coche.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(Vehiculo.kilometrosTotales);
				break;
			case 8:
				System.out.println("Adiós!");
				break;
			default:
				System.err.println("Debe introducir un valor valido");
				break;
			}
			
			
			
		} while (opcion != 8);
			bici.andar(8.9);
	}
	
	private static int getInterger () {
		boolean correcto = false;
		int result = 0;
		while (!correcto) {
		try {
			result = scan.nextInt();
			correcto = true;
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un número");
			
			}
		}
		return result;
	}
}
