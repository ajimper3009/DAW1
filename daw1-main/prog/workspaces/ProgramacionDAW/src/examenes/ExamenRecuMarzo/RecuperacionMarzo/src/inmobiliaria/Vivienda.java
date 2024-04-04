package examenes.ExamenRecuMarzo.RecuperacionMarzo.src.inmobiliaria;

public abstract class Vivienda implements Hipotecable {

	//Atributos
	private String direccion;
	private int numeroMetrosCuadrados;
	private Propietario [] propietario;
	
	//Constructores
	public Vivienda(String direccion, int numeroMetrosCuadrados, Propietario[] propietario) {
		super();
		this.direccion = direccion;
		this.numeroMetrosCuadrados = numeroMetrosCuadrados;
		this.propietario = new Propietario [10];
	}

	//Getters y Setters
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getNumeroMetrosCuadrados() {
		return numeroMetrosCuadrados;
	}

	public void setNumeroMetrosCuadrados(int numeroMetrosCuadrados) {
		this.numeroMetrosCuadrados = numeroMetrosCuadrados;
	}

	public Propietario[] getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario[] propietario) {
		this.propietario = propietario;
	}
	
	//Métodos
	public abstract double calcularCuota();
	
	public String devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Direccion: ").append(this.direccion);
		sb.append("Número de m2: ").append(this.numeroMetrosCuadrados);
		sb.append("Propietario: ").append(this.propietario);
		
		
		return sb.toString();
		
	}
}
