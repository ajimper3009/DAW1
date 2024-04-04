package examenes.ExamenRecuMarzo.RecuperacionMarzo.src.inmobiliaria;

public class Propietario {

	//Atributos
	private String nombreCompleto;
	private String dni;
	
	//Constructores
	public Propietario(String nombreCompleto, String dni) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}

	
	//Getters and Setters
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre completo: ").append(this.nombreCompleto);
		sb.append("DNI: ").append(this.dni);
		
		return sb.toString();
	}
	
	
}
