package Examen;

public class Comercial extends Empleado {

	//Atributos
	private double ventas;
	
	//Constructores
	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
		// TODO Auto-generated constructor stub
	}

	
	//Geters y setters
	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double calcularSueldoComercial () {
		double sueldoComercial = 0d;
		
		sueldoComercial = this.sueldoBase * (0.1 * this.ventas);
		
		
		return sueldoComercial;
	}
	
	
	//Métodos
	public String mostrarDatosComercial() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ventas: ").append(this.ventas);
		
		return mostrarDatos();
		
	}
	
	
	
}
