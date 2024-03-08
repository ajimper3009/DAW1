package Examen;

public class Plantilla implements Imprimible{

	//Atributos
	private Empleado[] empleados;

	//Constructores
	public Plantilla() {
	}
	
	
	
	//Métodos
	public void contratarEmpleado (Empleado empleados) {
		int i = 0;
		boolean contaratar = false;
		while (!contaratar && i < this.empleados.length) {
			if (null != this.empleados) {
				
				//Para seguir con este método, que agrega empleados a la 
				//array de Empleados se agregaria un empleado en dicha array 
				//y se incrementaria la variante i
			}
			i++;
		}
	
		
	}
	
	public String getEmpleadosPorNombre (String nombre) {
		int i = 0;
		System.out.println("Lista de empleados: ");
		i++;
		for (Empleado empleado : empleados) {
			if (null != empleado) {
				empleado.mostrarDatos();
			}
		}
		return mostrarDatos();
		
	}
	
}
