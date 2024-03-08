package Examen;

public class EmpleadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plantilla plantilla = new Plantilla();
	
	/*	// Crear y contratar un técnico de categoría 1 llamado Alejandro Fernández
		//con dni 11111111H y con 1000 de sueldo base
		plantilla.contratarEmpleado() = new Tecnico("11111111H", "Alejandro", "Fernandez", 1000, 1);
		
		
		// Crear y contratar una técnico de categoría 2 llamada Jerónima Jiménez con
		//dni 22222222J y con 1000 de sueldo base
		plantilla.contratarEmpleado() = new Tecnico("22222222J", "Jerónima", "Jiménez",1000, 2);
		
*/
		// Crear y contratar un comercial llamado Desiderio Durán con dni 33333333P
		// y con 800 de sueldo base. Establecer sus ventas a 2000
		Comercial comercial = new Comercial("33333333P", "Desiderio", "Durán", 800);
		comercial.setVentas(2000);
		plantilla.contratarEmpleado(comercial);
		
		plantilla.mostrarDatos();

		
	}

}
