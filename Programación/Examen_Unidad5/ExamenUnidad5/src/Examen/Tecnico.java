package Examen;

public class Tecnico extends Empleado{


	private int categoria;
	
	public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categora) {
		super(dni, nombre, apellidos, sueldoBase);
		// TODO Auto-generated constructor stub
	}
	
	
	public double calcularSueldoTecnico () {
		double sueldoTecnico = 0d;
		
		sueldoTecnico = this.sueldoBase * (this.categoria * 100);
		
		
		return sueldoTecnico;
	}
	
	public String mostrarDatosTecnico() {
		StringBuilder sb = new StringBuilder();
		sb.append("Categoria: ").append(this.categoria);
		
		return sb.toString();
		
	}
	

	
	
}
