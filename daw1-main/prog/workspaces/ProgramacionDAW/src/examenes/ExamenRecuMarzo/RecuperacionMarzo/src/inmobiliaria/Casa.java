package inmobiliaria;

public class Casa extends Vivienda{

	private boolean piscina;
	private boolean jardin;

	
	
	
	
	//Constructores
	public Casa(String direccion, int numeroMetrosCuadrados, Propietario[] propietario, boolean piscina, boolean jardin) {
		super(direccion, numeroMetrosCuadrados, propietario);
		// TODO Auto-generated constructor stub
		this.piscina = piscina;
		this.jardin = jardin;
	}
	

	//Métodos
	@Override
	public double calcularCuota() {
		
		double cuotaCasa = 0d;
		cuotaCasa = (this.getNumeroMetrosCuadrados() * 1.5);
			if (this.piscina == true && this.jardin == true) {
				cuotaCasa = (this.getNumeroMetrosCuadrados() * 1.5 + 45);
				return cuotaCasa;
			}else if (this.piscina == true && this.jardin == false) {
				cuotaCasa = (this.getNumeroMetrosCuadrados() * 1.5 + 30);
				return cuotaCasa;
			}else if(this.piscina == false && this.jardin == true) {
				cuotaCasa = (this.getNumeroMetrosCuadrados() * 1.5 + 30);
				return cuotaCasa;
			}
		
		return cuotaCasa;
	}
	
	public String devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append("¿Contiene piscina?: ").append(this.piscina);
		sb.append("\n¿Contiene jardin?: ").append(this.jardin);
		
		return sb.toString();
	}
	
}
