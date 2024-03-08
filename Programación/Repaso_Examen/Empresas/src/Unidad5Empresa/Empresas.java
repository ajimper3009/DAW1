package Unidad5Empresa;

public class Empresas {

	//Atributos
	private String nombre;
	private String cif;
	private String telefono;
	private String direccion;
	private Empleado[] empleados;
	
	//Constructores
	public Empresas(String nombre, String cif, String telefono, String direccion, Empleado[] empleados) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.telefono = telefono;
		this.direccion = direccion;
		this.empleados = new Empleado[100];
		for (int i = 0; i < this.empleados.length; i++) {
			this.empleados[i] = empleados[i];
		}
	}


	public Empresas(String nombre, String cif) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.telefono = "";
		this.direccion = "";
		this.empleados = new Empleado[100];
	}


	//Getters and Setters
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Empleado[] getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCif() {
		return cif;
	}
	
	
	
	public void añadirEmpleados (Empleado empleado) {
		boolean añadir = false;
		int i = 0;
		while (!añadir && i < this.empleados.length) {
			if (null != this.empleados[i]) {
				this.empleados[i] = empleado;
				añadir = true;
				
			}
			i++;
		}
	}
	
	public void eliminarEmpleados(String dniEmpleado) {
		boolean eliminar = false;
		int i = 0;
		
		while (!eliminar && i < this.empleados.length) {
			if (null != this.empleados[i] && null != this.empleados[i].getDni() && this.empleados[i].getDni().equals(dniEmpleado)) {
				this.empleados[i] = null;
				eliminar = true;
				
			}
			i++;
		}
	}
	
	public void infoEmpleados () {
		int i = 1;
		System.out.println("Nombre de la empresa: " + getNombre());
		System.out.println("Lista de Empleados: ");
		for (Empleado empleado : this.empleados) {
			if (null != empleado) {
				i++;
				System.out.println(empleado.devolverInfoString());
			}
		}
		
	}
	
	public void dniSueldoBrutoNeto () {
		int i = 1;
		System.out.println("Nombre de la empresa: " + getNombre());
		for (Empleado empleado : this.empleados) {
			if (null != empleado) {
				System.out.println("DNI: " + empleado.getDni());
				System.out.println("DNI: " + empleado.getSueldoBruto());
				System.out.println("DNI: " + empleado.sueldoNeto());
			}
		}
		
		
		
	}
	
	public double totalBruto () {
		double sumaBruto = 0d;
		for (Empleado empleado : this.empleados) {
			if (null != empleado) {
				sumaBruto += empleado.getSueldoBruto();
				
			}
		}
		
		return sumaBruto;
	}
	
	
	public double totalNeto () {
 		double sumaNeto = 0d;
 		for (Empleado empleado : empleados) {
			if (null != empleado) {
				sumaNeto =+ empleado.sueldoNeto();
			}
		}
 		
 		
 		return sumaNeto;
	}
	
}
