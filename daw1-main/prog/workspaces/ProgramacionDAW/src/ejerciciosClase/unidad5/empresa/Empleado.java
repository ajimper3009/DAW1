package ejerciciosClase.unidad5.empresa;

import ejerciciosClase.unidad5.persona.Persona;

public class Empleado extends persona {



	//Atributos
	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;
	
	
	//Contructores
	public Empleado(String nombre, String apellidos, String dni, double sueldoBruto, int edad, String telefono, String direccion) {
		super(nombre, apellidos, dni);
		// TODO Auto-generated constructor stub
		this.sueldoBruto = sueldoBruto;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		
	
		Persona per1 = new Persona (nombre,apellidos,dni);
			per1.getNombre();
			per1.getDni();
			per1.toString();
	}
	
	public Empleado(String nombre, String apellidos, String dni, double sueldoBruto) {
		super(nombre, apellidos, dni);
		this.sueldoBruto = sueldoBruto;
	}
	

	//Getters and Setters
	
	/**
	 * @return the sueldoBruto
	 */
	public double getSueldoBruto() {
		return sueldoBruto;
	}


	/**
	 * @param sueldoBruto the sueldoBruto to set
	 */
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\nSueldo Bruto: ").append(this.sueldoBruto);
		result.append("\nEdad: ").append(this.edad);
		result.append("\nTeléfono: ").append(this.telefono);
		result.append("\nDirección: ").append(this.direccion);
		
		return result.toString();
	}
	

	public double calcularSueldoNeto() {
		
		double sueldoNeto = 0d;
		if (this.sueldoBruto < 12.000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.2);
		} else if (this.sueldoBruto > 12.000 && this.sueldoBruto < 25.000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.3);
		}else if (this.sueldoBruto > 25.000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.4);
		}
		
		return sueldoNeto;
		
		
	}
	
	
	
	
}
