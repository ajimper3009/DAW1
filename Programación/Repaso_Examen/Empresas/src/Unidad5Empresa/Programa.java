package Unidad5Empresa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado Paco = new Empleado ("Paco", "Jimenez", "11111111G", 16500);
		Empleado Juana = new Empleado ("Juana", "Jimenez", "11111111G", 16500);
		Empleado Ana = new Empleado ("Ana", "Jimenez", "11111111G", 16500);
		Empleado[] empleados = { Paco, Juana, Ana};
		Empresas zara = new Empresas("Zara", "00000000B", "900100200", "Calle Gran Vía 12, Madrid", empleados);
		
		zara.infoEmpleados();
		
		
	}

}
