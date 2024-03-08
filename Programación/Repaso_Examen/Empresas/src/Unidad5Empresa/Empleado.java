package Unidad5Empresa;

public class Empleado {

	
	//ATributos
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;
	
	//Constructores
	public Empleado(String nombre, String apellidos, String dni, double sueldoBruto, int edad, String telefono,
			String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Empleado(String nombre, String apellidos, String dni, double sueldoBruto) {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
		this.sueldoBruto = 0d;
	}
	
	//Getters and Setters

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

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

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}
	
	public double sueldoNeto() {
		double sueldoNeto = 0d;
		
		if (this.sueldoBruto < 12000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.2);
		}else if (this.sueldoBruto > 12000 && this.sueldoBruto < 15000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.3);
		}else if (this.sueldoBruto > 25000) {
			sueldoNeto = this.sueldoBruto - (this.sueldoBruto * 0.4);
		}
		
		return sueldoNeto;
	}
	
	public String devolverInfoString () {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNombre: ").append(this.nombre);
		sb.append("\nApellidos: ").append(this.apellidos);
		sb.append("\nDNI: ").append(this.dni);
		sb.append("\nSueldoBruto: ").append(this.sueldoBruto);
		sb.append("\nEdad: ").append(this.edad);
		sb.append("\nTelefonos: ").append(this.telefono);
		sb.append("\nDireccion: ").append(this.direccion);

		return sb.toString();
	}
	
	

		
		
}
