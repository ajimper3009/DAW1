package ejerciciosClase.unidad5.cuentaBancarias;

import java.util.Scanner;

public class CuentasBancariasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		
		String [] entidades = new String[5];
		entidades [0] = "netflix";
		entidades [1] = "endesa";
		entidades [2] = "moviestar";
	CuentaCorrientePersonal ccp = new CuentaCorrientePersonal("Ana","Sainz","22222222A",1000d,"ES0000000000000", entidades, 0d);
	System.out.println(ccp.devolverInfoString());
	CuentaAhorro cAhorro1 = new CuentaAhorro("Ana", "Sáinz Núñez", "44052327J", 1000d, "ES0000000000000000000000", 3.6, 4.6);
	banco.abrirCuenta(cAhorro1);
	banco.abrirCuenta(ccp);
	int contador = 0;
	for (CuentaBancaria cuenta : banco.listadoCuentas()) {
		if (null != cuenta) {
			System.out.println("--------- " + ++contador + "---------");
			System.out.println(cuenta);
		}
	}
	Scanner scan = new Scanner(System.in);	
	boolean salir = false;
	do {
		System.out.println("Elije una opcion\n");
		
		System.out.println("1. Abrir una nueva cuenta.\n"
							+ "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual)\n"
							+ "3. Obtener los datos de una cuenta concreta.\n"
							+ "4. Realizar un ingreso en una cuenta.\n"
							+ "5. Retirar efectivo de una cuenta.\n"
							+ "6. Consultar el saldo actual de una cuenta.\n"
							+ "7. Salir de la aplicación.");
		int opcion = scan.nextInt();
		switch (opcion) {
			
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				salir = true;
				System.out.println("Gracias por utilizar nuestro programa");
				
				break;

			default:
				break;
			}
		} while (!salir);

	}


	
}
