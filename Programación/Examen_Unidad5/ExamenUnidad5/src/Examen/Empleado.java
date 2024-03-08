package Examen;

public abstract class Empleado implements Imprimible {

	
	//Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	protected double sueldoBase;
	
	
	//Constructores
	public Empleado(String dni, String nombre, String apellidos, double sueldoBase) {
		super();
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.sueldoBase = 0d;
	}


	//Getters y Setters
	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}
	
	
	//Métodos
	public String mostrarDatos() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nDNI: ").append(this.dni);
		sb.append("\nNombre: ").append(this.nombre);
		sb.append("\nApellidos: ").append(this.apellidos);
		sb.append("SueldoBase: ").append(this.sueldoBase);
		
		return mostrarDatos();
	}
	
	
	
}
