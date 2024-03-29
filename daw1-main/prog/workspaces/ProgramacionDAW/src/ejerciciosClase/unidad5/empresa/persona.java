package ejerciciosClase.unidad5.empresa;

import ejerciciosClase.unidad5.cuentaBancarias.Imprimible;

public class persona implements Imprimible{
	
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Constructores
	public persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		
	}

	//Getters and Setters
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append("\nNombre: " + this.nombre);
		result.append("\nApellidos: " + this.apellidos);
		result.append("\nDNI: " + this.dni);
		return this.toString();
	}

	public boolean equals(persona per1) {
		
		return this.dni.equalsIgnoreCase(per1.dni);
			
		
	}
	
	
}
