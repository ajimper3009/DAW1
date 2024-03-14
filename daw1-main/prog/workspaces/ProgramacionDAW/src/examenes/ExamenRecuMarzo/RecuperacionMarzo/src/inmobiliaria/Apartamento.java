package inmobiliaria;

public class Apartamento extends Vivienda {

	//Atributos
	private int piso;
	private char puerta;
	
	//Constructores
	public Apartamento(String direccion, int numeroMetrosCuadrados, Propietario[] propietario, int piso, char puerta) {
		super(direccion, numeroMetrosCuadrados, propietario);
		this.piso = piso;
		this.puerta = puerta;
		
		
	}
	
	//Getters y Setters
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}




	//Métodos
	@Override
	public double calcularCuota() {
		double cuotaApartamento = 0d;
		
		cuotaApartamento = (this.getNumeroMetrosCuadrados() * 1.2);
		
		return cuotaApartamento;
	}
	
	public String devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número del piso: ").append(this.piso);
		sb.append("\nLetra de la Puerta: ").append(this.puerta);
		
		return sb.toString();
	}
}
